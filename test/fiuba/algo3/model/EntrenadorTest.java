package fiuba.algo3.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fiuba.algo3.model.algomon.Algomon;

public class EntrenadorTest {

	@Test
	public void test01SeCreaEntrenadorSinAlgomonesYSeVerificaQueEsteNoTengaNinguno(){
		Entrenador entrenador = new Entrenador("Ash");
		assertEquals(entrenador.getNombre(),"Ash");
		List<Algomon> listaSinAlgomones = new ArrayList<Algomon>();
		assertEquals(entrenador.getAlgomones(),listaSinAlgomones);
		
	}
	
	
}
