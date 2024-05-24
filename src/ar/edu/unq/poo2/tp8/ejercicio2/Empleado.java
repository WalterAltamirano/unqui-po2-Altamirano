package ar.edu.unq.poo2.tp8.ejercicio2;

public abstract class Empleado {
	
	private int horasTrabajadas;
	private int cantidadDeHijos;
	protected boolean estaCasado;
	
	public int getHorasTrabajadas() {  //Operacion concreta
		return this.horasTrabajadas;
	}
	public int getCantidadDeHijos() { //Operacion concreta
		return this.cantidadDeHijos;
	}
	
	protected abstract int pagoExtra();             //Es un paso del esqueleto del algoritmo (Primitiva)
	
	protected abstract int sueldoBasico();          //Es un paso del esqueleto del algoritmo (Primitiva)
	
	protected abstract int montoPorHoraTrabajada(); //Es una parte de un paso del esqueleto del algoritmo (Primitiva)
	
	protected int montoPorHorasTrabajadas() {		//Es un paso del esqueleto del algoritmo (Operacion concreta)
		return this.montoPorHoraTrabajada() * this.getHorasTrabajadas();
	}
	
	public final int sueldo() {
		return this.montoPorHorasTrabajadas() + this.sueldoBasico() + this.pagoExtra() 
				- this.conceptoDeAportesYObraSocial(this.montoPorHorasTrabajadas() + this.sueldoBasico() + 
				this.pagoExtra());
	}
	
	protected int conceptoDeAportesYObraSocial(int sueldoADescontar) {
		return (sueldoADescontar * 13) / 100;
	}
	
}

/*
 public abstract class Empleado {
	
	private int horasTrabajadas;
	private int cantidadDeHijos;
	protected boolean estaCasado;
	
	public int getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	public int getCantidadDeHijos() {
		return this.cantidadDeHijos;
	}
	
	protected int pagoExtra() {
		return 0;
	}
	
	protected int sueldoBasico() {
		return 0;
	}
	
	protected int montoPorHoraTrabajada() {
		return 0;
	}
	
	protected int montoPorHorasTrabajadas() {
		return this.montoPorHoraTrabajada() * this.getHorasTrabajadas();
	}
	
	public int sueldo() {
		return this.montoPorHorasTrabajadas() + this.sueldoBasico() + this.pagoExtra() 
				- this.conceptoDeAportesYObraSocial(this.montoPorHorasTrabajadas() + this.sueldoBasico() + 
				this.pagoExtra());
	}
	
	protected int conceptoDeAportesYObraSocial(int sueldoADescontar) {
		return (sueldoADescontar * 13) / 100;
	}
	
  
  
  */
