package fiuba.algo3.model;
import static org.junit.Assert.*;

import org.junit.Test;

public class AlgomonTest {

	
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
	


	/**
	 * Tercer test
	 */
	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaAOtrosAlgomonesYLeQuita10Y20PuntosDeVidaACharmander(){
		Algomon jigglypuff = new Jigglypuff();
		assertEquals(130d, jigglypuff.getPuntosDeVida(),0.000001d);
		Algomon chansey = new Chansey();
		assertEquals(130d, chansey.getPuntosDeVida(),0.000001d);		
		Algomon squirtle = new Squirtle();
		squirtle.atacar(jigglypuff, Burbuja.class);
		assertEquals(120d, jigglypuff.getPuntosDeVida(),0.000001d);
		squirtle.atacar(chansey, CanionDeAgua.class);
		assertEquals(110d, chansey.getPuntosDeVida(),0.000001d);		
	}

	/**
	 * cuarto test
	 */
	@Test
	public void testBulbasaurYChanseyAtacanConLatigoCepaASquirtleYLeQuitan30PuntosDeVida(){
		Algomon squirtle = new Squirtle();
		assertEquals(150d, squirtle.getPuntosDeVida(),0.000001d);
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();		
		
		chansey.atacar(squirtle, LatigoCepa.class);				
		assertEquals(120d, squirtle.getPuntosDeVida(),0.000001d);
		
		bulbasaur.atacar(squirtle, LatigoCepa.class);			
		assertEquals(90d, squirtle.getPuntosDeVida(),0.000001d);
					
	}
		
	
	/**
	 * Quinto test
	 */
	@Test
	public void testBulbasaurYChanseyAtacanConLatigoCepaACharmanderYLeQuitan7PuntosDeVida(){
			

		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(),0.000001d);
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();		
		
		chansey.atacar(charmander, LatigoCepa.class);				
		assertEquals(162.5d, charmander.getPuntosDeVida(),0.000001d);
		
		bulbasaur.atacar(charmander, LatigoCepa.class);			
		assertEquals(155d, charmander.getPuntosDeVida(),0.000001d);
					
	}

	
	/**
	 * sexto test
	 */
	@Test
	public void testBulbasaurYChanseyAtacanConLatigoCepaAotrosAlgomonesYLesQuitan15PuntosDeVidaACadaUno(){
			

		Algomon rattata = new Rattata();
		Algomon jigglypuff = new Jigglypuff();
		
		assertEquals(170d, rattata.getPuntosDeVida(),0.000001d);
		assertEquals(130d, jigglypuff.getPuntosDeVida(),0.000001d);
		
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();		
		
		chansey.atacar(rattata, LatigoCepa.class);				
		assertEquals(155d, rattata.getPuntosDeVida(),0.000001d);
		
		bulbasaur.atacar(jigglypuff, LatigoCepa.class);			
		assertEquals(115d, jigglypuff.getPuntosDeVida(),0.000001d);
					
	}
	

	/**
	 * Primer test segunda entrega
	 */
	@Test
	public void testJigglypuffYChanseyAtacanConCantoYElAlgomonAtacadoNoPuedeAtacarPorTresTurnos(){
			

		Algomon chansey = new Chansey();
		Algomon jigglypuff = new Jigglypuff();
		
		Algomon charmander = new Charmander();
		assertEquals(false,charmander.estaDormido());
		
		chansey.atacar(charmander, Canto.class);
		jigglypuff.atacar(charmander, Canto.class);
		
						
		charmander.atacar(jigglypuff, Fogonaso.class);
		assertEquals(130d,jigglypuff.getPuntosDeVida(),0.000001d);
		charmander.atacar(jigglypuff, Fogonaso.class);
		assertEquals(130d,jigglypuff.getPuntosDeVida(),0.000001d);
		charmander.atacar(jigglypuff, Fogonaso.class);
		assertEquals(130d,jigglypuff.getPuntosDeVida(),0.000001d);
					
	}
	
}