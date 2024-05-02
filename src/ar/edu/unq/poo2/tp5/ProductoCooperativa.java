package ar.edu.unq.poo2.tp5;
import ar.edu.unq.poo2.tp4.Producto;

public class ProductoCooperativa extends Producto{
	
	//Variables De Instancia
	private double descuento = 10d;
	
	//Constructor
	public ProductoCooperativa(String nombre,double precio,Caja caja) {
		super(nombre,precio,caja);
	}
	
	//Metodos
	@Override
	public double getPrecio() {
		return precio - this.descuentoDePrecio();
	}
	
	private double descuentoDePrecio() {
		return (precio * descuento) / 100;
	}
	
	
	
	
}
