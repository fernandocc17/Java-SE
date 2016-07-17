//https://github.com/fernandocc17, July 2016.
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Author;
public class AuthorDBHandler implements AuthorHandler {
	protected Connection con=null;
	@Override
	public boolean insertAuthor(Author author) {
		connect();
		String sql="INSERT INTO author(first_name,last_name1,last_name2) values (?,?,?)";
		PreparedStatement st = null;
		try {
			st = con.prepareStatement(sql);
			st.setString(1, author.getFirstName());
			st.setString(2, author.getLastName1());
			st.setString(3, author.getLastName2());
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		disconnect();
		return true;
	}
	@Override
	public List<Author> showAuthors() {
		//deleting previously added authors (from previous readings)
		authors.clear();
		connect();
		PreparedStatement statement=null;
		ResultSet rs=null;
		try {
			statement=con.prepareStatement("SELECT *FROM AUTHOR");
			rs=statement.executeQuery();
			while (rs.next()){
				Author temp=new Author();
				temp.setFirstName(rs.getString("first_name"));
				temp.setLastName1(rs.getString("last_name1"));
				temp.setLastName2(rs.getString("last_name2"));
				authors.add(temp);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally{
			try {
				rs.close();
				statement.close();
			} catch (SQLException e) {
			 e.printStackTrace();
			}
		}
		disconnect();
		return authors;
	}
	public boolean connect(){
		  String url = "jdbc:mysql://localhost:3306/";
		  String db = "library";
		  String user = "root"; 
		  String pass = "12345";
		try {
			con=DriverManager.getConnection(url +db, user, pass);
			con.setAutoCommit(true);
			System.out.println("Connected");
			return true;
		} catch (SQLException e) {
			System.out.println("Not able to connect");
			return false;
		}
	}
	public boolean disconnect(){
		try {
			if(!con.isClosed()){
				con.close();
				System.out.println("Disconnected");
			}
		} catch (SQLException e) {
		}finally{
			con=null;
		}
		return false;
	}
}