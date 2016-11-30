package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.Fogonazo;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Chansey;
import fiuba.algo3.modelo.algomon.Charmander;

public class FogonazoTest {
	
	@Test
	public void test_CharmanderDejaAChanseyEnEstadoQuemadoYleQuita2PuntosDeVidaPorElAtaqueFogonazo(){
		
		Algomon charmander=new Charmander();
		Algomon chansey=new Chansey();
		
		
		Ataque fogonazo=new Fogonazo();
		
		fogonazo.cargarAlgomonQueRealizaLaAccion(charmander);
		fogonazo.cargarAtacado(chansey);
		
		assertFalse(chansey.estaQuemado());
		assertFalse(fogonazo.getAlgomonAtacado().estaQuemado());
		
		
		assertEquals(130d,fogonazo.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		assertEquals(130d,chansey.getPuntosDeVida(),0.000d);
		
		
		fogonazo.causarEfecto(chansey, charmander);
		
		
		assertTrue(fogonazo.getAlgomonAtacado().estaQuemado());
		assertTrue(chansey.estaQuemado());
		
		assertEquals(128d,fogonazo.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		assertEquals(128d,chansey.getPuntosDeVida(),0.000d);
		
	}

}
