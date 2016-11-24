package fiuba.algo3.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Charmander;
import fiuba.algo3.model.algomon.Squirtle;

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
	
	
}
