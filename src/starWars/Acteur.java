package starWars;

public class Acteur {

	String nom;
	String prenom;
	
	
	public Acteur(String n, String p) {
		this.nom=n;
		this.prenom=p;
			
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


	@Override
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
}
