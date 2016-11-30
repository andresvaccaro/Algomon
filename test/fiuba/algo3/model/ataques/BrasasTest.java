package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.Brasas;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Charmander;
import fiuba.algo3.modelo.algomon.Jigglypuff;
import fiuba.algo3.modelo.algomon.Squirtle;

public class BrasasTest {

	
	@Test
	public void test_charmanderUtilizaElAtaqueBrasaYleQuita8PuntosASquitle(){
		
		Algomon squirtle=new Squirtle();
		Algomon charmander=new Charmander();
		
		Ataque brasas=new Brasas();
		
		brasas.cargarAlgomonQueRealizaLaAccion(charmander);
		brasas.cargarAtacado(squirtle);
		
		assertEquals(150d,brasas.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		brasas.causarEfecto(squirtle, charmander);
		
		assertEquals(142d, brasas.getAlgomonAtacado().getPuntosDeVida(),0.000d);
	}
	
	
	@Test
	public void test_elAtaqueConBrasasDeCharmanderLeQuita16PuntosDeVidaAjigglypuff(){
		
		Algomon charmander=new Charmander();
		Algomon jigglipuff=new Jigglypuff();
		
		Ataque brasas=new Brasas();
		
		brasas.cargarAlgomonQueRealizaLaAccion(charmander);
		brasas.cargarAtacado(jigglipuff);
		
		
		assertEquals(130d,jigglipuff.getPuntosDeVida(),0.000d);
		assertEquals(130d, brasas.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		brasas.causarEfecto(jigglipuff, charmander);
		
		assertEquals(114d,jigglipuff.getPuntosDeVida(),0.000d);
		assertEquals(114d, brasas.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
	}
}
