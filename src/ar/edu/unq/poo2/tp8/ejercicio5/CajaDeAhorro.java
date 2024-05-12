package ar.edu.unq.poo2.tp8.ejercicio5;

public class CajaDeAhorro extends CuentaBancaria{
	
	//Variables de Instancia
	private int limite;
	
	//Constructor
	public CajaDeAhorro(String titular, int limite){
		super(titular);
		this.limite=limite;
	 }
	//Metodos 
	public int getLimite(){
		return this.limite;
	 }
	 @Override
	 public boolean puedeExtraer(int monto) { //La clase solo debe implementar su condicion para extraer
		 return this.getSaldo()>=monto && this.getLimite()>=monto;
	 }

}
