package fiuba.algo3.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Charmander;

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
	
	
}
