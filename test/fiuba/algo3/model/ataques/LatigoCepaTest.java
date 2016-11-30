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
		
		latigoCepa.cargarAlgomonQueRealizaLaAccion(Bulbasaur);
		latigoCepa.cargarAtacado(rattata);
		
		assertEquals(170d,rattata.getPuntosDeVida(),0.000d);
		assertEquals(170d,latigoCepa.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		
		latigoCepa.causarEfecto(rattata, Bulbasaur);
		
		assertEquals(155d,rattata.getPuntosDeVida(),0.000d);
		assertEquals(155d,latigoCepa.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		
	}

}
