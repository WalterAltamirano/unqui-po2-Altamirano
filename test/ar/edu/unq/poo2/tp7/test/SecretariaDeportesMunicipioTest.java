package ar.edu.unq.poo2.tp7.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp7.enums.*;
import ar.edu.unq.poo2.tp7.enums.ActividadSemanal.DiaDeLaSemana;

public class SecretariaDeportesMunicipioTest {
	
	private ActividadSemanal futbolTarde;
	private ActividadSemanal runningTarde;
	private ActividadSemanal tenisTarde;
	private ActividadSemanal futbolNoche;
	private ActividadSemanal basketNoche;
	private SecretariaDeportesMunicipio secretaria;
	@BeforeEach
	public void setUp() {
		futbolTarde = new ActividadSemanal(Deporte.FUTBOL,DiaDeLaSemana.LUNES,1,16);
		runningTarde = new ActividadSemanal(Deporte.RUNNING,DiaDeLaSemana.LUNES,1,18);
		tenisTarde = new ActividadSemanal(Deporte.TENNIS,DiaDeLaSemana.LUNES,1,17);
	    futbolNoche = new ActividadSemanal(Deporte.FUTBOL,DiaDeLaSemana.JUEVES,1,21);
	    basketNoche = new ActividadSemanal(Deporte.BASKET,DiaDeLaSemana.LUNES,1,20);
	    List<ActividadSemanal> actividades = Arrays.asList(futbolTarde,runningTarde,tenisTarde,futbolNoche,basketNoche);
	    secretaria = new SecretariaDeportesMunicipio(actividades);
	}
	
	@Test
	public void testUnaSecretariaEsConsultadaPorLasAcitivdadesSemanalesDeFutbolYDevuelveLasQueHaya() {
		//Setup
		
		//Excercise
		
		//Le pido las de futbol
		List<ActividadSemanal> actividadesFutbol = secretaria.actividadesDeFutbol();
		Stream<ActividadSemanal> actividadesFutbolStream = actividadesFutbol.stream(); 
		
		//Verify
		assertTrue(actividadesFutbolStream.allMatch(actividad -> actividad.getDeporte()== Deporte.FUTBOL));
		//Verifico si son todas de futbol
		
		//Tear Down
	}
/*  !------------------------------------------------------------!
	Otra opcion
	  List<ActividadSemanal> actividadesFutbol = Arrays.asList(futbolTarde,futbolNoche);
		
	  assertTrue(actividadesFutbol.equals(secretaria.actividadesDeFutbol()));
	!------------------------------------------------------------!
*/	
	@Test
	public void testUnaSecretariaEsConsultadaPorLasAcitivdadesDeComplejidadDada() {
		//Setup
		//
		List<ActividadSemanal> actividadesATestear = secretaria.actividadesSegunComplejidad(2);
		Stream<ActividadSemanal> actividadesStream = actividadesATestear.stream();
		//Excercise
	
		//Verify
		assertTrue(actividadesStream.allMatch(actividad -> actividad.getDeporte().getComplejidad() == 2));
		//Tear Down
	}
	@Test
	public void testUnaSecretariaAgregaNuevasActividadesYEsConsultadaPorLaCantidadDeHorasTotalesDeTodasSusActividades() {
		//Setup
		ActividadSemanal basketTarde = new ActividadSemanal(Deporte.BASKET,DiaDeLaSemana.MARTES,2,16);
		ActividadSemanal jabalinaTarde = new ActividadSemanal(Deporte.JABALINA,DiaDeLaSemana.MIERCOLES,2,16);
		
		//Excercise
		secretaria.agregarActividad(jabalinaTarde);
		secretaria.agregarActividad(basketTarde);
		
		//Verify
		assertEquals(9,secretaria.cantidadDeHorasTotalesDeActividadesSemanales());
		//Tear Down
		
		/*!!-----ENCONTRAR SOLUCION DE PORQUE NO SE PUEDE AGREGAR ELEMENTOS NUEVOS Y DESPUES VERIFICAR QUE PASA OTRA COSA-----!!*/
	}
	@Test
	public void testUnaSecretariaEsConsultadaPorLaActividadSemanalDeMenorCostoDeUnDeporteEspecifico() {
		//Setup
		//Excercise
		ActividadSemanal actividadDeMenorCostoFutbol = secretaria.laActividadSemanalDeMenorCostoDe(Deporte.FUTBOL);
		
		//Verify
		assertEquals(900,actividadDeMenorCostoFutbol.costoDeActividad());
		assertTrue(actividadDeMenorCostoFutbol.getDeporte() == Deporte.FUTBOL);
		//Tear Down
	}
}	

