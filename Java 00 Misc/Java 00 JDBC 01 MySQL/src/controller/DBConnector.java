//https://github.com/fernandocc17, July 2016.
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public abstract class DBConnector {
	protected Connection con=null;
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