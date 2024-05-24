package ar.edu.unq.poo2.tp8.ejercicio2;

public class EmpleadoTemporario extends Empleado{
	
	
	@Override
	protected int sueldoBasico() {
		return 1000;
	}
	
	@Override
	protected int pagoExtra() {
		if(this.estaCasado || this.getCantidadDeHijos() >= 1) {
			return 100;
		}
		else {
			return 0;
		}
	}
	@Override
	protected int montoPorHoraTrabajada() {
		return 5;
	}
	
}
