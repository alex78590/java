package projetCours;

public class Visite {

	String nomEtudiant;
	String date;
	Integer note;
	
	String getnomEtudiant() {
		return this.nomEtudiant;
	}
	
	String getdate() {
		return this.date;
	}
	
	int getnote() {
		return this.note;
	}
	
	void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	
	void setDate(String date) {
		this.date = date;
	}
	
	void setNote(Integer note) {
		this.note = note;
	}
	
	public Visite() {
		this.nomEtudiant=new String();
		this.date=new String();
	}
	
	public Visite(String nomEtudiant,String date,Integer note) {
		
		this.nomEtudiant = nomEtudiant;
		this.date = date;
		this.note = note;

	}
	
public static void main(String[] args) {
		Visite visiteV1 = new Visite();
		System.out.println(visiteV1);
		visiteV1.note = 5;
		Visite visiteV2 = new Visite("alexis","03/07/2000",15);
		System.out.println(visiteV2.getnomEtudiant());
		System.out.println(visiteV2.getdate());
		System.out.println(visiteV2.getnote());
		
		
	}
}

