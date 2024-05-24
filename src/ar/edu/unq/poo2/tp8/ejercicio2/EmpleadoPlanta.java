package ar.edu.unq.poo2.tp8.ejercicio2;

public class EmpleadoPlanta extends Empleado {
	
	
	
	@Override
	protected int montoPorHoraTrabajada() {
		return 0;
	}
	
	@Override
	protected int pagoExtra() {
		return this.getCantidadDeHijos() * 150;
	}
	
	@Override
	protected int sueldoBasico() {
		return 3000;
	}
}
