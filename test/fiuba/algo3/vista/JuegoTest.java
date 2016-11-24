package fiuba.algo3.vista;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Fogonazo;
import fiuba.algo3.model.accion.elemento.Vitamina;
import fiuba.algo3.model.algomon.Algomon;

public class JuegoTest {

	
	
	@Test
	public void testSeCreaUnNuevoJuegoYSeAgreganDosEntrenadores() {
		Juego juego = new Juego();		
		juego.agregarEntrenador("Primer Entrenador");
		juego.agregarEntrenador("Segundo Entrenador");
		
		assertEquals("Primer Entrenador", juego.obtenerNombreJugadorActivo());
		juego.cambiarJugador();
		assertEquals("Segundo Entrenador", juego.obtenerNombreJugadorActivo());
	}
	
	@Test
	public void testSeSeleccionaParaUnEntrenadorCharmanderBulbasaurYChansey() {
		Juego juego = new Juego();
		juego.agregarEntrenador("Primer Entrenador");		
		juego.agregarCharmanderAentrenador(juego.getEntrenadorActivo());
		juego.agregarBulbasaurAentrenador(juego.getEntrenadorActivo());
		juego.agregarChanseyAentrenador(juego.getEntrenadorActivo());
		
		assertEquals("Charmander", juego.getEntrenadorActivo().getAlgomones().get(0).getNombre());
		assertEquals("Bulbasaur", juego.getEntrenadorActivo().getAlgomones().get(1).getNombre());
		assertEquals("Chansey", juego.getEntrenadorActivo().getAlgomones().get(2).getNombre());
		
	}
	
	@Test
	public void testSeSeleccionaParaUnEntrenadorCharmanderBulbasaurYChanseyYElAlgomonActivoEsCharmander() {
		Juego juego = new Juego();
		juego.agregarEntrenador("Primer Entrenador");		
		juego.agregarCharmanderAentrenador(juego.getEntrenadorActivo());
		juego.agregarBulbasaurAentrenador(juego.getEntrenadorActivo());
		juego.agregarChanseyAentrenador(juego.getEntrenadorActivo());		
		assertEquals("Charmander", juego.obtenerNombreAlgomonActivo());			
	}

	
	@Test
	public void testCharmanderAtacaConFogonazoAJigglypuffyLeSaca2PuntosYloDejaQuemado() {
		Juego juego = new Juego();
		juego.agregarEntrenador("Primer Entrenador");		
		juego.agregarCharmanderAentrenador(juego.getEntrenadorActivo());
		juego.agregarBulbasaurAentrenador(juego.getEntrenadorActivo());
		juego.agregarChanseyAentrenador(juego.getEntrenadorActivo());		
		assertEquals("Charmander", juego.obtenerNombreAlgomonActivo());			
		
		juego.agregarEntrenador("Segundo Entrenador");		
		juego.agregarJigglypuffAentrenador(juego.getEntrenador2());
		juego.agregarBulbasaurAentrenador(juego.getEntrenador2());
		juego.agregarChanseyAentrenador(juego.getEntrenador2());		
		assertEquals("Jigglypuff", juego.getEntrenador2().obtenerNombreAlgomonActivo());		
		juego.atacar(new Fogonazo());		
		assertEquals(128d, juego.getEntrenador2().obtenerAlgomonActivo().getPuntosDeVida(),0.000001d);		
		assertEquals(true, juego.getEntrenador2().obtenerAlgomonActivo().estaQuemado());		
	}
	
	@Test
	public void testCharmanderAtacaConFogonazoATodosLosAlgomonesDelEntrenadorRivalHastaQueFinalizaElJuego() {
		Juego juego = new Juego();
		juego.agregarEntrenador("Primer Entrenador");
		juego.agregarCharmanderAentrenador(juego.getEntrenadorActivo());
		juego.agregarBulbasaurAentrenador(juego.getEntrenadorActivo());
		juego.agregarChanseyAentrenador(juego.getEntrenadorActivo());
		juego.agregarEntrenador("Segundo Entrenador");
		juego.agregarCharmanderAentrenador(juego.getEntrenador2());
		juego.agregarBulbasaurAentrenador(juego.getEntrenador2());
		juego.agregarChanseyAentrenador(juego.getEntrenador2());
		
		int posicionAlgomon=0;
		for (Algomon algomon : juego.getEntrenador2().getAlgomones()) {
			while(algomon.getPuntosDeVida()>0){
				juego.atacar(new Fogonazo());
				juego.enviarElemento(new Vitamina());
			}
			juego.cambiarJugador();
			posicionAlgomon++;
			juego.cambiarAlgomonActivo(posicionAlgomon+1);
			juego.cambiarJugador();
		}
		assertEquals(true, juego.elJuegoEstaFinalizado());
		
	}
	
	
	
}
