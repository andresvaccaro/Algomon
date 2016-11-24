package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.AtaqueRapido;

public class AtaquesTests {
	
//	
//	@Test
//	public void test_AtaqueNormalRecibeAchanseyComoAtacanteYrattataComoAtacadoYleQuita16PuntosDeVidaARattata(){
//		
//		Ataque ataqueRapido=new AtaqueRapido();
//		
//		Algomon chansey=new Chansey();
//		Algomon rattata=new Rattata();
//		
//		ataqueRapido.causarEfecto( rattata, chansey );
//		
//		assertEquals(154d,rattata.getPuntosDeVida(),0.000d);
//		
//	}
	

	@Test
	public void test_AtaqueNormalRecibeCharmanderComoAtacanteYaBulbasaurComoAtacadoYleQuita10PuntosAlAtacadoOseaBulbasaur(){
		
		Ataque ataqueRapido=new AtaqueRapido();
		
		Algomon charmander=new Charmander();
		Algomon bulbasaur=new Bulbasaur();
		
		ataqueRapido.causarEfecto( bulbasaur , charmander );
		
		assertEquals(130d,bulbasaur.getPuntosDeVida(),0.000d);
		

	}
}
