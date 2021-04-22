package starWars;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){

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
		sc.close();
		Film film3 = new Film(titreFilm,anneeFilm,numEpisodeFilm,coutFilm,recetteFilm,null);
		
		films.add(film1);
		films.add(film2);
		films.add(film3);
		
		
		for(Film f: films ) {
			System.out.println(f.toString());
		}
		
		Vector<Personnage> persos = new Vector<Personnage>();
		Personnage perso1 = new Personnage("yoda","le bg");
		Personnage perso2 = new Personnage("Indiana","Jones");
		Personnage perso3 = new Personnage("Han","Solo");
		persos.add(perso2);
		persos.add(perso3);
		Acteur acteur1 = new Acteur("harisson","ford",persos);
		System.out.println(acteur1.toString());
		System.out.println(acteur1.nbPersonnage());
		
}
}
