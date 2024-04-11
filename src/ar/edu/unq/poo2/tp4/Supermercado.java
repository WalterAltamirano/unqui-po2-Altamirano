package ar.edu.unq.poo2.tp4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Supermercado {
	
	private String nombre;
	
	private String direccion;
	
	private Collection<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre,String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto productoAAgregar) {
		productos.add(productoAAgregar);
	}
	
	public void quitarProducto(Producto productoAQuitar) {
		productos.remove(productoAQuitar);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Collection<Producto> getProductos() {
		return productos;
	}
	
	public double getPrecioTotal() {
		
		double sumatoriaDePrecios = this.getProductos().stream()
								 .mapToDouble(producto -> producto.getPrecio())
								 .sum();
		return sumatoriaDePrecios;
	}
	
}
