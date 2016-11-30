package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.accion.ataque.AtaqueRapido;
import fiuba.algo3.modelo.accion.ataque.Brasas;
import fiuba.algo3.modelo.accion.ataque.Fogonazo;
import fiuba.algo3.modelo.accion.elemento.SuperPocion;
import fiuba.algo3.modelo.accion.elemento.Vitamina;
import fiuba.algo3.modelo.algomon.Charmander;

public class CharmanderTest {
	
	
	@Test
	public void test1_CharmanderRecibeUnaSuperPocionEincrementa40puntoDeVida(){
		
		
		Charmander charmander=new Charmander();
	
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);
		
		charmander.recibirElemento(new SuperPocion());
		
		assertEquals(210d,charmander.getPuntosDeVida(),0.000d);	
		
	}
	
	@Test
	public void test2_charmanderRecibeUnaVitaminaYseIncrementaEn_2_laCantidadDeSusAtaques(){
		
		Charmander charmander=new Charmander();
		
		assertEquals(16,charmander.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class));
		assertEquals(4,charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		assertEquals(10,charmander.obtenerCantidadDeAtaquesDisponibles(Brasas.class));
		
		charmander.recibirElemento(new Vitamina());
		
		assertEquals(18,charmander.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class));
		assertEquals(6,charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		assertEquals(12,charmander.obtenerCantidadDeAtaquesDisponibles(Brasas.class));
	
	}
	
	@Test
	public void test3_charmanderNoDeberiaEstarDormidoNiTampocoQuemado_LuegoSeDuermeYseQuema(){
		
		Charmander charmander=new Charmander();
		
		assertFalse(charmander.estaDormido());
		assertFalse(charmander.estaQuemado());
		
		charmander.dormir();
		charmander.quemar();
		
		assertTrue(charmander.estaDormido());
		assertTrue(charmander.estaQuemado());
		
		charmander.despertar();
		
		assertFalse(charmander.estaDormido());
	}
	
	@Test
	public void test4_charmanderReduce10PorCientoSusPuntosDeVidaInicial_y_ademasReduce8puntosDeSuVida(){
		
		
		Charmander charmander=new Charmander();
		
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);
		
		charmander.disminuirDiezPorciento();
		
		assertEquals(153d,charmander.getPuntosDeVida(),0.000d);
		
		charmander.disminuirPuntosDeVida(8);
		
		assertEquals(145d,charmander.getPuntosDeVida(),0.000d);
	
		
	}
	

}
