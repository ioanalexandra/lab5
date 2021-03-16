package lab5;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.testCreateSave();
		app.testLoadView();
	}

	private void testCreateSave() {
		Catalog catalog = new Catalog("My Books", "d:/media/catalog.ser");
		var img = new Image();
		var book = new Book();
		book.setAuthor("Ion Creanga");
		book.setName("Amintiri din copilarie");
		book.setReleaseYear(1892);
		img.setName("Stelute");
		img.setResolution("360px");
		img.setSize("1mb");
		catalog.addItem(img);
		catalog.addItem(book);
		try {
			catalog.save("C:\\Users\\alexa\\Desktop\\lab5\\book.txt");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	private void testLoadView() {
		Catalog catalog = new Catalog("Books", "C:\\Users\\alexa\\Desktop\\lab5\\book.txt");
		catalog.load("C:\\Users\\alexa\\Desktop\\lab5\\book.txt");
		catalog.list();
		catalog.play();
	}
}
