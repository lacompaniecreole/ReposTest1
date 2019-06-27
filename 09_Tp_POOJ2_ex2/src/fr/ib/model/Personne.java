package fr.ib.model;

public class Personne {
	
	//attributs classe mère
	protected int id;
	protected String nom;
	
	public static int idIncr=1;

	//constructeurs :

	public Personne() {
		super();
	}

	public Personne(String nom) {
		super();
		this.id=idIncr++;
		this.nom = nom;
	}

	//get et set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	//toString
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + "]";
	}
	
	//methodes
	public void affiche()
	{
		System.out.println("La personne est : "+getNom());
	}
	

}
