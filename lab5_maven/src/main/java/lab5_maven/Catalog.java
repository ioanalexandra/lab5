package lab5_maven;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7500311530566160439L;
	private List<Item> items = new ArrayList<>();
	private String path;
	private String name;

	public String getName() {
		return name;
	}

	public void addItem(Item m) {
		items.add(m);
	}

	public Catalog(String s1, String s2) {
		name = s1;
		path = s2;
	}

	public List<Item> getItems() {
		return items;
	}

	public void list() {
		for (int i = 0; i < items.size(); ++i) {
			System.out.print(items.get(i));
		}
		System.out.println();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@SuppressWarnings("unchecked")
	// functia load,tratand exceptiile posibile - daca primeste un path gresit sau
	// fisierul nu exista
	public void load(String path) {

		FileInputStream fis;
		ObjectInputStream in;
		try {
			Paths.get(path);
			fis = new FileInputStream(path);
			in = new ObjectInputStream(fis);
			items = (ArrayList<Item>) in.readObject();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InvalidPathException e) {
			e.printStackTrace();
		}

	}

	// functia save,tratand exceptiile posibile - daca primeste un path gresit sau
	// fisierul nu exista

	public void save(String path) throws ClassNotFoundException {

		FileOutputStream fos;
		ObjectOutputStream out;
		try {
			Paths.get(path);
			fos = new FileOutputStream(path);
			out = new ObjectOutputStream(fos);
			out.writeObject(items);
			out.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
		} catch (InvalidPathException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Catalog [items=" + items.size() + ", path=" + path + ", name=" + name + "]";
	}

	public void play() {// functie care deschide fisierul cu aplicatia default pentru tipul respectiv
		File f = new File(path);
		try {
			Desktop.getDesktop().open(f);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
