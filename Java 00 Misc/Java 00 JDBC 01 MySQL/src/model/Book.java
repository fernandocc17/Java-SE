//https://github.com/fernandocc17, July 2016.
package model;
public class Book {
private String bookID;
private String title;
private int authorID;
public String getBookID() {
	return bookID;
}
public void setBookID(String bookID) {
	this.bookID = bookID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getAuthorID() {
	return authorID;
}
public void setAuthorID(int authorID) {
	this.authorID = authorID;
}
}