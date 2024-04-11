package ar.edu.unq.poo2.tp4;

public class IngresoHorasExtras extends Ingreso{
	
	//Variable De Instancia
	
	private int cantHorasExtras;
	
	//Costructor
	public IngresoHorasExtras(String concepto, int mesDePercepcion, Trabajador trabajadorAsociado,int cantHorasExtras) {
		super(concepto,mesDePercepcion,trabajadorAsociado);
		this.cantHorasExtras = cantHorasExtras;
	}
	
	//Metodo
	
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}
	
}
