package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Fogonazo;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Chansey;
import fiuba.algo3.model.algomon.Charmander;

public class FogonazoTest {
	
	@Test
	public void test_CharmanderDejaAChanseyEnEstadoQuemadoYleQuita2PuntosDeVidaPorAtaqueFogonazo(){
		
		Algomon charmander=new Charmander();
		Algomon chansey=new Chansey();
		
		assertFalse(chansey.estaQuemado());
		
		Ataque fogonazo=new Fogonazo();
		
		fogonazo.causarEfecto(chansey, charmander);
		
		assertTrue(chansey.estaQuemado());
		
		assertEquals(128d,chansey.getPuntosDeVida(),0.000d);
	}

}
