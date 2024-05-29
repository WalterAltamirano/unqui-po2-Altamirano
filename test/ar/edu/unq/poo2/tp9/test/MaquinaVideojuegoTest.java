package ar.edu.unq.poo2.tp9.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.answers.Returns;

import ar.edu.unq.poo2.tp9.VideoJuegos.MaquinaVideoJuego;
import ar.edu.unq.poo2.tp9.VideoJuegos.Pantalla;
import ar.edu.unq.poo2.tp9.VideoJuegos.Ranura;
import ar.edu.unq.poo2.tp9.VideoJuegos.Usuario;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MaquinaVideojuegoTest {
	private Ranura ranura = mock(Ranura.class);
	private Pantalla pantalla = mock(Pantalla.class);
	private Usuario usuario = mock(Usuario.class);
	private MaquinaVideoJuego maquina = new MaquinaVideoJuego(usuario,ranura,pantalla);
	@BeforeEach 
	public void setUp(){
		ranura = mock(Ranura.class);
		pantalla = mock(Pantalla.class);
		usuario = mock(Usuario.class);
		maquina = new MaquinaVideoJuego(usuario,ranura,pantalla);
	}
	
	@Test
	public void testUsuarioIngresaMasDeDosFichasALaMaquinaEnStandByYLaMaquinaNoHaceNada() {
		//SetUp
//		Usuario usuario = mock(Usuario.class);
//		Ranura ranura = mock(Ranura.class);
//		Pantalla pantalla = mock(Pantalla.class);
//		MaquinaVideoJuego maquina = new MaquinaVideoJuego(usuario,ranura,pantalla);

		when(ranura.getEstaAbierta()).thenReturn(true);
		//Excercise
		maquina.ingresarFichas(5);
		
		//assertEquals(maquina.getFichasInsertadas(), 0);
		//Verify
		//Por default la ranura esta cerrada. Entonces jamas recibe las fichas el usuario
		verify(usuario,never()).recibirFichas(5);
		//TearDown
		
	}
	
	@Test
	public void testUsuarioApretaElBotonDeInicioIngresaUnaFichaYYLaMaquinaAbreLaRanuraYMuestraUnMensajeEnPantalla() {
		//SetUp
//		Ranura ranura = mock(Ranura.class);
//		Pantalla pantalla = mock(Pantalla.class);
//		Usuario usuario = mock(Usuario.class);
//		MaquinaVideoJuego maquina = new MaquinaVideoJuego(usuario,ranura,pantalla);
		//Excercise
		when(ranura.getEstaAbierta()).thenReturn(true);
		
		maquina.iniciar();
		
		//Verify
		verify(ranura).abrir();
		verify(pantalla).mostrar("Ingrese Fichas");
		//TearDown
	}
	@Test
	public void testUsuarioApretaDosVecesSeguidasElBotonDeInicioYLaMaquinaAbreLaRanuraYMuestraUnMensajeAdicionalEnPantalla() {
		//SetUp
		when(ranura.getEstaAbierta()).thenReturn(true);
		
		maquina.iniciar();
		maquina.iniciar();
		
		//assertEquals(1, maquina.getFichasInsertadas());
		//Verify
		verify(pantalla).mostrar("Ingrese Fichas");
		verify(pantalla).mostrar("No hay fichas ingresadas. Por favor Ingrese al menos una ficha.");
		
		//La ranura no deberia cerrarse
		verify(ranura,never()).cerrar();
		//TearDown
	}
	@Test
	public void testUsuarioApretaBotonDeInicioInsertaFichasVuelveAApretarElBotonEnUnaMaquinaYLaMaquinaAbreLaRanuraEIniciaElJuego() {
		//SetUp
		maquina.iniciar();
		maquina.ingresarFichas(1);
		maquina.iniciar();
		
		//assertEquals(1, maquina.getFichasInsertadas());
		//Verify
		verify(ranura).abrir();
		verify(pantalla).mostrar("Cargando...");
		//TearDown
	}
	@Test
	public void testUsuarioTerminaDeJugarYLaMaquinaQuedaEnStandBy() {
		//SetUp
		
	    //Excercise
		maquina.iniciar();
		maquina.ingresarFichas(1);
		maquina.iniciar();
		maquina.iniciar();
		//Verify
		//assertEquals(maquina.getFichasInsertadas(), 0);
		
		verify(pantalla).mostrar("Ha decidido finalizar el juego");
		verify(ranura).cerrar();
		//TearDown
	}
	
	@Test
	public void testUsuarioApretaBotonDeInicioEInsertaMasDeDosFichasYLaMaquinaSeLasDevuelveYMuestraUnMensajeEnPantalla() {
		//Setup
		
		maquina.iniciar();
		maquina.ingresarFichas(5);
		//Verify
		verify(pantalla).mostrar("Ingresar como maximo 2 fichas");
		verify(usuario).recibirFichas(5);
		
	}
}
