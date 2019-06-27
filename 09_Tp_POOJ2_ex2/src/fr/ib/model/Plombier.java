package fr.ib.model;

public class Plombier extends Personne {

	//constructeur
	public Plombier() {
		super();
	}
	
	public Plombier(String nom) {
		super();
		this.nom = nom;
	}
	//toString
	@Override
	public String toString() {
		return "Plombier [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
