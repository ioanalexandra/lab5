package lab5_maven;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Item, Serializable {
	private String author;
	protected String name;
	protected String path;
	private int releaseYear;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) throws IncorrectYearException {
		if (releaseYear < 0 || releaseYear > Calendar.getInstance().get(Calendar.YEAR)) {// anul e incorect daca e mai
																							// mic decat 0 si mai mare
																							// decat anul curent
			throw new IncorrectYearException("Incorrect year");
		} else
			this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {

		return "Book" + " name:" + name + " author:" + author + " release year:" + releaseYear + " ";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getPath() {
		return path;
	}

	@Override
	public void setPath(String path) {
		this.path = path;

	}

}
