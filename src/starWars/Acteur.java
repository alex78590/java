package starWars;

import java.util.Vector;

public class Acteur {

	String nom;
	String prenom;
	Vector<Personnage> duet = new Vector<Personnage>();
	
	
	public Acteur(String n, String p,Vector<Personnage> l) {
		this.nom=n;
		this.prenom=p;
		this.duet=l;
			
	}




	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public Vector<Personnage> getListPersonnage() {
		return duet;
	}



	public void setListPersonnage(Vector<Personnage> listPersonnage) {
		this.duet = listPersonnage;
	}



	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + ", listFilm=" + duet + "]";
	}


	public int nbPersonnage() {
		int nombre = this.duet.size();
		return nombre;
	}
	
	
	
}
