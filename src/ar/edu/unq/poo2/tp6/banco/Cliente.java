package ar.edu.unq.poo2.tp6.banco;

public class Cliente {
	
	//Variables De Instancia
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private double sueldoNetoMensual;
	private PropiedadInmobiliaria propiedadInmobiliaria;
	//Constructor
	public Cliente(String nombre,String apellido, int edad,String direccion,double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	public Cliente(String nombre,String apellido, int edad,String direccion,double sueldoNetoMensual, PropiedadInmobiliaria propiedadInmobiliaria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}
	//Metodos
	public double getSueldoNetoAnual() {
		return  this.getSueldoNetoMensual() * 12;
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public int getEdad() {
		return 0;//Hacer
	}
	
	public void solicitarCreditoPersonal(Banco banco,double montoASolicitar,int cantidadDeMeses) {
		banco.registrarSolicitudCreditoPersonal(this, montoASolicitar, cantidadDeMeses);
	}
	public void solicitarCreditoHipotecario(Banco banco, double montoASolicitar,int cantidadDeMeses) {
		banco.registrarSolicitudCreditoHipotecario(this, montoASolicitar, cantidadDeMeses, this.propiedadInmobiliaria);
	}
	
	
	
	
	
}
