package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.LatigoCepa;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Rattata;

public class LatigoCepaTest {
	
	@Test
	public void test_LatigoCepaDeBulbasaurLeCausaEfectoARattataYleQuita15puntosArattata(){
		
		Algomon Bulbasaur=new Bulbasaur();
		Algomon rattata=new Rattata();
		
		Ataque latigoCepa=new LatigoCepa();
		
		latigoCepa.causarEfecto(rattata, Bulbasaur);
		
		assertEquals(155d,rattata.getPuntosDeVida(),0.000d);
		
	}

}
