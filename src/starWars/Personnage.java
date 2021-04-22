package starWars;

public class Personnage {

	String nom;
	String prenom;
	
	public Personnage(String n, String p) {
		this.nom = n;
		this.prenom = p;
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
		return "Personnage [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
