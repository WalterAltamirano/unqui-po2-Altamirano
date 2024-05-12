package ar.edu.unq.poo2.tp6.banco;

public class Cliente {
	
	//Variables De Instancia
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private float sueldoNetoMensual;
	private PropiedadInmobiliaria propiedadInmobiliaria;
	//Constructor
	public Cliente(String nombre,String apellido, int edad,String direccion,Float sueldoNetoMensual) {
		super();
		this.nombre   = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	public Cliente(String nombre,String apellido, int edad,String direccion,Float sueldoNetoMensual, PropiedadInmobiliaria propiedadInmobiliaria) {
		super();
		this.nombre   = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}
	//Metodos
	public float getSueldoNetoAnual() {
		return 0;//Hacer
	}
	
	public float getSueldoNetoMensual() {
		return 0;//Hacer
	}
	
	public int getEdad() {
		return 0;//Hacer
	}
	public void solicitarCreditoPersonal(Banco banco,float montoASolicitar,int cantidadDeMeses) {
		//Hacer
	}
	public void solicitarCreditoHipotecario(Banco banco, float montoASolicitar,int cantidadDeMeses) {
		//Hacer
	}
	
	
	
	
	
}
