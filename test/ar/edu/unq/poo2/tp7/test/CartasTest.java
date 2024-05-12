package ar.edu.unq.poo2.tp7.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ar.edu.unq.poo2.tp7.testDoubles.*;
import ar.edu.unq.poo2.tp7.testDoubles.Carta.PalosPoquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartasTest {
	
	private Carta cuatroDeDiamantes;
	private Carta tresDeDiamantes;
	private Carta jackDeDiamantes;
	private Carta jackDeCorazones;
	private Carta jackDePica;
	private Carta reinaDePica;
	
	@BeforeEach
	public void setUp() {
		cuatroDeDiamantes = new Carta(PalosPoquer.DIAMANTE,4);
		tresDeDiamantes = new Carta(PalosPoquer.DIAMANTE,3);
		jackDeDiamantes = new Carta(PalosPoquer.DIAMANTE,11);
		jackDeCorazones = new Carta(PalosPoquer.CORAZONES,11);
		jackDePica = new Carta(PalosPoquer.PICA,11);
		reinaDePica = new Carta(PalosPoquer.PICA,12);
		
	}
	
	//Las cartas de poquer Con Junit Test
	@Test
	public void testUnaCartaEsSuperiorAOtra() {
		//Excercise
		
		//Verify
		assertTrue(cuatroDeDiamantes.esSuperiorA(tresDeDiamantes));
	}
	@Test
	public void testUnaCartaNoEsSuperiorAOtra() {
		//Excercise
		
		//Verify
		assertFalse(jackDeDiamantes.esSuperiorA(jackDePica));
	}
	@Test
	public void testUnaCartaNoEsDelMismoPaloQueOtra() {
		//Excercise
		
		//Verify
		assertFalse(jackDeDiamantes.poseeElMismoPaloQue(jackDeCorazones));
	}
	@Test
	public void testUnaCartaEsDelMismoPaloQueOtra() {
		//Excercise
		
		//Verify
		assertTrue(jackDePica.poseeElMismoPaloQue(reinaDePica));
	}
	
	
}
