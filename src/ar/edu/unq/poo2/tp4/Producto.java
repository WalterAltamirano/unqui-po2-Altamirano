package ar.edu.unq.poo2.tp4;

import ar.edu.unq.poo2.tp5.interfaces.Registrable;
import ar.edu.unq.poo2.tp5.Caja;

public class Producto implements Registrable{
	
	//Atributos
	
	protected String nombre;
	
	protected double precio;
	
	protected boolean incluidoEnPreciosCuidados = false;
	
	protected Caja cajaRegistradora;
	
	//Constructores
	public Producto(String nombre,double precio,boolean estaEnPreciosCuidados) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.incluidoEnPreciosCuidados = estaEnPreciosCuidados;
	}
	
	public Producto(String nombre,double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre,double precio,Caja cajaRegistradora) {
		super();
		this.cajaRegistradora = cajaRegistradora;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Metodos
	
	public void registrarse() {
		cajaRegistradora.decrementarStockDe(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
		
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean esPrecioCuidado() {
		return incluidoEnPreciosCuidados;
	}
	public void setIncluidoEnPreciosCuidados(boolean incluidoEnPreciosCuidados) {
		this.incluidoEnPreciosCuidados = incluidoEnPreciosCuidados;
	}
	
	public void aumentarPrecio(double precioAAumentar) {
		this.precio = precio + precioAAumentar;
	}
}
