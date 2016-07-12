//https://github.com/fernandocc17, July 2016.
package controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Author;
//This is just a example code and is not necessarily the best way to do it.
public class DBAuthorHandler extends DBConnector{
	//dealing with all the exception one by one here
	public ArrayList<Author> showAuthors(){
		//Calling the method on the DBConnector class to get a connection to the DB
		connect();
		//this object allows DB operations using the connection object.
		Statement statement=null;
		//This is the object where we will store the DB rows,it comes as a matrix with the fields names as a header
		ResultSet rs=null;
		ArrayList<Author> authors =new ArrayList<Author>();
		try {
			//now this object is actually connected to the DB.
			statement=con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			//Getting all the authors
			rs=statement.executeQuery("SELECT *FROM AUTHOR");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			//Getting row by row the results
			while (rs.next()){
				//Creating a temporary author variable to get the DB result
				Author temp=new Author();
				//Setting the values on the temp object
				temp.setAuthorID(rs.getInt("author_id"));
				//this can also be done with rs.getXXX and the column index
				temp.setFirstName(rs.getString("first_name"));
				temp.setLastName1(rs.getString("last_name1"));
				temp.setLastName2(rs.getString("last_name2"));
				
				//Storing the result object on the ArrayList
				authors.add(temp);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		//Closing the ResultSet
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Closing the statement
		try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//releasing the DB connection; we should only connect while performing a DB operation and afterwards we should immediately disconnect to avoid wasting DB resources.
		disconnect();
		//Returning the ArrayList with all the DB rows as object
		return authors;
	}
	//propagating the exceptions
	public void updateAuthor(int id,String nombre) throws SQLException{
		connect();
		//Linking the statement to the connection 
		Statement st=con.createStatement();
		//Building manually the statement, this is not a good practice
		String sql="UPDATE author SET first_name='"+ nombre+ "' WHERE author_id="+id;
		//Executing the statement on the string
		st.execute(sql);
		st.close();
		disconnect();
	}
	public boolean deleteAuthor(int id) {
		connect();
		PreparedStatement ps=null;
		try{
			//The preparedStatement avoids SQL inyection
			//The ? means that we will provide the value later on
			ps=con.prepareStatement("DELETE FROM author WHERE author_id =?");
			//Providing the value for ? with setXXX(one for each type), the indexes start at 1(not 0 like everything else)
			ps.setInt(1, id);
			//Executing the statement , execute is for anything not related to a query
			ps.execute();
			//if the author was successfully deleted it will return true
			return true;
		}catch (Exception e){
			//If any exception is caught it will return false.
			return false;
		}
		finally{
			//releasing all resources no matter what.
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			disconnect();
		}
	}
	//propagating the exceptions
	public void insertAuthor(Author a) throws SQLException{
		connect();
		String sql="INSERT INTO author(first_name,last_name1,last_name2) values (?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, a.getFirstName());
		st.setString(2, a.getLastName1());
		st.setString(3, a.getLastName2());
		st.execute();
		st.close();
		disconnect();
	}
}