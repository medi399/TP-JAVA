package ma.education.tp4.singleton;

public class TestSingleton {
     
	public static void main (String arg[]) {
		Terre t1,t2;
	Terre t1= Terre.getInstance(1000, 2000);
	Terre t2= Terre.getInstance(4000, 5000);
	System.out.println("r la distanceToSoleil et la surface"+t1);
	

	}
}
