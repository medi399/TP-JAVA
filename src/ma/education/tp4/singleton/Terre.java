package ma.education.tp4.singleton;

public class Terre {
   double distancetosoleil;
   double surface;
   private static Terre instance;
   
   private Terre(double distanceToSoleil, double surface) {
	   this.distancetosoleil = distanceToSoleil;
	   this.surface = surface;
   }
   public static Terre getInstance(double distancetosoleil, double surface) {
	   if (instance == null)
	   instance = new Terre(distancetosoleil, surface);
	   return instance;
   }
}

