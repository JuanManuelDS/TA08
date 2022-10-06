
public class Ejercicio2TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password clave1 = new Password();
		Password clave2 = new Password(25);
		
		System.out.println("Clave autogenerada 1: " + clave1.getPassword());
		System.out.println("Clave autogenerada 2: " + clave2.getPassword());
	}

}
