package ar.edu.unq.poo2.tp8.ejercicio5;

public class CuentaCorriente extends CuentaBancaria{
	//Variables de Instancia
	private int descubierto;
	
	//Constructor
	public CuentaCorriente(String titular, int descubierto){
		super(titular);
		this.descubierto=descubierto;
	 }
	 //Metodos
	 public int getDescubierto(){
		 return this.descubierto;
	 }
	 
	 @Override									
	 public boolean puedeExtraer(int monto) {//La clase solo debe implementar su condicion para extraer
		 return this.getSaldo()+this.getDescubierto()>=monto;
	 }
	
}
