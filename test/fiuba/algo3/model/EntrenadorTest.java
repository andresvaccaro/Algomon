package fiuba.algo3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fiuba.algo3.modelo.Entrenador;
import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.accion.elemento.Pocion;
import fiuba.algo3.modelo.accion.elemento.Restaurador;
import fiuba.algo3.modelo.accion.elemento.SuperPocion;
import fiuba.algo3.modelo.accion.elemento.Vitamina;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Bulbasaur;
import fiuba.algo3.modelo.algomon.Charmander;
import fiuba.algo3.modelo.algomon.Squirtle;

public class EntrenadorTest {

	@Test
	public void test01SeCreaEntrenadorSinAlgomonesYSeVerificaQueEsteNoTengaNinguno(){
		
		Entrenador entrenador = new Entrenador("Ash");
		
		assertEquals(entrenador.getNombre(),"Ash");
		
		List<Algomon> listaSinAlgomones = new ArrayList<Algomon>();
		
		assertEquals(entrenador.getAlgomones(),listaSinAlgomones);
		
	}
	
	@Test
	public void test02SeAgregaAlgomonAlEntrenadorYSeVerificaQueSeAgregue(){
		
		Entrenador entrenador = new Entrenador("Ash");
		
		Algomon charmander = new Charmander();
		
		entrenador.agregarAlgomon(charmander);
		
		assertEquals(entrenador.obtenerAlgomonActivo(),charmander);
		
	}
	
	
	@Test
	public void test03SeAgregan3AlgomonesAlEntrenadorYSeVerificaQueElActivoSeaElPrimeroAgregado(){
		
		Entrenador entrenador = new Entrenador("Ash");
		
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		
		entrenador.agregarAlgomon(squirtle);
		entrenador.agregarAlgomon(bulbasaur);
		entrenador.agregarAlgomon(charmander);
		
		assertEquals(entrenador.obtenerAlgomonActivo(),squirtle);
		assertEquals(entrenador.obtenerNombreAlgomonActivo(),"Squirtle");
		
	}
	
	@Test
	public void test04SeAgregan3AlgomonesAlEntrenadorYSeCambiaElAlgomonActivoPorElTerceroAgregado(){
		Entrenador entrenador = new Entrenador("Ash");
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		entrenador.agregarAlgomon(squirtle);
		entrenador.agregarAlgomon(bulbasaur);
		entrenador.agregarAlgomon(charmander);
		entrenador.cambiarAlgomonActivo(3);
		assertEquals(entrenador.obtenerAlgomonActivo(),charmander);
		assertEquals(entrenador.obtenerNombreAlgomonActivo(),"Charmander");
		
	}
	
	@Test
	public void test05SeAgregan2AlgomonesAlEntrenadorYSeObtieneLaListaDeAtaquesDelAlgomonActivo(){
		Entrenador entrenador = new Entrenador("Ash");
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		entrenador.agregarAlgomon(squirtle);
		entrenador.agregarAlgomon(charmander);
		List<Ataque> ataquesDeSquirtle = squirtle.obtenerAtaquesDisponibles();
		assertEquals(entrenador.obtenerAtaquesDeAlgomonActivo().size(),3);
		assertEquals(entrenador.obtenerAtaquesDeAlgomonActivo(),ataquesDeSquirtle);
		
	}
	
	@Test
	public void test06LosAlgomonesCorrespondientesAlEntrenadorSeQuedanSinVidaEntoncesElEntrenadorNoTieneAlgomonesVivos(){
		Entrenador entrenador = new Entrenador("Ash");
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		entrenador.agregarAlgomon(squirtle);
		entrenador.agregarAlgomon(charmander);
		assertTrue(entrenador.tieneAlgomonesVivos());
		
		double puntosDeVidaSquirtle = squirtle.getPuntosDeVida();
		double puntosDeVidaCharmander = charmander.getPuntosDeVida();
		squirtle.disminuirPuntosDeVida(puntosDeVidaSquirtle);
		charmander.disminuirPuntosDeVida(puntosDeVidaCharmander);
		assertFalse(entrenador.tieneAlgomonesVivos());
		
	}
	
	@Test
	public void test07SeCreaUnEntrenadorYSeObtienenTodosLosElementosDisponibles(){
		Entrenador entrenador = new Entrenador("Ash");
		List<Elemento> elementos = entrenador.obtenerElementosDisponibles();
		assertEquals(Pocion.class, elementos.get(0).getClass());
		assertEquals(SuperPocion.class, elementos.get(1).getClass());
		assertEquals(Vitamina.class, elementos.get(2).getClass());
		assertEquals(Restaurador.class, elementos.get(3).getClass());
		
	}
	

	@Test
	public void test08SeCreaUnEntrenadorYSeLosAlgomonesNoActivos(){
		Entrenador entrenador = new Entrenador("Ash");
		entrenador.agregarAlgomon(new Charmander());
		entrenador.agregarAlgomon(new Bulbasaur());
		entrenador.agregarAlgomon(new Squirtle());
		List<Algomon> algomones= entrenador.obtenerAlgomonesNoActivos();
		assertEquals(Bulbasaur.class, algomones.get(0).getClass());
		assertEquals(Squirtle.class, algomones.get(1).getClass());		
		
	}
	

	@Test
	public void testSeBuscaUnElementoQueNoContieneElEntrenadorYretornaComoCantidadCero(){
		Entrenador entrenador = new Entrenador("Ash");
		assertEquals(0, entrenador.obtenerCantidadDeElementosDisponibles("Sopa"));				
	}
	
	@Test
	public void testSeBuscaLaCantidadDeSuperpocionesYdevuelve2(){
		Entrenador entrenador = new Entrenador("Ash");
		assertEquals(2, entrenador.obtenerCantidadDeElementosDisponibles("SuperPocion"));				
	}
	
	
	
	
}
