package starWars;
import java.sql.*;

public class DAOFilm {

	String strClassName = "com.mysql.jdbc.Driver";
	String dbName= "starwars"; 
	String login= "root"; 
	String motdepasse= ""; 
	String strUrl = "jdbc:mysql://127.0.0.1/" +  dbName;
	Connection conn = null;
	Statement stFilm = null;  
	
	public DAOFilm(String strUrl, String login, String motdepasse, Connection conn, Statement stFilm) {
		this.strUrl=strUrl;
		this.login=login;
		this.motdepasse=motdepasse;
		try {
		this.conn = DriverManager.getConnection(strUrl, login, motdepasse);
		this.stFilm = conn.createStatement();  
		}
		catch(SQLException e) {
			System.err.println(" erreur !");  e.printStackTrace();
		}
	}
	
	public void fermerStatement() {
		try {
		this.conn.close();
	}
		catch(SQLException e) {
			System.err.println(" erreur !");  e.printStackTrace();
		}
	}
	
	public void lister() {
		try {
		ResultSet rsFilms = this.stFilm.executeQuery("select * from Film"); 
		while(rsFilms.next()) {
			System.out.print("Id[" + rsFilms.getInt("id") + "],"
			+ rsFilms.getString("titre")
			+ rsFilms.getString("sortie")+","
			+ rsFilms.getInt("numero")+","
			+ rsFilms.getInt("cout")+","
			+ rsFilms.getInt("recette")+"\n"); }  
		fermerStatement();
		
		}
		catch(SQLException e) {
			System.err.println(" erreur !");  e.printStackTrace();
		}
	}
	
	
	
	public void main(String[] args) {
		lister();
	}
}
