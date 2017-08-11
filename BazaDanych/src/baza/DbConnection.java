package baza;

import java.sql.*;

public class DbConnection {
	
	// url polaczenia z localhost (nazwaSterownika://adres/nazwaBazy)
	final static String connectionURL = "jdbc:mysql://localhost:3306/skoczkowie";
	final static String name = "root";
	final static String pass = "kurs";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//rejestracja klasy sterownika
		Class.forName("com.mysql.jdbc.Driver");
		//utworzenie polaczenia
		Connection con = DriverManager.getConnection(connectionURL, name, pass);
		//utworzenie wyrazenia SQL
		Statement stmt = con.createStatement();
		//wykonanie zapytania
		ResultSet rs=stmt.executeQuery("select * from zawodnicy");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+ " "+ rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+ rs.getInt(6)+" "+rs.getInt(7));
			//zamkniecie polaczenia
	
		}
		con.close();
	
	}

}
