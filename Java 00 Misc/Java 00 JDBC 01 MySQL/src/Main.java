//https://github.com/fernandocc17, July 2016.
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Author;
import controller.DBAuthorHandler;
public class Main {
	public static void main (String[] args){
		final int SELECT=1;
		final int INSERT=2;
		final int DELETE=3;
		final int UPDATE=4;
		final int EXIT=5;
		int opc=0;
		DBAuthorHandler authorHandler=new DBAuthorHandler();
		Scanner sc=new Scanner (System.in);
		do{
			System.out.println("Menu");
			System.out.println("1)Authors");
			System.out.println("2)Insert new author");
			System.out.println("3)Delete author");
			System.out.println("4)Update author");
			System.out.println("5)Exit");
			opc=sc.nextInt();
			switch (opc){
			case SELECT:	
				List<Author> autores=authorHandler.showAuthors();
				Iterator<Author> it=autores.iterator();	
				while (it.hasNext()){
					System.out.println(it.next().toString());
				}
				break;
			case INSERT:
				Author a=new Author();
				System.out.println("First name,Last name 1 y Last name 2");
				a.setFirstName(sc.next());
				a.setLastName1(sc.next());
				a.setLastName2(sc.next());
				try {
					authorHandler.insertAuthor(a);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case UPDATE:
				System.out.println("Existent ID and new first name");
				int id1=sc.nextInt();
				String n =sc.next();
				try {
					authorHandler.updateAuthor(id1, n);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case DELETE:
				System.out.println("Author ID");
				int id2=sc.nextInt();
				authorHandler.deleteAuthor(id2);
				break;
			case EXIT:
				System.out.println("Bye");
			default:
				System.out.println("Wrong option");
			}
		}while(opc!=EXIT);		
		System.out.println("Now do the book part");
	}
}