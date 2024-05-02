package ar.edu.unq.poo2.tp5;

import ar.edu.unq.poo2.tp4.Producto;
import ar.edu.unq.poo2.tp5.interfaces.*;

import java.util.Map;
import java.util.stream.Stream;
//import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Caja implements Agencia{
	
	//Variables De Instancia
	private Collection<Registrable> registroDeCosasRegistrables;
		
	private AgenciaRecaudadora agencia;
	
	private Repositorio repositorioDeStock;  //Me parece que la caja es la que se encarga del stock (Terminar la parte 2 y al final cambiarlo)
	
	//Constructores
	public Caja() {
		super();
		this.registroDeCosasRegistrables = new ArrayList<Registrable>();
		
	}
	public Caja(Repositorio repositorio) {
		super();
		this.repositorioDeStock = repositorio;
		this.registroDeCosasRegistrables = new ArrayList<Registrable>();
	}
	public Caja(Repositorio repositorio, AgenciaRecaudadora agencia) {
		super();
		this.agencia = agencia;
		this.repositorioDeStock = repositorio;
		this.registroDeCosasRegistrables = new ArrayList<Registrable>();
	}
	
	//Metodos (Parte 1)
	public int getCantidadDeCosasRegistrables() {
		return registroDeCosasRegistrables.size();
	}
	
//	public void registrarProducto(Producto producto) {
//		this.decrementarStockDe(producto);
//		registroDeProductos.add(producto);
//	}
	public double montoTotalAPagar() {
		return this.registroDeCosasRegistrables.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}
	
	private void puedeDecrementarStockDe(Producto producto) {
		if(!repositorioDeStock.puedeDecrementar(producto)) {
			System.out.println("No hay mas stock del producto " + producto);
		}
	}
	
	public void decrementarStockDe(Producto producto) {
		this.puedeDecrementarStockDe(producto);
		repositorioDeStock.decrementarProducto(producto);
	}
	
	
	//Metodos (Parte 2)
	@Override
	public void registrarPago(Registrable cosaRegistrable) {
		cosaRegistrable.registrarse();
		registroDeCosasRegistrables.add(cosaRegistrable);
	}
	
	/*
	 private Collection<Double> registroDePagos = new ArrayList<Double>();
	 
	 
	 public void registrarPago(Pagable cosaPagable) {
	 	if(cosaPagable.puedeSerPagado()) {
	 		cosaPagable.pagar()                           //o cosaPagable.serPagado()
	 		registroDePagos.add(cosaPagable.costo())
	 	}
	 } 
	 Esta seria la forma de que la caja pueda cobrar una factura o un producto
	 
	 */
}


//Formas que se me ocurrieron para tirar Excepcion 
/*
1)
private void puedeDecrementarStockDe(Producto producto) throws IOException{
	if(!repositorioDeStock.puedeDecrementar(producto)) {
		System.out.println("No hay mas stock del producto " + producto);
		throw new IOException();
	}
}

public void decrementarStockDe(Producto producto) {
		this.puedeDecrementarStockDe(producto);
		repositorioDeStock.decrementarProducto(producto);
}

2)
	private void imprimirMensaje(Producto producto) {
		System.out.println("No hay mas stock del producto " + producto);
	}
	
	private void decrementarStockDe(Producto producto) {
		
		try {
			repositorioDeStock.decrementarProducto(producto);
		}
		catch (IOException e) {
			this.imprimirMensaje(producto);
		}
	}
	
	Agregando en la clase Repositorio
	public void decrementarProducto(Producto producto) throws IOException {
		stockDeProductos.remove(producto);
		throw new IOException();
	}
*/


