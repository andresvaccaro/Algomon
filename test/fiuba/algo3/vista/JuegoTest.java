package fiuba.algo3.vista;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import fiuba.algo3.modelo.Juego;
import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.AtaqueRapido;
import fiuba.algo3.modelo.accion.ataque.Fogonazo;
import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.accion.elemento.SuperPocion;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Bulbasaur;
import fiuba.algo3.modelo.algomon.Chansey;
import fiuba.algo3.modelo.algomon.Charmander;
import fiuba.algo3.modelo.algomon.Jigglypuff;
import fiuba.algo3.modelo.algomon.Rattata;
import fiuba.algo3.modelo.algomon.Squirtle;

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

		assertEquals("Charmander", juego.getEntrenadorActivo().getAlgomones()
				.get(0).getNombre());
		assertEquals("Bulbasaur", juego.getEntrenadorActivo().getAlgomones()
				.get(1).getNombre());
		assertEquals("Chansey",
				juego.getEntrenadorActivo().getAlgomones().get(2).getNombre());

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
		assertEquals("Jigglypuff", juego.getEntrenador2()
				.obtenerNombreAlgomonActivo());
		juego.atacar(new Fogonazo());
		assertEquals(128d, juego.getEntrenador2().obtenerAlgomonActivo()
				.getPuntosDeVida(), 0.000001d);
		assertEquals(true, juego.getEntrenador2().obtenerAlgomonActivo()
				.estaQuemado());
	}

	@Test
	public void testCharmanderAtacaConFogonazoATodosLosAlgomonesDelEntrenadorRivalHastaQueFinalizaElJuego() {
		Juego juego = new Juego();
		juego.agregarEntrenador("Primer Entrenador");
		juego.agregarCharmanderAentrenador(juego.getEntrenadorActivo());
		juego.agregarEntrenador("Segundo Entrenador");
		juego.agregarChanseyAentrenador(juego.getEntrenador2());

		int posicionAlgomon = 0;
		for (Algomon algomon : juego.getEntrenador2().getAlgomones()) {
			while (algomon.getPuntosDeVida() > 0) {
				juego.atacar(new AtaqueRapido());
			}
			juego.cambiarJugador();
			posicionAlgomon++;
			juego.cambiarAlgomonActivo(posicionAlgomon + 1);
			juego.cambiarJugador();
		}
		assertEquals(true, juego.elJuegoEstaFinalizado());

	}

	@Test
	public void testObtieneTodosLosAlgomonesDelJuego() {
		Juego juego = new Juego();
		List<Algomon> algomones = juego.obtenerTodosLosAlgomones();
		assertEquals(Bulbasaur.class, algomones.get(0).getClass());
		assertEquals(Chansey.class, algomones.get(1).getClass());
		assertEquals(Charmander.class, algomones.get(2).getClass());
		assertEquals(Jigglypuff.class, algomones.get(3).getClass());
		assertEquals(Rattata.class, algomones.get(4).getClass());
		assertEquals(Squirtle.class, algomones.get(5).getClass());

	}

	@Test
	public void testElEntrenadorActivoEnviaUnaSuperpocionASuAlgomonActivoYseDecscuentaDeSuContenedorDeElementoUnaVitamina() {

		Juego juego = new Juego();
		juego.agregarEntrenador("Ash");
		juego.agregarChanseyAentrenador(juego.getEntrenadorActivo());
		juego.agregarEntrenador("Ash2");
		juego.iniciarJuego();
		assertEquals(4, juego.getEntrenadorActivo()
				.obtenerElementosDisponibles().size());
		juego.enviarElemento(new SuperPocion());
		juego.enviarElemento(new SuperPocion());
		assertEquals(3, juego.getEntrenadorActivo()
				.obtenerElementosDisponibles().size());

	}

	@Test
	public void testSeUsanTodosLosElementosDisponiblesDeUnEntrenadorYFinalizaElJuego() {
		Juego juego = new Juego();
		juego.agregarEntrenador("Ahs");
		juego.agregarCharmanderAentrenador(juego.getEntrenadorActivo());
		juego.agregarEntrenador("Entrenador 2");
		juego.agregarBulbasaurAentrenador(juego.getEntrenador2());
		juego.agregarBulbasaurAentrenador(juego.getEntrenador2());
		juego.agregarBulbasaurAentrenador(juego.getEntrenador2());
		juego.agregarBulbasaurAentrenador(juego.getEntrenador2());
		Boolean continuarEnviandoElementos = Boolean.TRUE;
		while (continuarEnviandoElementos) {
			List<Elemento> elementosParaUsar = juego.getEntrenadorActivo()
					.obtenerElementosDisponibles();
			juego.enviarElemento(elementosParaUsar.get(0));
			if (juego.getEntrenadorActivo().obtenerElementosDisponibles()
					.isEmpty()) {
				continuarEnviandoElementos = Boolean.FALSE;
			}
		}
		Boolean continuarAtacando = Boolean.TRUE;
		while (continuarAtacando) {
			List<Ataque> ataques = juego.getEntrenadorActivo().obtenerAlgomonActivo().obtenerAtaquesDisponibles();
			
			if (ataques.isEmpty()) {
				continuarAtacando = Boolean.FALSE;
			}else{
				juego.atacar(ataques.get(0));
			}
		}
		juego.cambiarJugador();
		assertEquals(true, juego.elJuegoEstaFinalizado());

	}
}
