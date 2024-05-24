package ar.edu.unq.poo2.tp8.ejercicio4;

public class LlamadaDescuento extends LlamadaTelefonica{
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}
	@Override
	public boolean esHoraPico() {	  //Redefine la operacion primitiva
		return false;
	}
	@Override
	public float costoNeto(){			//Redefine el hook method
		return this.getTiempo()*0.95f;
	}
}
