package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args){
		Salle o1 = new Salle();
		 System.out.println(o1.nom);
         System.out.println(o1.id);
       
         Salle o2 = new Salle("salle informatique");
		 System.out.println(o2.nom);
         System.out.println(o2.id);
        
         Salle o3 = new Salle("salle des cours ",2);
		 System.out.println(o3.nom);
         System.out.println(o3.id);
	}
}
