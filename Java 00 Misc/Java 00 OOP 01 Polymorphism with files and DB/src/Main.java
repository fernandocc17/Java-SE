//https://github.com/fernandocc17, July 2016.
import java.util.Iterator;
import java.util.Scanner;
import model.Author;
import controller.AuthorDBHandler;
import controller.AuthorFileHandler;
import controller.AuthorHandler;
public class Main {
	public static void main (String[] args){
		final int SHOW=1;
		final int INSERT=2;
		final int EXIT=3;
		int opc=0;
		int optionChooser;
		boolean insertResult;
		//using ah as a reference variable of the interface AuthorHandler
		AuthorHandler ah=null;
		Scanner sc=new Scanner (System.in);
		System.out.println("1)DB Option");
		System.out.println("2)File Option");
		optionChooser=sc.nextInt();
		if(optionChooser==1){
			//Everything will he handled by the DB object
			ah=new AuthorDBHandler();
		}
		else if(optionChooser==2){
			//Everything will he handled by the "file system"
			ah=new AuthorFileHandler();
		}//if the user didnt select a valid option, it will terminate the program to avoid a NPE.
		else {
			System.exit(1);
		}
		//Please note that from here on, the user selection is transparent to the rest of the app, each method will be handled correctly by the virtual method invocation.
		do{
			System.out.println("Menu");
			System.out.println("1)Show all authors");
			System.out.println("2)Insert new author");
			System.out.println("3)Exit");
			opc=sc.nextInt();
			switch (opc){
			case SHOW:	
				Iterator<Author> it=ah.showAuthors().iterator();	
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
				insertResult=ah.insertAuthor(a);
				if(insertResult){
					System.out.println("INSERTED SUCCESFULLY");
				}else{
					System.out.println("NOT INSERTED");
				}
				break;
			case EXIT:
				System.out.println("Bye");
			default:
				System.out.println("Wrong option");
			}
		}while(opc!=EXIT);		
	}
}