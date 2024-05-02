package ar.edu.unq.poo2.tp5;

import ar.edu.unq.poo2.tp4.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Repositorio {
	
	//Variables de Instancia
	private List<Producto> stockDeProductos = new ArrayList<Producto>();
	
	
	//Constructores
	public Repositorio() {
		super();
	}
	
	//Opcion
	/*
 	public Repositorio(List<Producto> productos) {		//Sirve para agregar una coleccion directamente para el testeo
 		super();										//en vez de uno por uno
 		this.stockDeProductos = productos;
 	}
 	*/
		
	
	//Metodos
	public void almancenarProducto(Producto producto) {
		stockDeProductos.add(producto);
	}
	
	public void almacenarProductos(List<Producto> productos) {
		stockDeProductos.addAll(productos);
	}
	
	public void decrementarProducto(Producto producto)  {
		stockDeProductos.remove(producto);
	}
	
	public int getStockDe(Producto producto) {
		
		Collection<Producto> productos = stockDeProductos;
		
		int productosHastaAhora = 0;
		
		for(int i = 0;productos.size() != i; i++) {
			if(producto.getPrecio() == this.precioDe(((List<Producto>) productos).get(i))) {
				productosHastaAhora = productosHastaAhora + 1;
			}
		}
		return productosHastaAhora;
	}
	
	private double precioDe(Producto producto) {
		return producto.getPrecio();
	}
	public boolean puedeDecrementar(Producto producto) {
		return stockDeProductos.contains(producto);
	}
}

//Probando agregar todos los productos mediante una coleccion ya hecha para los test
//public void almacenarProductos(Collection<Producto> productos) {
//stockDeProductos.addAll(productos);
//}
