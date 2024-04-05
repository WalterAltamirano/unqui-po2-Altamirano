package ar.edu.unq.poo2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.*;

public class RectanguloTestCase {
	private Rectangulo rectangulo;
	/**
	 * Crea un escenario de test básico, que consiste en un rectangulo
	 * de dimension de 4x3
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el rectangulo
		rectangulo = new Rectangulo(4,3);
		
	}
	@Test
	public void testAreaDeUnRectangulo() {
		//Pido el area
		int amount = rectangulo.area();
		
		System.out.println("El valor es " + amount);
		
		assertEquals(12, amount);
	}
	
	@Test
	public void testPerimetroDeUnRectangulo() {
		//Pido el perimetro
		int amount = rectangulo.perimetro();
		
		System.out.println("El valor es " + amount);

		assertEquals(14, amount);
	}
	@Test
	public void testMoverPosicionesDeUnRectangulo() {
		//Pido el perimetro
		rectangulo.moverPosicionesDeX(5);
		
		rectangulo.moverPosicionesDeY(3);
		
		System.out.println("El valor de X es " + rectangulo.coordenadaX() + " Y el de Y es " + rectangulo.coordenadaY());

		assertEquals(9,  rectangulo.coordenadaX());
		
		assertEquals(6,  rectangulo.coordenadaY());
	}
}