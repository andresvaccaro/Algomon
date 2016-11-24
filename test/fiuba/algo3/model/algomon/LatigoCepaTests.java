package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.LatigoCepa;

public class LatigoCepaTests {
	
	@Test
	public void test_LatigoCepaDeBulbasaurLeCausaEfectoARattataYleQuita15puntosArattata(){
		
		Algomon Bulbasaur=new Bulbasaur();
		Algomon rattata=new Rattata();
		
		Ataque latigoCepa=new LatigoCepa();
		
		latigoCepa.causarEfecto(rattata, Bulbasaur);
		
		assertEquals(155d,rattata.getPuntosDeVida(),0.000d);
		
	}

}
