package ar.edu.unq.poo2.tp9Ejercicio5;

public class SpecialProduct extends Product {
	
	@Override
	public float getPrice() {
		return super.getPrice() * 3;
	}
}
