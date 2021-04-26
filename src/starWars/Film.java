package starWars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.List;


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
	
	public ArrayList<List>calculBenefice() {
		
		boolean isBenefit = false;
		if(this.cout < this.recette) {
			 isBenefit = true;
		}
		int benefice = this.cout - this.recette;
		ArrayList<List> liste = new ArrayList<List>();
	    ArrayList<Integer>benefices = new ArrayList<Integer>();
	    ArrayList<Boolean>isBenefices = new ArrayList<Boolean>();
	    benefices.add(benefice);
	    isBenefices.add(isBenefit);
	    liste.add(benefices);
	    liste.add(isBenefices);
	    return liste;
	}
	
	public boolean isBefore(int annee) {
		boolean isBefore = false;
		int anneeFilm = Integer.parseInt(this.annee);
		if(annee > anneeFilm) {
			isBefore = true;
		}
		return isBefore;
	    
		
	}
	
	
	public ArrayList<Acteur>ActeursAlph(Film film){
		ArrayList<Acteur>Acteurs = this.ListeActeurs;
		Collections.sort(Acteurs);
	}
	
	
	public String makeBackup (ArrayList<Film>films){
		String chaine = "";
		for(Film f :films) {
			String annee = this.annee;
			String titre = this.titre;
			String benefice = String.valueOf(this.recette);
			chaine = annee+"-"+titre+"-"+benefice;
		}
		return chaine;
		
	}
	
	
	public void tri(){
        Collections.sort(ListeActeurs, new Comparator<Acteur>() {
            public int compare(Acteur v1, Acteur v2) {
                return v1.getNom().compareTo(v2.getNom());
            }
            
        });
    }
	
	
	
	
}
