package ar.edu.unq.poo2.tp5.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.poo2.tp5.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ar.edu.unq.poo2.tp4.Producto;

public class CajaTest {
	
	private Producto arroz;
	private Producto vino;
	private ProductoCooperativa cerealOrganico;
	private ProductoCooperativa chocolateOrganico;
	private ProductoEmpresaTradicional mantecol;
	private ProductoEmpresaTradicional dulceDeLeche;
	
	private Caja caja1;
	private Caja caja2;
	
	private Repositorio repositorio;
	
	private AgenciaRecaudadora agencia;
	
	private Servicio servicioX;
	private Impuesto impuestoGanancia;
	
	@BeforeEach
	public void setUp() {
		
		//Agencia
		agencia = new AgenciaRecaudadora();
		
		//Repositorios
		repositorio = new Repositorio();
		
		//Cajas
		caja1 = new Caja(repositorio,agencia);
		caja2 = new Caja(repositorio,agencia);
		
		//Productos
		arroz = new Producto("Arroz", 18d,caja1);
		vino  = new Producto("Vino", 55d,caja1);
		
		//ProductosCooperativa
		cerealOrganico = new ProductoCooperativa("Cereal O2 Organico", 150d,caja1);
		chocolateOrganico = new ProductoCooperativa("Chocolate amargo Organico 80% Cacao", 200d,caja1);
		
		//ProductosEmpresaTradicional
		mantecol = new ProductoEmpresaTradicional("Mantecol Original", 50d,caja1);
		dulceDeLeche = new ProductoEmpresaTradicional("Dulce de Leche La Serenisima", 60d,caja1);
		
		List<Producto> productos = Arrays.asList(arroz,arroz,arroz,vino,vino,vino,cerealOrganico,cerealOrganico,
												 chocolateOrganico,chocolateOrganico,dulceDeLeche,dulceDeLeche,dulceDeLeche,
												 mantecol,mantecol,mantecol);
		repositorio.almacenarProductos(productos);
		
		//Facturas
		servicioX = new Servicio(5d,3d,LocalDate.of(2024, 03, 01),1d,agencia);
		impuestoGanancia = new Impuesto(servicioX,agencia);
		
	}
	//Probar test
	@Test
	public void testRegistroDeProductos() { //Probar que se registran los productos y se decrementa su stock
		
		assertEquals(0, caja1.getCantidadDeCosasRegistrables());
		assertEquals(0, caja2.getCantidadDeCosasRegistrables());
		
		caja1.registrarPago(arroz);
		caja2.registrarPago(arroz);
		caja2.registrarPago(chocolateOrganico);
		
		assertEquals(2, caja2.getCantidadDeCosasRegistrables());
		assertEquals(1, caja1.getCantidadDeCosasRegistrables());
		
		assertEquals(1, repositorio.getStockDe(arroz));
	}
	
	@Test
	public void testMontoTotalDeProductos() { //Se registran productos y el precio varia
		
		caja1.registrarPago(arroz);
		caja1.registrarPago(vino);
		caja1.registrarPago(cerealOrganico);
		caja1.registrarPago(chocolateOrganico);
		caja1.registrarPago(dulceDeLeche);
		caja1.registrarPago(mantecol);
		
		assertEquals(498d,caja1.montoTotalAPagar());  //*Hay productos que tienen descuento(Cooperativa)*
	}
	@Test
	public void testNoHayStockDelProducto() { //Se acaba el stock del producto y NO PUEDE decrementarse!
		
		caja1.registrarPago(chocolateOrganico);
		caja1.registrarPago(chocolateOrganico);
		
		assertEquals(0,repositorio.getStockDe(chocolateOrganico));
		
//		throwsException(caja2.registrarProducto(chocolateOrganico));    PROBAR EXPECIONN!! BUSCAR INFO
	}
	
	//Armar los test De la parte 2 de la caja del mercado central
	
	@Test
	public void testSeRegistranProductosYFacturas() {
		
		caja1.registrarPago(arroz);
		
		caja1.registrarPago(impuestoGanancia);
		caja1.registrarPago(servicioX);
		
		assertEquals(26d, caja1.montoTotalAPagar());
	}
}

