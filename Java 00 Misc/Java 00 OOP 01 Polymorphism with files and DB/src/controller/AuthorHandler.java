//https://github.com/fernandocc17, July 2016.
package controller;
import java.util.ArrayList;
import java.util.List;
import model.Author;
//this interface defines the methods used to store and retrieves authors.
public interface AuthorHandler {
	//Remember that every class member defined on an interface will have by default the public final modifiers.
	//authors is final but it can add and remove object to it.
	List<Author> authors=new ArrayList<Author>();
	boolean insertAuthor(Author author);
	List<Author> showAuthors();
}