package starWars;
import java.util.ArrayList;
import starWars.Acteur;

public class Film {

	String titre;
	String annee;
	int numEpisode;
	int cout;
	int recette;
	
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
	public Film(String t, String a, int n, int c, int r) {
		this.titre=t;
		this.annee=a;
		this.numEpisode=n;
		this.cout=c;
		this.recette=r;
		
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

	@Override
	public String toString() {
		return "Film [titre=" + titre + ", annee=" + annee + ", numEpisode=" + numEpisode + ", cout=" + cout
				+ ", recette=" + recette + "]";
	}
	
	
	
}
