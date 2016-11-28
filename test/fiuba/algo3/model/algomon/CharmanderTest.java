package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.accion.ataque.Brasas;
import fiuba.algo3.model.accion.ataque.Fogonazo;
import fiuba.algo3.model.accion.elemento.SuperPocion;
import fiuba.algo3.model.accion.elemento.Vitamina;

public class CharmanderTest {
	
	
	@Test
	public void test1_CharmanderRecibeUnaSuperPocionEincrementa40puntoDeVida(){
		
		
		Algomon charmander=new Charmander();
	
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);
		
		charmander.recibirElemento(new SuperPocion());
		
		assertEquals(210d,charmander.getPuntosDeVida(),0.000d);	
		
	}
	
	@Test
	public void test2_charmanderRecibeUnaVitaminaYseIncrementaEn_2_laCantidadDeSusAtaques(){
		
		Algomon charmander=new Charmander();
		
		assertEquals(16,charmander.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class));
		assertEquals(4,charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		assertEquals(10,charmander.obtenerCantidadDeAtaquesDisponibles(Brasas.class));
		
		charmander.recibirElemento(new Vitamina());
		
		assertEquals(18,charmander.obtenerCantidadDeAtaquesDisponibles(AtaqueRapido.class));
		assertEquals(6,charmander.obtenerCantidadDeAtaquesDisponibles(Fogonazo.class));
		assertEquals(12,charmander.obtenerCantidadDeAtaquesDisponibles(Brasas.class));
	
	}
	

}
