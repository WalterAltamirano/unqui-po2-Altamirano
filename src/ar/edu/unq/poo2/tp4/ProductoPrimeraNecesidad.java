package ar.edu.unq.poo2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre,double precio,boolean estaEnPreciosCuidados) {
		super(nombre,precio,estaEnPreciosCuidados);
	}
	
	public ProductoPrimeraNecesidad(String nombre,double precio) {
		super(nombre,precio);
	}
	
	//Constructor del ejercicio 2
	public ProductoPrimeraNecesidad(String nombre,double precio,boolean estaEnPreciosCuidados, double descuento) {
		super(nombre,precio,estaEnPreciosCuidados);
		this.descuento = descuento;
	}
	
	public double getPrecio() {
		return this.precio - this.descuentoDePrecio();   //En los ejemplos esta hecho asi (Habia puesto override)
	}
	
	private double descuentoDePrecio() {
		return (precio * descuento) / 100;
	}
}
