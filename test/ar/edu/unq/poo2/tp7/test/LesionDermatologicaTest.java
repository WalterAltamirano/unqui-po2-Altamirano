package ar.edu.unq.poo2.tp7.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp7.enums.LesionDermatologica;

import static org.junit.jupiter.api.Assertions.*;
	

public class LesionDermatologicaTest {
	
	@Test
	public void testSiguienteLesion() { 
		
		assertEquals(LesionDermatologica.AMARILLO.siguiente(),LesionDermatologica.MIEL);
		
		assertEquals(LesionDermatologica.MIEL.siguiente(), LesionDermatologica.ROJO);
	}
	
	
}
