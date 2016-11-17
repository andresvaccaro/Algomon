package fiuba.algo3.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgomonTest {

	/**
	 * Primer test
	 */
	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaACharmanderYLeQuita20Y40PuntosDeVidaACharmander() {
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		squirtle.atacar(charmander, Burbuja.class);
		assertEquals(150d, charmander.getPuntosDeVida(), 0.000001d);
		squirtle.atacar(charmander, CanionDeAgua.class);
		assertEquals(110d, charmander.getPuntosDeVida(), 0.000001d);

	}

	/**
	 * Segundo test
	 */
	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaABulbasaurYLeQuita5Y10PuntosDeVidaACharmander() {
		Algomon squirtle = new Squirtle();
		Algomon bulbasaur = new Bulbasaur();
		assertEquals(140d, bulbasaur.getPuntosDeVida(), 0.000001d);
		squirtle.atacar(bulbasaur, Burbuja.class);
		assertEquals(135d, bulbasaur.getPuntosDeVida(), 0.000001d);
		squirtle.atacar(bulbasaur, CanionDeAgua.class);
		assertEquals(125d, bulbasaur.getPuntosDeVida(), 0.000001d);

	}

	/**
	 * Tercer test
	 */
	@Test
	public void testSquirtleAtacaConBurbujaYCanionAguaAOtrosAlgomonesYLeQuita10Y20PuntosDeVidaACharmander() {
		Algomon jigglypuff = new Jigglypuff();
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);
		Algomon chansey = new Chansey();
		assertEquals(130d, chansey.getPuntosDeVida(), 0.000001d);
		Algomon squirtle = new Squirtle();
		squirtle.atacar(jigglypuff, Burbuja.class);
		assertEquals(120d, jigglypuff.getPuntosDeVida(), 0.000001d);
		squirtle.atacar(chansey, CanionDeAgua.class);
		assertEquals(110d, chansey.getPuntosDeVida(), 0.000001d);
	}

	/**
	 * cuarto test
	 */
	@Test
	public void testBulbasaurYChanseyAtacanConLatigoCepaASquirtleYLeQuitan30PuntosDeVida() {
		Algomon squirtle = new Squirtle();
		assertEquals(150d, squirtle.getPuntosDeVida(), 0.000001d);
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();

		chansey.atacar(squirtle, LatigoCepa.class);
		assertEquals(120d, squirtle.getPuntosDeVida(), 0.000001d);

		bulbasaur.atacar(squirtle, LatigoCepa.class);
		assertEquals(90d, squirtle.getPuntosDeVida(), 0.000001d);

	}

	/**
	 * Quinto test
	 */
	@Test
	public void testBulbasaurYChanseyAtacanConLatigoCepaACharmanderYLeQuitan7PuntosDeVida() {

		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();

		chansey.atacar(charmander, LatigoCepa.class);
		assertEquals(162.5d, charmander.getPuntosDeVida(), 0.000001d);

		bulbasaur.atacar(charmander, LatigoCepa.class);
		assertEquals(155d, charmander.getPuntosDeVida(), 0.000001d);

	}

	/**
	 * sexto test
	 */
	@Test
	public void testBulbasaurYChanseyAtacanConLatigoCepaAotrosAlgomonesYLesQuitan15PuntosDeVidaACadaUno() {

		Algomon rattata = new Rattata();
		Algomon jigglypuff = new Jigglypuff();

		assertEquals(170d, rattata.getPuntosDeVida(), 0.000001d);
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);

		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();

		chansey.atacar(rattata, LatigoCepa.class);
		assertEquals(155d, rattata.getPuntosDeVida(), 0.000001d);

		bulbasaur.atacar(jigglypuff, LatigoCepa.class);
		assertEquals(115d, jigglypuff.getPuntosDeVida(), 0.000001d);

	}

	
	/**
	 * septimo test
	 */
	@Test
	public void testCharmanderAtacaABalbasaurConBrasaYLeQuita32PuntosDeVida(){
			

		Algomon charmander = new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		
		assertEquals(140d, bulbasaur.getPuntosDeVida(),0.000001d);
				
		charmander.atacar(bulbasaur, Brasas.class);				
		assertEquals(108d, bulbasaur.getPuntosDeVida(),0.000001d);
		
					
	}
	
	/**
	 * octavo test
	 */
	@Test
	public void testCharmanderAtacaASquirtleYLeQuita8PuntosDeVida(){
			

		Algomon charmander = new Charmander();
		Algomon squirtle = new Squirtle();
		
		assertEquals(150d, squirtle.getPuntosDeVida(),0.000001d);
				
		charmander.atacar(squirtle, Brasas.class);				
		assertEquals(142, squirtle.getPuntosDeVida(),0.000001d);
		
					
	}
	
	/**
	 * noveno test
	 */
	@Test
	public void testCharmanderAtacaAOtrosAlgomonesYLesQuita16PuntosDeVida(){
			

		Algomon charmander = new Charmander();
		Algomon rattata = new Rattata();
		Algomon jigglypuff = new Jigglypuff();
		Algomon chansey = new Chansey();
		
		assertEquals(170d, rattata.getPuntosDeVida(),0.000001d);
		assertEquals(130d, chansey.getPuntosDeVida(),0.000001d);	
		assertEquals(130d, jigglypuff.getPuntosDeVida(),0.000001d);
		
		charmander.atacar(rattata, Brasas.class);		
		charmander.atacar(chansey, Brasas.class);				
		charmander.atacar(jigglypuff, Brasas.class);
		
		assertEquals(154d, rattata.getPuntosDeVida(),0.000001d);
		assertEquals(114d, chansey.getPuntosDeVida(),0.000001d);	
		assertEquals(114d, jigglypuff.getPuntosDeVida(),0.000001d);

		
					
	}
	
	
	
	
	
	


	/**
	 * Primer test segunda entrega
	 */
	@Test
	public void testJigglypuffYChanseyAtacanConCantoYElAlgomonAtacadoNoPuedeAtacarPorTresTurnos() {
		Algomon chansey = new Chansey();
		Algomon jigglypuff = new Jigglypuff();

		Algomon charmander = new Charmander();
		assertEquals(false, charmander.estaDormido());

		chansey.atacar(charmander, Canto.class);
		jigglypuff.atacar(charmander, Canto.class);

		charmander.atacar(jigglypuff, Fogonazo.class);
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);
		charmander.atacar(jigglypuff, Fogonazo.class);
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);
		charmander.atacar(jigglypuff, Fogonazo.class);
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);
	}

	/**
	 * Segundo test segunda entrega
	 */
	@Test
	public void testBulbasaurAtacaConChupavidasACharmanderYLeQuita30PuntosYGana9PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		assertEquals(140d, bulbasaur.getPuntosDeVida(), 0.000001d);

		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		
		bulbasaur.atacar(charmander, ChupaVidas.class);
		bulbasaur.atacar(charmander, ChupaVidas.class);
		bulbasaur.atacar(charmander, ChupaVidas.class);
		bulbasaur.atacar(charmander, ChupaVidas.class);
		assertEquals(149d, bulbasaur.getPuntosDeVida(), 0.000001d);
		assertEquals(140d, charmander.getPuntosDeVida(), 0.000001d);
		
	}
	

	/**
	 * Tercer  test segunda entrega
	 * Este test no funciona porque la cuenta que realiza es ChupaVidas(Tipo Planta)
	 * Ataca a un algomon de fuego le saca 15 puntos por 2 
	 * El total es 30 en lugar de 7
	 */
	@Test
	public void testBulbasaurAtacaConChupavidasASquirtleYLeQuita7PuntosYGana2PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		assertEquals(140d, bulbasaur.getPuntosDeVida(), 0.000001d);

		Algomon squirtle = new Squirtle();
		assertEquals(150d, squirtle.getPuntosDeVida(), 0.000001d);
		
		bulbasaur.atacar(squirtle, ChupaVidas.class);		
		assertEquals(120d, squirtle.getPuntosDeVida(), 0.000001d);
		assertEquals(149d, bulbasaur.getPuntosDeVida(), 0.000001d);
		
	}
	
	
	/**
	 * Cuarto  test segunda entrega	 
	 */
	@Test
	public void testBulbasaurAtacaConChupavidasAOtrosAlgomonesYLesQuita15PuntosDeVidaYAumenta4PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		assertEquals(140d, bulbasaur.getPuntosDeVida(), 0.000001d);

		Algomon jigglypuff = new Jigglypuff();
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);
		
		bulbasaur.atacar(jigglypuff, ChupaVidas.class);		
		assertEquals(115d, jigglypuff.getPuntosDeVida(), 0.000001d);
		assertEquals(144.5d, bulbasaur.getPuntosDeVida(), 0.000001d);
		
	}
	

	
	/**
	 * Quinto  test segunda entrega	 
	 */
	@Test
	public void testCharmanderYRattataAtacanConFogonazoYElAlgomonAtacadoRecibiraUn10PorCientoDeSusPuntosDeVidaOriginalesEnCada () {
		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		Algomon rattata = new Rattata();
		
		Algomon jigglypuff = new Jigglypuff();
		assertEquals(130d, jigglypuff.getPuntosDeVida(), 0.000001d);
		
		charmander.atacar(jigglypuff, Fogonazo.class);		
		assertEquals(128d, jigglypuff.getPuntosDeVida(), 0.000001d);
		rattata.atacar(jigglypuff, Fogonazo.class);		
		assertEquals(126d, jigglypuff.getPuntosDeVida(), 0.000001d);
		jigglypuff.atacar(charmander, Canto.class);
		assertEquals(113d, jigglypuff.getPuntosDeVida(), 0.000001d);
		
	}
	
	@Test
	public void testCharmanderRecibeUnaPocionYAumentaSusPuntosEn20() {
		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		Elemento pocion = new Pocion();
		charmander.recibirElemento(pocion);
		assertEquals(190d, charmander.getPuntosDeVida(), 0.000001d);		
		
	}
	
	@Test
	public void testCharmanderRecibeUnaSuperPocionYAumentaSusPuntosEn20() {
		Algomon charmander = new Charmander();
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		Elemento superPocion = new SuperPocion();
		charmander.recibirElemento(superPocion);
		assertEquals(210d, charmander.getPuntosDeVida(), 0.000001d);		
		
	}
	
	@Test
	public void testCharmanderEsQuemadoYDormidoYRecibeUnRestauradorYVuelveAestadosNormales() {
		Algomon charmander = new Charmander();
		Algomon jigglypuff = new Jigglypuff();
		Algomon rattata = new Rattata();
		jigglypuff.atacar(charmander, Canto.class);
		assertEquals(true, charmander.estaDormido());
		rattata.atacar(charmander, Fogonazo.class);
		assertEquals(true, charmander.estaQuemado());
		
		Elemento restaurador = new Restaurador();
		charmander.recibirElemento(restaurador);
		assertEquals(false, charmander.estaDormido());
		assertEquals(false, charmander.estaQuemado());
		
	}
	
	@Test
	public void testCharmanderRecibeVitaminasLuegoDeAtacarDosVecesYAumentaLaCantidadDeAtaquesDisponiblesEn2PorAtaque() {
		Algomon charmander = new Charmander();
		Algomon rattata= new Rattata();
		
		assertEquals(4, charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		charmander.atacar(rattata, Fogonazo.class);
		charmander.atacar(rattata, Fogonazo.class);
		assertEquals(2, charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		
		Elemento vitamina = new Vitamina();
		charmander.recibirElemento(vitamina);
		assertEquals(4, charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		
		
	}
	
}