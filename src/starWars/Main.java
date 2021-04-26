package starWars;
import java.sql.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Scanner;

public class Main {
	
	public static void afficherBackup(HashMap<Integer,Film>dictionnaire) {
		for (Map.Entry<Integer, Film>e:dictionnaire.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue()+"-"+e.getValue());
		}
	}

	public static void main(String args[]){

		/*creation de liste de film, et demande de saisie pour le 3eme, puis affichage*/
		ArrayList<Film> films = new ArrayList<Film>();
		Film film1 = new Film("Star Wars épisode IV : Un nouvel espoir","1977",4,50,5000,null);
		Film film2 = new Film("Star Wars épisode V : L'Empire contre-attaque","1980",5,50,5000,null);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du film");
		String titreFilm = sc.nextLine();
		System.out.println("annee du film");
		String anneeFilm = sc.nextLine();
		System.out.println("num episode");
		int numEpisodeFilm = sc.nextInt();
		System.out.println("cout");
		int coutFilm = sc.nextInt();
		System.out.println("recette");
		int recetteFilm = sc.nextInt();
		Film film3 = new Film(titreFilm,anneeFilm,numEpisodeFilm,coutFilm,recetteFilm,null);
		
		films.add(film1);
		films.add(film2);
		films.add(film3);
		
		
		for(Film f: films ) {
			System.out.println(f.toString());
		}
		
		/*creation liste de personnage et affectation a un acteur*/
		Vector<Personnage> persos = new Vector<Personnage>();
		Personnage perso1 = new Personnage("yoda","le bg");
		Personnage perso2 = new Personnage("Indiana","Jones");
		Personnage perso3 = new Personnage("Han","Solo");
		persos.add(perso2);
		persos.add(perso3);
		Acteur acteur1 = new Acteur("harisson","ford",persos);
		System.out.println(acteur1.toString());
		
		/* affiche le nombre de personnage d'un acteur*/
		System.out.println(acteur1.nbPersonnage());
		
		/*creation liste d'acteur et affectation a un film*/
		ArrayList<Acteur> acteurs = new ArrayList<Acteur>();
		acteurs.add(acteur1);
		film1.setListeActeurs(acteurs);
		System.out.println(film1.toString());
		
		/* affiche le nombre d'acteur d'un film*/
		System.out.println(film1.nbActeurs());
		
		/* affiche le nombre de personnage d'un film*/
		System.out.println(film1.nbPersonnages());
		
		/* verifie si l'année entrée est supérieur a l'année du film*/
		System.out.println("année");
		int annee = sc.nextInt();
		System.out.println(film1.isBefore(annee));
		
		/* verifie si le film rapporte des benefices*/
		System.out.println(film3.calculBenefice());
		
		/* retourne des infos pour une collection de film*/
		HashMap<Integer,Film>tableau = new HashMap<>();
		afficherBackup(tableau);
		
		sc.close();
		
}
}
