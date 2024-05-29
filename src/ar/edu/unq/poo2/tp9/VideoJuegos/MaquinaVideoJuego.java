package ar.edu.unq.poo2.tp9.VideoJuegos;

public class MaquinaVideoJuego {
	
	//Variables de Instancia
	private EstadoMaquina estado;
	private Ranura ranura;
	private int fichasInsertadas;
	private Pantalla pantalla;
	private Usuario usuario;
	
	//Constructor
	public MaquinaVideoJuego(Usuario usuario,Ranura ranura,Pantalla pantalla) {
		super();
		this.estado = new StandBy();
		this.ranura = ranura;
		this.fichasInsertadas = 0;
		this.pantalla = pantalla;
		this.usuario = usuario;
	}
	
	//Metodos
	public void iniciar() {
		this.estado.botonDeInicioApretado(this);
	}
	public void ingresarFichas(int cantidad) {
		this.estado.ingresarCantidadDeFichas(cantidad,this);
	}
	void agregarFichas(int cantidad) {
		this.fichasInsertadas = this.fichasInsertadas + cantidad;
	}

	void retirarFichas(int fichasADevolver) {
		this.fichasInsertadas = this.fichasInsertadas - fichasADevolver;
		
	}
	//Getters y setters
	
	void setEstado(EstadoMaquina estado) {
		this.estado = estado;
	}
	
	
	Pantalla getPantalla() {
		return this.pantalla;
	}

	int getFichasInsertadas() {
		return this.fichasInsertadas;
	}

	void setFichasInsertadas(int cantidad) {
		this.fichasInsertadas = cantidad;
		
	}

	Ranura getRanura() {
		return this.ranura;
	}

	Usuario getUsuario() {
		return this.usuario;
	}
	

}


