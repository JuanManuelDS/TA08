
public class Electrodomestico {

	protected double precioBase, peso;
	protected char consumoEnergetico;
	protected String color;
	protected final double PRECIO_DEF = 100.0, PESO_DEF=5.0;
	protected final char CONSUMO_ENERGETICO_DEF = 'F';
	protected final String COLOR_DEF = "blanco";
	protected final String COLORES_PERMITIDOS = "blanco negro azul rojo gris";
	protected final String CONSUMO_ENERGETICO_PERMITIDOS = "A B C D E F";
	
	
	public Electrodomestico() {
		this.precioBase = PRECIO_DEF;
		this.peso = PESO_DEF;
		this.color=COLOR_DEF;
		this.consumoEnergetico =CONSUMO_ENERGETICO_DEF;
		
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.color=COLOR_DEF;
		this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
	}
	
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = checkColor(color);
		//Seteo el consumo con el método set así controlo que se haya introducido un caracter correcto
		setConsumoEnergetico(consumoEnergetico);
	}
	
	public String checkColor(String color) {
		if(COLORES_PERMITIDOS.contains(color.toLowerCase())) {
			return color;
		} else {
			return color + " no está disponible, vuelva a setear el color con uno válido";
		}
	}
	
	public boolean checkConsumoEnergetico(char consumoE) {
		
		if(CONSUMO_ENERGETICO_PERMITIDOS.contains(String.valueOf(consumoE)))
			return true;
		else return false;
	}
	
	public void imprimirDatos() {
		System.out.println("Precio base: " + precioBase + "€");
		if(consumoEnergetico == 'x') {
			System.out.println("El consumo energético ingresado no es correcto, recuerde ingresar valores entre A y F en mayúsculas.");
		}else {
			System.out.println("Eficiencia energética: " +consumoEnergetico);
		}
		System.out.println("Color: " + color);
		System.out.println("Peso: " + peso + " kg");
		
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {
		if(checkConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = 'x';
		}
	}
	
	public void setColor(String color) {
		this.color = checkColor(color);
		
	}
	
}
