package ar.edu.unq.poo2.tp7.test;

import ar.edu.unq.poo2.tp7.testDoubles.*;
import ar.edu.unq.poo2.tp7.testDoubles.Carta.PalosPoquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class PoquerStatusTest {
	
	private PokerStatus pokerStatus;
	private Carta unoDeCorazones;
	private Carta dosDeDiamantes;
	private Carta dosDePica;
	private Carta dosDeCorazones;
	private Carta tresDeDiamantes;
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus(); //SUT
				
		
		unoDeCorazones = mock(Carta.class); //Doc
		dosDeDiamantes = mock(Carta.class); //Doc
		dosDePica = mock(Carta.class); //Doc
		dosDeCorazones = mock(Carta.class); //Doc
		tresDeDiamantes =  mock(Carta.class); //Doc
	}
	
	//Primer Punto Poquer
//	@Test
//	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsPoquer() {
//		
//		//Verify
//		assertTrue(pokerStatus.verificar("2D", "2P", "2C", "2T", "5D"));
//	}
//	@Test
//	public void testUnPoquerStatusRecibe5CartasYVerificaQueNoEsPoquer() {
//		
//		//Verify
//		assertFalse(pokerStatus.verificar("QD", "JP", "2C", "2T", "5D"));
//	}
	
	//Poquer Continuacion
	
