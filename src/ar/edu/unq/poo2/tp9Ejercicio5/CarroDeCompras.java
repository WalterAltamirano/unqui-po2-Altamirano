package ar.edu.unq.poo2.tp9Ejercicio5;

import java.util.List;
import java.util.stream.Collectors;

public class CarroDeCompras {
	
	private List<Product> products;
	
	public List<Product> getElements() {
		return this.products;
	}
	
	public int totalRounded() {
		List<Float> preciosDeProductos = this.preciosDeProductos();
		
		int redondeo = 0;
		for(int i= 0; preciosDeProductos.size() != i; i++) {
			redondeo = redondeo + preciosDeProductos.get(i).intValue();
		}
		return redondeo;
	}
	
	public float total() {
		return this.sumatoriaDeProductos();
	}
	
	private float sumatoriaDeProductos() {
		List<Float> preciosProductos = this.preciosDeProductos();
		
		float sumatoria = 0;
		for(int i= 0; preciosProductos.size() != i; i++) {
			sumatoria = sumatoria + preciosProductos.get(i).intValue();
		}
		return sumatoria;
	}
	
	private List<Float> preciosDeProductos() {
		List<Product> productos = this.products;
		List<Float> preciosFloat = productos.stream().map( producto -> producto.getPrice()).collect(Collectors.toList());
		
		return preciosFloat;
	}
	
	private void setElements(List<Product> listaDeProductos) {
		this.products = listaDeProductos;
	}
	
}
