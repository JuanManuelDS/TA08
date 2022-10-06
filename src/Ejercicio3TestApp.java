
public class Ejercicio3TestApp {

	public static void main(String[] args) {
		
		Electrodomestico nevera = new Electrodomestico(450.0, 40.0, 'B', "violeta");
		Electrodomestico nevera2 = new Electrodomestico(459.99, 45.0, 'P', "GRis");
		Electrodomestico generico = new Electrodomestico();
		Electrodomestico generico2 = new Electrodomestico(120.23, 12.0);
		
		System.out.println("----------Electrodomestico 1----------" );
		nevera.imprimirDatos();
		System.out.println("----------Electrodomestico 2----------" );
		nevera2.imprimirDatos();
		System.out.println("----------Electrodomestico 3----------" );
		generico.imprimirDatos();
		System.out.println("----------Electrodomestico 4----------" );
		generico2.imprimirDatos();
	}

}
