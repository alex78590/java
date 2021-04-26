package starWars;
import java.sql.*;

public class Insert {

		
		
		public static void main(String[] args) {
			
			try { 
				String strClassName = "com.mysql.jdbc.Driver";
				String dbName= "starwars"; 
				String login= "root"; 
				String motdepasse= ""; 
				String strUrl = "jdbc:mysql://127.0.0.1/" +  dbName;

				Class.forName(strClassName);
				Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
				Statement stAddUser = conn.createStatement();  
				/* ajouter un film*/
				stAddUser.executeUpdate("insert into Film (titre,sortie,numero,cout,recette) values ('Test2','1995',6,5,22)");
				/* modifier un titre avec l'id du film*/
				stAddUser.executeUpdate("UPDATE film set titre = 'nouveautitre' where id=10");
						
				
				conn.close();
				}
				catch(ClassNotFoundException e) {  
					System.err.println("Driver non chargé !");  e.printStackTrace();
				} catch(SQLException e) {
					System.err.println("Autre erreur !");  e.printStackTrace();
				}

			
			
		}
	}

