package lab5;

import java.io.Serializable;

public class Image implements Item, Serializable{
private String size;
private String name;
private String path;
private String resolution;
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getResolution() {
	return resolution;
}
public void setResolution(String resolution) {
	this.resolution = resolution;
}
@Override
public String toString() {
	return "Image" + " size:" + size + " resolution:" + resolution + " ";
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
