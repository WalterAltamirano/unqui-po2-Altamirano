package ar.edu.unq.poo2.tp4.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.poo2.tp4.*;

public class TrabajadorTest {

	private Trabajador nestor;
	private Trabajador miles;
	private Ingreso abril;
	
	@BeforeEach
	public void setUp() {
		//Trabajadores
		
		nestor = new Trabajador(5000);
		miles  = new Trabajador(5000);
		
		//Ingresos
		
		abril = new Ingreso("ServicioBasico",04,nestor);
		abril = new Ingreso("Administracion",04,miles);
		
		nestor.registrarIngreso(abril);
		miles.registrarIngreso(abril);
	}
	
	@Test
	public void testObtenerElMontoImponible() {
		assertEquals(5000,miles.getMontoImponible());
	}
	@Test
	public void testObtenerElImpuestoAPagar() {
		assertEquals(100,miles.getImpuestoAPagar());
	}
	@Test
	public void testObtenerTotalPercibido() {
		assertEquals(5000,miles.getTotalPercibido());
	}
	
	
}