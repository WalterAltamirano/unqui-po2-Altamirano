package ar.edu.unq.poo2.tp4;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Trabajador {
	
	//Variables de Instancia
	
	private int impuestoAlTrabajador = 2;
	
	private int montoImponible;
	
	private List<Ingreso> registroDeIngresos = new ArrayList<Ingreso>();
	
	//Constructores
	public Trabajador(int montoImponible) {
		super();
		this.montoImponible = montoImponible;
	}
	
	//Metodos
	
	public float getTotalPercibido() {
		
		Ingreso ultimoIngreso = registroDeIngresos.get(0);
		
		return ultimoIngreso.getMontoPercibido();
	}
	
	public int getMontoImponible() {
		return montoImponible;
	}
		
	
	public float getImpuestoAPagar() {
		return this.getMontoImponible() - this.impuestoDelMontoImponible();
	}
	
	private int impuestoDelMontoImponible() {
		return (this.getMontoImponible() * impuestoAlTrabajador) / 100;
	}
}