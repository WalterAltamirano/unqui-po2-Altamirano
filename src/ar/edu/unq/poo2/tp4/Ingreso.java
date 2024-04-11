package ar.edu.unq.poo2.tp4;


public class Ingreso {
	
	//Variables de instancia
	
	private Trabajador trabajador;
	
	private int mesDePercepcion;
	
	private String concepto;

	private float montoPercibido;  //Uso float para representar la parte entera y la decimal
	
	//Constructores
	
	public Ingreso() {
		super();
	}
	
	public Ingreso(String concepto, int mesDePercepcion, Trabajador trabajadorAsociado) {
		super();
		this.concepto = concepto;
		this.mesDePercepcion = mesDePercepcion;
		this.trabajador = trabajadorAsociado;
	}

	//Metodos
	
	public int getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public float getMontoPercibido() {
		return trabajador.getMontoImponible();
	}
	
	
	
}
