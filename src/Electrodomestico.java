
public class Electrodomestico {

	protected double precioBase, peso;
	protected char consumoEnergetico;
	protected String color;
	
	protected final double PRECIO_DEF = 100.0, PESO_DEF=5.0;
	protected final char CONSUMO_ENERGETICO_DEF = 'F';
	protected final String COLOR_DEF = "blanco";
	
	
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
		this.consumoEnergetico = checkConsumoEnergetico(consumoEnergetico);
		
	}
	
	public String checkColor(String color) {
		boolean esValido = false;
		for(Colores col: Colores.values()) {
			if(color.toLowerCase().equals(col.toString().toLowerCase())) {
				esValido = true;
			}
		}
		if(esValido) {
			return color;
		} else {
			return COLOR_DEF;
		}
	}
	
	public char checkConsumoEnergetico(char consumoE) {
		boolean esValido = false;
		for(ConsumoEnergetico ce: ConsumoEnergetico.values()) {
			if(consumoE == ce.toString().charAt(0)) {
				esValido =true;
			}
		}
		if(esValido)
			return consumoE;
		else {
			return CONSUMO_ENERGETICO_DEF;
		}
		
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
		this.consumoEnergetico = checkConsumoEnergetico(consumoEnergetico);
	}
	
	public void setColor(String color) {
		this.color = checkColor(color);
		
	}
	
}
