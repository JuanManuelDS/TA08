import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

	private String nombre, apellido, dni;
	private int edad;
	private double peso, altura;
	private char sexo;
	private final char SEXO_DEF = 'H';

	public Persona(String dni) {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.peso = 0.0;
		this.altura = 0.0;
		this.sexo = SEXO_DEF;
		if (checkDni(dni)) {
			this.dni = dni;
		} else {
			this.dni = "ERROR: Formato de DNI no válido";
		}
	}

	public Persona(String nombre, String dni, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido = "";

		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
		if (checkDni(dni)) {
			this.dni = dni;
		} else {
			this.dni = "ERROR: Formato de DNI no válido";
		}
	}

	public Persona(String nombre, String apellido, String dni, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		if (checkDni(dni)) {
			this.dni = dni;
		} else {
			this.dni = "ERROR: Formato de DNI no válido";
		}
	}

	public void imprimirDatos() {
		if (nombre == "") {
			System.out.println("Nombre: SIN DATOS");
		} else {
			System.out.println("Nombre: " + nombre);
		}

		if (apellido == "") {
			System.out.println("Apellido: SIN DATOS");
		} else {
			System.out.println("Apellido: " + apellido);
		}

		if (edad == 0) {
			System.out.println("Edad: SIN DATOS");
		} else {
			System.out.println("Edad: " + edad + " años");
		}

		System.out.println("DNI: " + dni);

		if (sexo == 'H')
			System.out.println("Sexo: hombre");
		else {
			System.out.println("Sexo: mujer");
		}

		if (peso == 0.0) {
			System.out.println("Peso: SIN DATOS");
		} else {
			System.out.println("Peso: " + peso + "kg");
		}

		if (altura == 0.0) {
			System.out.println("Altura: SIN DATOS");
		} else {
			System.out.println("Altura: " + altura + "m");
		}

	}

	public boolean checkDni(String dni) {
		boolean esDni = true;
		// Primero verifico el largo del DNI
		if (dni.length() != 9 && dni.length() != 8) {
			esDni = false;
		}

		// verifico que la parte numérica del dni posea sólo números
		String parteNumerica = dni.substring(0, dni.length() - 1);
		String regex = "[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(parteNumerica);
		if (!match.matches()) {
			esDni = false;
		}

		// Verifico que la última parte sea una letra
		final String LETRAS_VALIDAS = "ABCDEFGHJKLMNPQRSTVWXYZ";
		String letraFinal = dni.substring(dni.length() - 1);
		if (!LETRAS_VALIDAS.contains(letraFinal)) {
			esDni = false;
		}
		return esDni;
	}

}
