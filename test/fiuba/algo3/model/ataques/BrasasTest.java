package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Brasas;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Charmander;
import fiuba.algo3.model.algomon.Jigglypuff;
import fiuba.algo3.model.algomon.Squirtle;

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
		
		assertEquals(130d, brasas.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		brasas.causarEfecto(jigglipuff, charmander);
		
		assertEquals(114d, brasas.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
	}
}
