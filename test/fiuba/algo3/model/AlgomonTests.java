package fiuba.algo3.model;
import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.Algomon;
import fiuba.algo3.model.Burbuja;
import fiuba.algo3.model.Charmander;
import fiuba.algo3.model.Squirtle;

public class AlgomonTests {

	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaYLeQuita20Y40PuntosDeVidaACharmander()
	{
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();	
		assertEquals(170d, charmander.getPuntosDeVida(),0.000001d);
		squirtle.atacar(charmander,Burbuja.class);
		assertEquals(150d, charmander.getPuntosDeVida(),0.000001d);
		squirtle.atacar(charmander, CanionDeAgua.class);
		
	}

}