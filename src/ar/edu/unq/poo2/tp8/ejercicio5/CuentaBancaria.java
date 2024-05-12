package ar.edu.unq.poo2.tp8.ejercicio5;
import java.util.ArrayList;
import java.util.List;
public abstract class CuentaBancaria {
	//Variables de Instancia
	private String titular;
	private int saldo;
	private List<String> movimientos;
	 
	//Constructor
	public CuentaBancaria(String titular){
		this.titular=titular;
		this.saldo=0;
		this.movimientos=new ArrayList<String>();
	 }
	
	 //Metodos
	 public String getTitular(){
		 return this.titular;
	 }
	 public int getSaldo(){								//Operacion primitiva
		 return this.saldo;
	 }
	 protected void setSaldo(int monto){				//Operacion primitiva
		 this.saldo=monto;
	 }
	 public void agregarMovimientos(String movimiento){	//Operacion primitiva
		 this.movimientos.add(movimiento);
	 }
	 public final void extraer(int monto) {// Se modifica extraer porque es el Templeate Method
		 if(this.puedeExtraer(monto)) {
			 this.setSaldo(this.getSaldo()-monto);
			 this.agregarMovimientos("Extraccion");
		 }
	 }
	 protected abstract boolean puedeExtraer(int monto); //Es el metodo que solo cambia en el extraer
}
