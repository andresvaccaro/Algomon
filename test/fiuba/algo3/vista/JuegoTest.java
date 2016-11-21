package fiuba.algo3.vista;

import static org.junit.Assert.*;

import org.junit.Test;

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

}
