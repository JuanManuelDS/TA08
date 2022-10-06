import java.util.Random;

public class Password {
	private int longitud;
	private String password;
	private final int LONGITUD_DEF=8;
	
	public Password() {
		this.longitud=LONGITUD_DEF;
		setPassword();
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		setPassword();
	}
	
	public void setPassword() {
		String randomPassword = "";
		for(int i = 1; i<=longitud; i++) {
			randomPassword += createRandomChar();
		}
		this.password =randomPassword;
	}
	
	public String getPassword() {
		return password;
	}
	
	public char createRandomChar() {
		Random random = new Random();
		//Le retorno el número de un caracter imprimible
		char c = (char) (random.nextInt(126-33) + 33);
		return c;
	}
}
