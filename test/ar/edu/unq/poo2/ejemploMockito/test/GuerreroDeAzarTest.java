package ar.edu.unq.poo2.ejemploMockito.test;


import static org.mockito.Mockito.*;
import ar.edu.unq.poo2.ejemploMockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GuerreroDeAzarTest {
	
	private IMoneda moneda;
	private IGuerrero unGuerrero;
	private IGuerrero guerrero;
	
	@BeforeEach
	public void setUp() { 
		
		//Los que sean DOC (Doubles por los test) van a terminar siendo Mocks
		moneda = mock(IMoneda.class);                  
		unGuerrero = mock(IGuerrero.class);           

		guerrero = new GuerreroDeAzar(100,50,moneda); //SUT
	}
	
	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentanPuntosDeVidaDelAdversario() {
		
		when(this.moneda.esCara()).thenReturn(true);
		
		//Ejercicio
		guerrero.atacar(unGuerrero);
		
		//Verificacion
		verify(unGuerrero).descontarPuntosDeVida(50);
	}
	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCruzDescuentanPuntosDeVidaDeSiMismo() {
		
		//when(this.moneda.esCara()).thenReturn(false);
		
		//Exercise
		guerrero.atacar(unGuerrero);
		
		//Verify
		verify(unGuerrero, never()).descontarPuntosDeVida(50);
	}
}
