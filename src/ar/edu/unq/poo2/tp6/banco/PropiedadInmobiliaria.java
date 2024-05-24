package ar.edu.unq.poo2.tp6.banco;

public class PropiedadInmobiliaria {
	//Variables De Instancia
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	//Constructor
	public PropiedadInmobiliaria(String descripcion,String direccion,double  valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
		
	//Metodos
	public double getValorFiscal() {
		return this.valorFiscal;
	}
		
}
