package lab5;

import java.io.Serializable;

public class Book implements Item, Serializable{
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
public void setReleaseYear(int releaseYear) {
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
