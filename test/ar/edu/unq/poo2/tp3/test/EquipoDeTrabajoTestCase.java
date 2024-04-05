package ar.edu.unq.poo2.tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.time.*;
import java.time.LocalDate;

import ar.edu.unq.poo2.tp3.*;

public class EquipoDeTrabajoTestCase {
	
		private EquipoDeTrabajo equipoDeTrabajo;
		
		private Persona franco;
		private Persona federico;
		private Persona rocio;
		private Persona messi;
		private Persona walle;
		
		private LocalDate nacimientoFranco;
		private LocalDate nacimientoFede;
		private LocalDate nacimientoRocio;
		private LocalDate nacimientoMessi;
		private LocalDate nacimientoWalle;
		/**
		 * Crea un escenario de test básico, que consiste en un equipo de trabajo
		 * con 5 integrantes.
		 *
		 * @throws Exception
		 */
		@BeforeEach
		public void setUp() throws Exception {
			//Se crea el equipo
			nacimientoFranco = LocalDate.of(2000, 5, 10);	
			franco = new Persona("Franco",nacimientoFranco,2024);
			
			nacimientoFede = LocalDate.of(2000, 4, 10);	
			federico = new Persona("Franco",nacimientoFede,2024);
			
			nacimientoRocio = LocalDate.of(2001, 3, 13);	
			rocio = new Persona("Franco",nacimientoRocio,2024);
			
			nacimientoMessi = LocalDate.of(2002, 10, 25);	
			messi = new Persona("Franco",nacimientoMessi,2024);
			
			nacimientoWalle= LocalDate.of(2001, 8, 13);	
			walle = new Persona("Franco",nacimientoWalle,2024);
			
			equipoDeTrabajo = new EquipoDeTrabajo("Mostacholes FC");
			
			equipoDeTrabajo.agregarPersona(franco);
			equipoDeTrabajo.agregarPersona(federico);
			equipoDeTrabajo.agregarPersona(rocio);
			equipoDeTrabajo.agregarPersona(messi);
			equipoDeTrabajo.agregarPersona(walle);
		}
		
		@Test
		public void testElNombreDelEquipo() {
			//Pido el area
			String nombre = equipoDeTrabajo.nombreEquipo();
			
			System.out.println("El promedio de edad es " + nombre);
			
			assertEquals("Mostacholes FC", nombre);
		}
		
		@Test
		public void testPromedioDeEdad() {
			//Pido el area
			int amount = equipoDeTrabajo.promedioEdadEquipo();
			
			System.out.println("El promedio de edad es " + amount);
			
			assertEquals(23, amount);
		}
		
}
