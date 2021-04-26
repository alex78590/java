package starWars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		
		try { 
			
			Scanner sc = new Scanner(System.in);
			System.out.println("titre du film");
			String input = sc.nextLine();
			sc.close();
			String strClassName = "com.mysql.jdbc.Driver";
			String dbName= "starwars"; 
			String login= "root"; 
			String motdepasse= ""; 
			String strUrl = "jdbc:mysql://127.0.0.1/" +  dbName;

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			Statement stAddUser = conn.createStatement();  
			stAddUser.executeUpdate("delete from Film where titre=\""+input+"\"");
			
			conn.close();
			}
			catch(ClassNotFoundException e) {  
				System.err.println("Driver non chargé !");  e.printStackTrace();
			} catch(SQLException e) {
				System.err.println("Autre erreur !");  e.printStackTrace();
			}

		
		
	}
}