//	@Test
//	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsTrio() {
//		
//		//Verify
//		assertEquals("Trio",pokerStatus.verificar("3D", "3P", "3C", "5D", "JP"));
//	}
//	@Test
//	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsColor() {
//		
//		//Verify
//		assertEquals("Color",pokerStatus.verificar("8P", "3P", "QP", "KP", "JP"));
//	}
//	@Test
//	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsPoquer() {
//				
//		//Verify
//		assertEquals("Poquer",pokerStatus.verificar("3D", "3P", "3C", "3T", "JP"));
//	}
//	@Test
//	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsNada() {
//				
//		//Verify
//		assertEquals("Nada",pokerStatus.verificar("3D", "4P", "KC", "6D", "6P"));
//	}
//	
	//Las cartas de poquer
	
	@Test
	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsNada() {
		//SetUp
		
		Carta cincoDeDiamantes = mock(Carta.class); //Doc
		Carta diezDePica= mock(Carta.class);		//Doc
		Carta cuatroDeCorazones= mock(Carta.class); //Doc
		
		
		when(tresDeDiamantes.valor()).thenReturn(3);
		when(cincoDeDiamantes.valor()).thenReturn(5);
		when(diezDePica.valor()).thenReturn(10);
		when(cuatroDeCorazones.valor()).thenReturn(4);
		when(unoDeCorazones.valor()).thenReturn(1);
		
		when(tresDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(cincoDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(diezDePica.palo()).thenReturn(PalosPoquer.PICA);
		when(cuatroDeCorazones.palo()).thenReturn(PalosPoquer.CORAZONES);
		when(unoDeCorazones.palo()).thenReturn(PalosPoquer.CORAZONES);
		
		//Excercise
		
		assertEquals("Nada",pokerStatus.verificar(tresDeDiamantes, cincoDeDiamantes, diezDePica, cuatroDeCorazones, unoDeCorazones));
		
		//Verify
		verify(tresDeDiamantes, times(1)).valor();
		verify(cincoDeDiamantes,times(1)).valor();
		verify(diezDePica,times(1)).valor();
		verify(cuatroDeCorazones,times(1)).valor();
		verify(unoDeCorazones,times(1)).valor();
		
		verify(tresDeDiamantes, times(1)).palo();
		verify(cincoDeDiamantes,times(1)).palo();
		verify(diezDePica,times(1)).palo();
		verify(cuatroDeCorazones,times(1)).palo();
		verify(unoDeCorazones,times(1)).palo();
		
	}
	@Test
	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsPoquer() {
		
		Carta dosDeTrebol = mock(Carta.class);
		
		when(dosDeDiamantes.valor()).thenReturn(2);
		when(dosDePica.valor()).thenReturn(2);
		when(dosDeCorazones.valor()).thenReturn(2);
		when(dosDeTrebol.valor()).thenReturn(2);
		
		when(dosDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(dosDePica.palo()).thenReturn(PalosPoquer.PICA);
		when(dosDeCorazones.palo()).thenReturn(PalosPoquer.CORAZONES);
		when(dosDeTrebol.palo()).thenReturn(PalosPoquer.TREBOL);

		
		//Excercise
		
		assertEquals("Poquer", pokerStatus.verificar(dosDeTrebol, dosDeDiamantes, dosDePica, dosDeCorazones, unoDeCorazones));
		
		//Verify
		verify(dosDePica,times(1)).valor();
		verify(dosDeCorazones,times(1)).valor();
		verify(dosDeTrebol,times(1)).valor();
		verify(dosDeDiamantes,times(1)).valor();
	}
	@Test
	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsTrio() {
		
		when(dosDeDiamantes.valor()).thenReturn(2);
		when(dosDePica.valor()).thenReturn(2);
		when(dosDeCorazones.valor()).thenReturn(2);
		when(unoDeCorazones.valor()).thenReturn(1);
		when(tresDeDiamantes.valor()).thenReturn(3);
		
		when(dosDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(dosDePica.palo()).thenReturn(PalosPoquer.PICA);
		when(dosDeCorazones.palo()).thenReturn(PalosPoquer.CORAZONES);
		
		//Excercise
		
		assertEquals("Trio", pokerStatus.verificar(dosDeDiamantes, dosDePica, dosDeCorazones, unoDeCorazones, tresDeDiamantes));
		//Verify
		verify(dosDeDiamantes,times(1)).valor();
		verify(dosDePica,times(1)).valor();
		verify(dosDeCorazones,times(1)).valor();
	}
	@Test
	public void testUnPoquerStatusRecibe5CartasYVerificaQueLaJugadaEsTrio() {
		Carta reinaDeCorazones = mock(Carta.class);
		Carta reinaDePica = mock(Carta.class);
		
		when(dosDeDiamantes.valor()).thenReturn(2);
		when(dosDePica.valor()).thenReturn(2);
		when(dosDeCorazones.valor()).thenReturn(2);
		when(reinaDeCorazones.valor()).thenReturn(11);
		when(reinaDePica.valor()).thenReturn(11);
		
		when(dosDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(dosDePica.palo()).thenReturn(PalosPoquer.PICA);
		when(dosDeCorazones.palo()).thenReturn(PalosPoquer.CORAZONES);
		
		//Excercise
		
		assertEquals("Trio", pokerStatus.verificar(dosDeDiamantes, dosDePica, dosDeCorazones, unoDeCorazones, tresDeDiamantes));
		//Verify
		verify(dosDeDiamantes,times(1)).valor();
		verify(dosDePica,times(1)).valor();
		verify(dosDeCorazones,times(1)).valor();
	}
	
	@Test
	public void testUnPoquerStatusRecibe5CartasYVerificaQueEsColor() {
		
		Carta sieteDeDiamantes = mock(Carta.class);
		Carta cuatroDeDiamantes = mock(Carta.class);
		Carta reinaDeDiamantes = mock(Carta.class);
		
		when(dosDeDiamantes.valor()).thenReturn(2);
		when(sieteDeDiamantes.valor()).thenReturn(7);
		when(cuatroDeDiamantes.valor()).thenReturn(4);
		when(tresDeDiamantes.valor()).thenReturn(3);
		when(reinaDeDiamantes.valor()).thenReturn(11);
		
		when(dosDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(sieteDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(cuatroDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(tresDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		when(reinaDeDiamantes.palo()).thenReturn(PalosPoquer.DIAMANTE);
		
		//Excercise
		assertEquals("Color", pokerStatus.verificar(dosDeDiamantes, sieteDeDiamantes, cuatroDeDiamantes, tresDeDiamantes, reinaDeDiamantes));
		//Verify
		verify(dosDeDiamantes,times(1)).palo();
		verify(sieteDeDiamantes,times(1)).palo();
		verify(cuatroDeDiamantes,times(1)).palo();
		verify(tresDeDiamantes,times(1)).palo();
		verify(reinaDeDiamantes,times(1)).palo();
	}
	
}
