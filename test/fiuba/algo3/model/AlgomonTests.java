package fiuba.algo3.model;
import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.Algomon;
import fiuba.algo3.model.Burbuja;
import fiuba.algo3.model.Charmander;
import fiuba.algo3.model.Squirtle;

public class AlgomonTests {

	
	/**
	 * Primer test
	 */
	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaACharmanderYLeQuita20Y40PuntosDeVidaACharmander()
	{
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();	
		assertEquals(170d, charmander.getPuntosDeVida(),0.000001d);
		squirtle.atacar(charmander,Burbuja.class);
		assertEquals(150d, charmander.getPuntosDeVida(),0.000001d);
		squirtle.atacar(charmander, CanionDeAgua.class);
		assertEquals(110d, charmander.getPuntosDeVida(),0.000001d);
		
	}


	/**
	 * Segundo test
	 */
	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaABulbasaurYLeQuita5Y10PuntosDeVidaACharmander()
	{
						
		Algomon squirtle = new Squirtle();
		Algomon bulbasaur = new Bulbasaur();	
		assertEquals(140d, bulbasaur.getPuntosDeVida(),0.000001d);
		squirtle.atacar(bulbasaur,Burbuja.class);
		assertEquals(135d, bulbasaur.getPuntosDeVida(),0.000001d);
		squirtle.atacar(bulbasaur, CanionDeAgua.class);
		assertEquals(125d, bulbasaur.getPuntosDeVida(),0.000001d);
		
	}
	
	
}