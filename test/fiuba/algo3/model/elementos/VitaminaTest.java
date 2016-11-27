package fiuba.algo3.model.elementos;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.accion.ataque.Burbuja;
import fiuba.algo3.model.accion.ataque.Fogonazo;
import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.Vitamina;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Rattata;

public class VitaminaTest {
	
	
	@Test
	public void test_unaVitaminaSeAplicaArattataYleIncrementa2AtodosSusAtaques(){
		
		Algomon rattata=new Rattata();
		
		assertEquals(4,rattata.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		assertEquals(15,rattata.obtenerCantidadDeAtaquesDisponibles(Burbuja.class));
		assertEquals(16,rattata.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class));
		
		Elemento vitamina=new Vitamina();
		
		vitamina.cargarAlgomonQueRealizaLaAccion(rattata);
		
		vitamina.realizarAccion();
		
		assertEquals(6,rattata.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		assertEquals(17,rattata.obtenerCantidadDeAtaquesDisponibles(Burbuja.class));
		assertEquals(18,rattata.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class));
		
	}

}
