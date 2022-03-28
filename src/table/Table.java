package table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//create connection first
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String url= "jdbc:mysql://localhost:3306/table1";
			String User ="root";
			String Password = "User@684";
			
			Connection con = DriverManager.getConnection(url,User,Password);
			
			// create a query 
			
			String query = "CREATE TABLE table1(tID int(20) primary key auto_increment, tName VARCHAR(30) NOT NULL, tCity VARCHAR(30))";
			
			// create a statement to execute query 
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			
			// to check if above code is working we can add an print stmt
			System.out.println("table created successfully");
			
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
}
