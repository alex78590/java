package starWars;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;


public class Film {

	String titre;
	String annee;
	int numEpisode;
	int cout;
	int recette;
	ArrayList<Acteur> ListeActeurs = new ArrayList<Acteur>();
	
	
	/**
	 
	 * @param t 
	 * represent film title
	 * @param a 
	 * represent film year
	 * @param n
	 * represent film episode number
	 * @param c
	 * represent film cost
	 * @param r
	 * represent film revenue
	 */
	public Film(String t, String a, int n, int c, int r,ArrayList<Acteur> l) {
		this.titre=t;
		this.annee=a;
		this.numEpisode=n;
		this.cout=c;
		this.recette=r;
		this.ListeActeurs=l;
		
	}
	
/**
 * 
 * @return film title
 */
	public String getTitre() {
		return titre;
	}
/**
 * 
 * @param titre
 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
/**
 * 
 * @return film year
 */
	public String getAnnee() {
		return annee;
	}
/**
 * 
 * @param annee
 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}
/**
 * 
 * @return film episode number
 */
	public int getNumEpisode() {
		return numEpisode;
	}
/**
 * 
 * @param numEpisode
 */
	public void setNumEpisode(int numEpisode) {
		this.numEpisode = numEpisode;
	}
/**
 * 
 * @return film cost
 */
	public int getCout() {
		return cout;
	}
/**
 * 
 * @param cout
 */
	public void setCout(int cout) {
		this.cout = cout;
	}
/**
 * 
 * @return film revenue
 */
	public int getRecette() {
		return recette;
	}
/**
 * 
 * @param recette
 */
	public void setRecette(int recette) {
		this.recette = recette;
	}
	
/**
* 
* @return list actors
*/
	
	public ArrayList<Acteur> getListeActeurs() {
		return ListeActeurs;
	}
/**
* 
* @param listeActeurs
*/
	
	public void setListeActeurs(ArrayList<Acteur> listeActeurs) {
		ListeActeurs = listeActeurs;
	}
@Override
public String toString() {
	return "Film [titre=" + titre + ", annee=" + annee + ", numEpisode=" + numEpisode + ", cout=" + cout + ", recette="
			+ recette + ", ListeActeurs=" + ListeActeurs + "]";
}

	public int nbActeurs() {
		int nbActeurs = this.ListeActeurs.size();
		return nbActeurs;
	}
	
	public int nbPersonnages() {
		int nbPersonnages = 0;
		for (Acteur a : this.ListeActeurs) {
			nbPersonnages = a.duet.size();
		}
		return nbPersonnages;
		
	}
	
//	public Vector<>calculBenefice() {
//		
//		boolean isBenefit = false;
//		int i=0;
//		if(this.cout < this.recette) {
//			 isBenefit = true;
//		}
//		int benefice = this.cout - this.recette;
//	    
//	}
	
	public boolean isBefore(int annee) {
		boolean isBefore = false;
		int anneeFilm = Integer.parseInt(this.annee);
		if(annee > anneeFilm) {
			isBefore = true;
		}
		return isBefore;
	    
		
	}
	
	
	
}
