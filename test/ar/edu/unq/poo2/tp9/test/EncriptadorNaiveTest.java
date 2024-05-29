package ar.edu.unq.poo2.tp9.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import org.junit.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp9.Encriptacion.*;

public class EncriptadorNaiveTest {
	
	private EncriptadorNaive encriptador;
	private EstrategiaEncriptador estrategiaAUtilizar;
	private EstrategiaEncriptador estrategiaAUtilizar2;
	private String palabra1;
	private String palabra2;
	private String palabra3;
	private String palabra4;
	private String palabra5;
	private String palabra6;
	private String palabraEncriptadaVocal1;
	private String palabraEncriptadaVocal2;
	private String palabraEncriptadaVocal3;
	private String palabraEncriptadaVocal4;
	private String palabraEncriptadaNumero1;
	private String palabraEncriptadaNumero5;
	
	@BeforeEach
	public void setUp() {
		//Faltaria incluir al usuario que elige la estrategia para encriptar/Desencriptar
		estrategiaAUtilizar2 = new EstrategiaNumero();
		estrategiaAUtilizar = new EstrategiaVocal();
		encriptador = new EncriptadorNaive(estrategiaAUtilizar);
		
		palabra1 = "aloja";
		palabra2 = "mastodonte";
		palabra3 = "mailin";
		palabra4 = "Hola como te va";
		palabra5 = "Red";
		palabra6 = "claro";
		palabraEncriptadaVocal1 = "eluje";
		palabraEncriptadaVocal2 = "mestudunti";
		palabraEncriptadaVocal3 = "meolon";
		palabraEncriptadaVocal4 = "Hule cumu ti ve";
		
		palabraEncriptadaNumero1 = "1 12 15 10 1";
		palabraEncriptadaNumero5 = "18 5 4";
	}
	
	
	@Test
	public void testEncriptarPalabrasConEstrategiaVocal() {
		//Setup
//		EstrategiaEncriptador estrategiaAUtilizar = new EstrategiaVocal();
//		EncriptadorNaive encriptadorNuevo = new EncriptadorNaive(estrategiaAUtilizar);
//		
//		String palabra1 = "aloja";
//		String palabra2 = "mastodonte";
//		String palabra3 = "mailin";
//		String palabra4 = "Hola como te va";
		
		//Excercise
		
		//El usuario cambia de estrategia y la elige
		
		
		//Verify
		
		assertTrue("eluje".equals(encriptador.transformar(palabra1)));
		assertTrue("mestudunti".equals(encriptador.transformar(palabra2)));
		assertTrue("meolon".equals(encriptador.transformar(palabra3)));
		assertTrue("Hule cumu ti ve".equals(encriptador.transformar(palabra4)));
		//Tear Down
	}
	@Test
	public void testDesencriptarPalabrasConEstrategiaVocal() {
		//Setup
//		EstrategiaEncriptador estrategiaVocal = new EstrategiaVocal();
//		EncriptadorNaive encriptador = new EncriptadorNaive(estrategiaVocal);
//		
//		String palabraEncriptada1 = "eluje";
//		String palabraEncriptada2 = "mestudunti";
//		String palabraEncriptada3 = "meolon";
//		String palabraEncriptada4 = "Hule cumu ti ve";
		//Excercise
		//El usuario cambia de estrategia y la elige
		
		//Verify
		assertTrue("aloja".equals(encriptador.decifrar(palabraEncriptadaVocal1)));
		assertTrue("mastodonte".equals(encriptador.decifrar(palabraEncriptadaVocal2)));
		assertTrue("mailin".equals(encriptador.decifrar(palabraEncriptadaVocal3)));
		assertTrue("Hola como te va".equals(encriptador.decifrar(palabraEncriptadaVocal4)));
		//Tear Down
	}
	@Test
	public void testEncriptarPalabrasConEstrategiaNumero() {
		//Setup
		
		
		//Excercise
		//El usuario cambia de estrategia y la elige
		
		encriptador.setEstrategia(estrategiaAUtilizar2);

		
		//Verify
		assertTrue("1,12,15,10,1".equals(encriptador.transformar(palabra1)));
		assertTrue("18,5,4".equals(encriptador.transformar(palabra5)));
		
		//Tear Down
	}
	@Test
	public void testDesencriptarPalabrasConEstrategiaNumero() {
		//Setup
		
		
		//Excercise
		//El usuario cambia de estrategia y la elige
		
		encriptador.setEstrategia(estrategiaAUtilizar2);

		
		//Verify
		assertTrue("aloja".equals(encriptador.decifrar(palabraEncriptadaNumero1)));
		assertTrue("red".equals(encriptador.decifrar(palabraEncriptadaNumero5)));
		
		//Tear Down
	}
}	
