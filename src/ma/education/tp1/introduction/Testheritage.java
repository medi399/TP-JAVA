package ma.education.tp1.introduction;

public class Testheritage {
	public static void main(String[] args){
		Salle s1=new SalleCours(1, "Salle 1", 20);
		SalleCours s2= new SalleCours(2, "Salle 2", 20);
		SalleCours s3=s1;
		SalleCours s4=s2;
	}
	//la ligne qui donne un erreur est la troisieme ligne s3=s1 on ne peut pas affecter un classe fille a la classe mere
	// EN CORRIGE AVEC LE CAST EXPLICITE 
	alle s1=new SalleCours(1, "Salle 1", 20);
	SalleCours s2= new SalleCours(2, "Salle 2", 20);
	SalleCours s3=(Salle)s1;
	SalleCours s4=s2;
}
