package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.Pocion;

public class BulbasaurTests {
	
	
	
	@Test
	public void test_SeObtieneDeBulbasaurLaCantidadDeSusAtaques(){
		
		Algomon bulbasaur=new Bulbasaur();
		
		List<Ataque> ataquesDeBulbasaur=bulbasaur.obtenerAtaquesDisponibles();
			
		assertEquals(3,ataquesDeBulbasaur.size());
		
	}
	
	
	@Test
	public void test_BulbasarRecibeUnaPocionYleAumenta20PuntosDeVida(){
		
		Algomon bulbasaur=new Bulbasaur();
		
		bulbasaur.recibirElemento(new Pocion());
		
		assertEquals(160d,bulbasaur.getPuntosDeVida(),0.000d);
		
	}
	
	
	
	@Test
	public void test_seCreaBulbasaurYseIncrementa3puntosDeVidaYseRestan10puntosDeVida(){
		
		Algomon bulbasaur=new Bulbasaur();
		
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);
		
		bulbasaur.aumentarPuntosDeVida(3);
		
		assertEquals(143d,bulbasaur.getPuntosDeVida(),0.000d);
		
		bulbasaur.disminuirPuntosDeVida(10);
		
		assertEquals(133d,bulbasaur.getPuntosDeVida(),0.000d);
		
	}

}
