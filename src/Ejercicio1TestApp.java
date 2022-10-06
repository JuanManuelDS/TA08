
public class Ejercicio1TestApp {

	public static void main(String[] args) {
		//usuario1 tiene un dni incorrecto, por ende se imprime "SIN DATOS"
		Persona usuario1 = new Persona("4545a789Z");
		//Usuario2 tampoco tiene dni correcto
		Persona usuario2 = new Persona("Juan", "123456789", 25, 'H');
		//usuario3 está correcto
		Persona usuario3 = new Persona("María", "García", "23456789L", 28, 'M', 60.7, 1.69);
		
		System.out.println("---------Persona 1------------");
		usuario1.imprimirDatos();
		System.out.println("---------Persona 2------------");
		usuario2.imprimirDatos();
		System.out.println("---------Persona 3------------");
		usuario3.imprimirDatos();

	}

}
