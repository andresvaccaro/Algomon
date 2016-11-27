package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.accion.ataque.Brasas;
import fiuba.algo3.model.accion.ataque.Burbuja;
import fiuba.algo3.model.accion.ataque.CanionDeAgua;
import fiuba.algo3.model.accion.ataque.Canto;
import fiuba.algo3.model.accion.ataque.ChupaVidas;
import fiuba.algo3.model.accion.ataque.Fogonazo;
import fiuba.algo3.model.accion.ataque.LatigoCepa;
import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.Pocion;
import fiuba.algo3.model.accion.elemento.Restaurador;
import fiuba.algo3.model.accion.elemento.SuperPocion;
import fiuba.algo3.model.accion.elemento.Vitamina;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Chansey;
import fiuba.algo3.model.algomon.Charmander;
import fiuba.algo3.model.algomon.Jigglypuff;
import fiuba.algo3.model.algomon.Rattata;
import fiuba.algo3.model.algomon.Squirtle;

public class AlgomonTest {


	@Test
	public void test_1_SquirtleAtacaConBurbujaYCanionAguaACharmanderYLeQuita20Y40PuntosDeVidaACharmander() {
		
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		
		squirtle.atacar(charmander, Burbuja.class);
		
		assertEquals(150d, charmander.getPuntosDeVida(), 0.000001d);
		
		squirtle.atacar(charmander, CanionDeAgua.class);
		
		assertEquals(110d, charmander.getPuntosDeVida(), 0.000001d);

	}

	
	@Test
	public void test_2_SquirtleAtacaConBurbujaYCanionAguaABulbasaurYLeQuita5Y10PuntosDeVidaACharmander() {
		
		Algomon squirtle = new Squirtle();
		Algomon bulbasaur = new Bulbasaur();
		
		assertEquals(140d, bulbasaur.getPuntosDeVida(), 0.000001d);
		
		squirtle.atacar(bulbasaur, Burbuja.class);
		
		assertEquals(135d, bulbasaur.getPuntosDeVida(), 0.000001d);
		
		squirtle.atacar(bulbasaur, CanionDeAgua.class);
		
		assertEquals(125d, bulbasaur.getPuntosDeVida(), 0.000001d);

	}

	
	@Test
	public void test3_SquirtleAtacaConBurbujaYCanionAguaAOtrosAlgomonesYLeQuita10Y20PuntosDeVidaACharmander() {
		
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

	
	@Test
	public void test4_BulbasaurYChanseyAtacanConLatigoCepaASquirtleYLeQuitan30PuntosDeVida() {
		
		Algomon squirtle = new Squirtle();
		
		assertEquals(150d, squirtle.getPuntosDeVida(), 0.000001d);
		
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();

		chansey.atacar(squirtle, LatigoCepa.class);
		
		assertEquals(120d, squirtle.getPuntosDeVida(), 0.000001d);

		bulbasaur.atacar(squirtle, LatigoCepa.class);
		
		assertEquals(90d, squirtle.getPuntosDeVida(), 0.000001d);

	}

	
	@Test
	public void test5_BulbasaurYChanseyAtacanConLatigoCepaACharmanderYLeQuitan7PuntosDeVida() {

		Algomon charmander = new Charmander();
		
		assertEquals(170d, charmander.getPuntosDeVida(), 0.000001d);
		
		Algomon chansey = new Chansey();
		Algomon bulbasaur = new Bulbasaur();

		chansey.atacar(charmander, LatigoCepa.class);
		
		assertEquals(162.5d, charmander.getPuntosDeVida(), 0.000001d);

		bulbasaur.atacar(charmander, LatigoCepa.class);
		
		assertEquals(155d, charmander.getPuntosDeVida(), 0.000001d);

	}

	
	@Test
	public void test6_BulbasaurYChanseyAtacanConLatigoCepaAotrosAlgomonesYLesQuitan15PuntosDeVidaACadaUno() {

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

	
	
	@Test
	public void test7_CharmanderAtacaABalbasaurConBrasaYLeQuita32PuntosDeVida(){
			

		Algomon charmander = new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		
		assertEquals(140d, bulbasaur.getPuntosDeVida(),0.000001d);
				
		charmander.atacar(bulbasaur, Brasas.class);
		
		assertEquals(108d, bulbasaur.getPuntosDeVida(),0.000001d);
					
	}
	
	
	@Test
	public void test8_CharmanderAtacaASquirtleYLeQuita8PuntosDeVida(){
			

		Algomon charmander = new Charmander();
		Algomon squirtle = new Squirtle();
		
		assertEquals(150d, squirtle.getPuntosDeVida(),0.000001d);
				
		charmander.atacar(squirtle, Brasas.class);
		
		assertEquals(142, squirtle.getPuntosDeVida(),0.000001d);
					
	}
	
	
	@Test
	public void test9_CharmanderAtacaAOtrosAlgomonesYLesQuita16PuntosDeVida(){
			

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
	
	@Test
	public void test10_AlgomonesAtacanConAtaqueRapidoAOtrosAlgomonesYLesQuitan10PuntosDeVidaIndependientementeDelAlgomonQueSea(){
			
		Algomon rattata = new Rattata();
		Algomon jigglypuff = new Jigglypuff();
		Algomon chansey = new Chansey();
		Algomon charmander = new Charmander();
		Algomon squirtle = new Squirtle();
		Algomon bulbasaur = new Bulbasaur();
		
		assertEquals(130d, chansey.getPuntosDeVida(),0.000001d);	
		assertEquals(170d, charmander.getPuntosDeVida(),0.000001d);
		assertEquals(150d, squirtle.getPuntosDeVida(),0.000001d);
		assertEquals(140d, bulbasaur.getPuntosDeVida(),0.000001d);
		
		rattata.atacar(chansey, AtaqueRapido.class);		
		rattata.atacar(charmander, AtaqueRapido.class);				
		rattata.atacar(squirtle, AtaqueRapido.class);
		rattata.atacar(bulbasaur,AtaqueRapido.class);
		
		assertEquals(120d, chansey.getPuntosDeVida(),0.000001d);
		assertEquals(160d, charmander.getPuntosDeVida(),0.000001d);	
		assertEquals(140d, squirtle.getPuntosDeVida(),0.000001d);
		assertEquals(130d, bulbasaur.getPuntosDeVida(),0.000001d);
		
		jigglypuff.atacar(chansey, AtaqueRapido.class);		
		jigglypuff.atacar(charmander, AtaqueRapido.class);				
		jigglypuff.atacar(squirtle, AtaqueRapido.class);
		jigglypuff.atacar(bulbasaur,AtaqueRapido.class);
		
		assertEquals(110d, chansey.getPuntosDeVida(),0.000001d);
		assertEquals(150d, charmander.getPuntosDeVida(),0.000001d);	
		assertEquals(130d, squirtle.getPuntosDeVida(),0.000001d);
		assertEquals(120d, bulbasaur.getPuntosDeVida(),0.000001d);
		
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