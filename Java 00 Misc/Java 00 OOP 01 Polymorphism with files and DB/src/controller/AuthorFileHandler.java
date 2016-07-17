//https://github.com/fernandocc17, July 2016.
package controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import model.Author;
public class AuthorFileHandler implements AuthorHandler {
	final String FILE="authors.txt";
	@Override
	public boolean insertAuthor(Author author) {
		FileWriter fw = null;
		PrintWriter pw=null;
		try {
			fw = new FileWriter(FILE,true);
			pw=new PrintWriter (fw);
			//using the toString method to enforce the file structure to read.
			pw.println(author.toString());
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}finally{
			pw.close();
			try {
				fw.close();
			} catch (IOException e) {
			}
		}
		return true;
	}
	@Override
	public List<Author> showAuthors() {
		//deleting previously added authors (from previous readings)
		authors.clear();
		File f=new File(FILE);
		Scanner sc=null;
		try {
			sc=new Scanner(f);
			while(sc.hasNext()){
				//using the other constructor which receives the entire line and parse its.
				authors.add(new Author(sc.next()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			sc.close();
		}
		return authors;
	}
}