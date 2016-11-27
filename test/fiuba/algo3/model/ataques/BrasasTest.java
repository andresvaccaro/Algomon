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
	public void test_AtaqueConBrasasRecibeComoAtacanteACharmanderYaSquirtleComoAtacadoYleQuita8PuntosASquitle(){
		
		Algomon squirtle=new Squirtle();
		Algomon charmander=new Charmander();
		
		Ataque brasas=new Brasas();
		
		brasas.causarEfecto(squirtle, charmander);
		
		assertEquals(142d,squirtle.getPuntosDeVida(),0.000d);
	}
	
	
	@Test
	public void test_AtaqueConBrasasRecibeACharmanderComoAtacante_y_A_JiggypuffComoAtacadoYleQuita16PuntosAjigglipuff(){
		
		Algomon charmander=new Charmander();
		Algomon jigglipuff=new Jigglypuff();
		
		Ataque brasas=new Brasas();
		
		brasas.causarEfecto(jigglipuff, charmander);
		
		assertEquals(114d,jigglipuff.getPuntosDeVida(),0.000d);
		
	}
}
