package ar.edu.unq.poo2.tp6.test;


import static org.junit.jupiter.api.Assertions.*;
import ar.edu.unq.poo2.tp6.banco.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
		
		private Cliente clienteWalle;
		private Banco banco;
		@BeforeEach
		public void setUp() {
			 clienteWalle = new Cliente("Walle","Altamirano",22,"Maradona al 1986", 10000);
			 banco = new Banco();
		}
		
		@Test
		public void testUnBancoRecibeUnaSolicitudDeCreditoPersonalYLaAcepta() {
			//TDD
			//Setup
//			Cliente clienteWalle = new Cliente("Walle","Altamirano",22,"Maradona al 1986", 10000);
//			Banco banco = new Banco();
			
			//Exercise
			banco.agregarCliente(clienteWalle);
			
			clienteWalle.solicitarCreditoPersonal(banco, 90000, 36);
			
			banco.evaluarSolicitudes();
			//Verify
			assertEquals(90000, banco.montoTotalADesembolsar());
			//Con mockito tendria que verificar que al cliente se le depositaron los 90000
			//Tear Down
			
		}
		@Test 
		public void testUnBancoRecibeUnaSolicitudDeCreditoPersonalYLaRechaza() {
			//TDD
			//Setup
//			Cliente clienteWalle = new Cliente("Walle","Altamirano",22,"Maradona al 1986", 10000);
//			Banco banco = new Banco();
			
			//Exercise
			banco.agregarCliente(clienteWalle);
			
			clienteWalle.solicitarCreditoPersonal(banco, 200000, 24);
			
			banco.evaluarSolicitudes();
			//Verify
			assertEquals(0, banco.montoTotalADesembolsar());
		}
		@Test
		public void testUnBancoRecibeUnaSolicitudDeCreditoHipotecarioYLaAcepta() {
			//TDD
			//Setup
			
			//Exercise
			banco.agregarCliente(clienteWalle);
			
			clienteWalle.solicitarCreditoHipotecario(banco, 300000, 24);
			
			banco.evaluarSolicitudes();
			//Verify
			assertEquals(300000, banco.montoTotalADesembolsar()); //!!Falta Implementar Hipotecario!!
			
			//TearDown
			
		}
		@Test 
		public void testUnBancoRecibeUnaSolicitudDeCreditoHipotecarioYLaRechaza() {
			//TDD
			//Setup
			
			//Exercise
			banco.agregarCliente(clienteWalle);
			
			clienteWalle.solicitarCreditoHipotecario(banco, 400000, 24);
			
			banco.evaluarSolicitudes();
			//Verify
			assertEquals(0, banco.montoTotalADesembolsar());
			
			//Tear Down
		}
		
		@Test
		public void testSolicitudesQueFueronAceptadas() {
			//TDD
			//Setup
			PropiedadInmobiliaria propiedadMat = new PropiedadInmobiliaria("Lote de 5x7","Mar del Plata N 540",20000);
			PropiedadInmobiliaria propiedadIan = new PropiedadInmobiliaria("Lote de 5x7","Neuquen N 123",30000);
			
			Cliente clienteNick = new Cliente("Nick","Alderecho",22,"Menotti al 400", 12000);
			Cliente clienteIan = new Cliente("Walle","Altamirano",22,"Maradona al 1986", 6000,propiedadIan);
			Cliente clienteMat = new Cliente("Walle","Altamirano",22,"Maradona al 1986", 5000, propiedadMat);
			
			
			//Exercise
			banco.agregarCliente(clienteWalle);
			banco.agregarCliente(clienteIan);
			banco.agregarCliente(clienteMat);
			banco.agregarCliente(clienteNick);
			
			clienteIan.solicitarCreditoHipotecario(banco, 400000, 24); 
			clienteWalle.solicitarCreditoPersonal(banco, 400000, 24);
			clienteMat.solicitarCreditoHipotecario(banco, 400000, 24);
			clienteNick.solicitarCreditoPersonal(banco, 400000, 24);
			
			banco.evaluarSolicitudes();
			//Verify
			assertEquals(0, banco.montoTotalADesembolsar()); //Se verifica el monto de las que fueron aceptadas
			//!!Falta Implementar Hipotecario!!
			
			//Tear Down
		}
		@Test
		public void testCantidadDeClientesAgregados() {
			//Podria hacerse este test con mockito que verifica que si los clientes fueron agregados
			//En un orden preeestablecido y tambien la cantidad de clientes que son en el banco
		}
		
}
