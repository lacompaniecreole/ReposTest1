package fr.ib.test;

import fr.ib.model.Menuisier;
import fr.ib.model.Personne;
import fr.ib.model.Plombier;

public class MaClassTest {
	
	public static void main (String [] argv)
	{
		//instanciation
		Personne [] personnes=new Personne [3];
		personnes[0]=new Menuisier("Paul");
	personnes[1]=new Plombier("Jean");
	personnes[2]=new Menuisier("Adrien");
	
	//appel methode
	for(int i=0;i<personnes.length;i++)
	{
		personnes[i].affiche();
	}
	
	}

}
