package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.accion.ataque.ChupaVidas;
import fiuba.algo3.model.accion.ataque.LatigoCepa;
import fiuba.algo3.model.accion.elemento.Pocion;
import fiuba.algo3.model.accion.elemento.Vitamina;

public class BulbasaurTest {
	
	

	@Test
	public void Test1_bulbasaurRecibeUnaPocionYseVerificaSusPuntosDeVida(){
		
		Algomon bulbasaur=new Bulbasaur();
		
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);
		
		bulbasaur.recibirElemento(new Pocion());
		
		assertEquals(160d,bulbasaur.getPuntosDeVida(),0.000d);
		
	}
	
	
	@Test
	public void Test2_bulbasaurRecibeUnaVitaminaYseVerificaQueSusAtaquesSeHayaIncrementadoEn2(){
		
		Algomon bulbasaur=new Bulbasaur();
		
		assertEquals(16d,bulbasaur.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class),0.000d);
		assertEquals(10d,bulbasaur.obtenerCantidadDeAtaquesDisponibles(LatigoCepa.class),0.000d);
		assertEquals(8d,bulbasaur.obtenerCantidadDeAtaquesDisponibles(ChupaVidas.class),0.000d);
		
		bulbasaur.recibirElemento(new Vitamina());
		
		assertEquals(18d,bulbasaur.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class),0.000d);
		assertEquals(12d,bulbasaur.obtenerCantidadDeAtaquesDisponibles(LatigoCepa.class),0.000d);
		assertEquals(10d,bulbasaur.obtenerCantidadDeAtaquesDisponibles(ChupaVidas.class),0.000d);
		
		
	}

}
