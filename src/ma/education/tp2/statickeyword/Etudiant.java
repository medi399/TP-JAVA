package ma.education.tp2.statickeyword;

public class Etudiant {
  public  long id;
  public  String nom;
  public static int nbEtudiants;
   //3a-oui 
  	//3b-oui
  	//3C-non
  
  public Etudiant (long id, String nom,int nb) {
	  this.id = id;
	  this.nom = nom;
	  nbEtudiants+=nb;
  }
  
}
