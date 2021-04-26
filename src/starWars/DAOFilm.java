package starWars;
import java.sql.*;

public class DAOFilm {

	String strClassName = "com.mysql.jdbc.Driver";
	String dbName= "starwars"; 
	String login= "root"; 
	String motdepasse= ""; 
	String strUrl = "jdbc:mysql://127.0.0.1/" +  dbName;
	
	public DAOFilm(String strUrl, String login, String motdepasse) {
		this.strUrl=strUrl;
		this.login=login;
		this.motdepasse=motdepasse;
		try {
		Connection conn = DriverManager.getConnection(strUrl, login, motdepasse);
		Statement stAddUser = conn.createStatement();  
		}
		catch(SQLException e) {
			System.err.println(" erreur !");  e.printStackTrace();
		}
	}
	
	public void fermerStatement() {
		
	}
}
