
public class Serie {

	private String titulo, creador, genero;
	private int nTemporadas;
	private boolean entregado;

	private final int N_TEMPORADAS_DEF = 3;
	private final boolean ENTREGADO_DEF = false;
	private final String GENEROS = "acción comedia terror suspenso drama ciencia ficción histórico";

	public Serie() {
		this.titulo = "";
		this.creador = "";
		this.genero = "";
		this.nTemporadas = N_TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.nTemporadas = N_TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}

	public Serie(String titulo, String creador, String genero, int nTemporadas, boolean entregado) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = checkGenero(genero);
		this.nTemporadas = nTemporadas;
		this.entregado = entregado;
	}
	
	public void imprimirDatos() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Creador: " + creador);
		System.out.println("Género: " + genero);
		System.out.println("N° temporadas: " + nTemporadas);
		if(entregado) {
			System.out.println("Entregada: sí");
		} else {
			System.out.println("Entregada: no");
		}
		
	}
	
	public String checkGenero(String genero) {
		if(GENEROS.contains(genero)) {
			return genero;
		} else return "ERROR: El género seleccionado no se corresponde con uno de nuestra lista";
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

}
