package fr.ib.model;

public class Menuisier extends Personne {
	
	
	//constructeur
	public Menuisier() {
		super();
	}
	
	public Menuisier(String nom) {
		super();
		this.nom = nom;
	}
//toString
	@Override
	public String toString() {
		return "Menuisier [id=" + id + ", nom111=" + nom + "]";
	}	
	
}
