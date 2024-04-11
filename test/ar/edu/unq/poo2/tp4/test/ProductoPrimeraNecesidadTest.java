package ar.edu.unq.poo2.tp4.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.poo2.tp4.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 11d); //El desccuento es en porcentaje (Ej: 11d es el 11% de 8d) 
		arroz = new ProductoPrimeraNecesidad("Arroz", 5d, false, 8d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.12d, leche.getPrecio());
		assertEquals(4.6d, arroz.getPrecio());
	}
	

}
