package ma.education.tp1.introduction;

public class Salle {
         long id; 
         String nom;
         
         Salle(){
        	 
         }
         Salle(String nom){
        	 this.nom=nom;
         }
         
         Salle(String nom, long id){
        	 this.nom=nom;
        	 this.id=id;
         }
        public static void main(String[] args){
         Salle s = new Salle();
         System.out.println(s.nom);
         System.out.println(s.id);
         }
       
}
