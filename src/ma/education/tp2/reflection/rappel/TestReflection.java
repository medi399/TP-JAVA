package ma.education.tp2.reflection.rappel;

public class TestReflection {
	
	public static void main(String[] args) {
		ResourceBundle rb =ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");
		String value = rb.getString("keyClass1");
		Class c = Class.forName(value);
		Constructor[] constructors = c.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		Object o = constructors[0].newInstance(null);
}
