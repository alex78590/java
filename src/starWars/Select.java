package starWars;
import java.sql.*;


public class Select {

	
	
	public static void main(String[] args) {
		
		try { 
			String strClassName = "com.mysql.jdbc.Driver";
			String dbName= "starwars"; 
			String login= "root"; 
			String motdepasse= ""; 
			String strUrl = "jdbc:mysql://127.0.0.1/" +  dbName;

			Class.forName(strClassName);
			Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
			Statement stUsers = conn.createStatement();  

			ResultSet rsUsers = stUsers.executeQuery("select * from Film");  
			while(rsUsers.next()) {
				System.out.print("Id[" + rsUsers.getInt("id") + "],"
				+ rsUsers.getString("titre")
				+ rsUsers.getString("sortie")+","
				+ rsUsers.getInt("numero")+","
				+ rsUsers.getInt("cout")+","
				+ rsUsers.getInt("recette")+"\n"); }  
			conn.close();
			}
			catch(ClassNotFoundException e) {  
				System.err.println("Driver non chargé !");  e.printStackTrace();
			} catch(SQLException e) {
				System.err.println("Autre erreur !");  e.printStackTrace();
			}

		
		
	}
}

