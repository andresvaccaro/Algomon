package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Chansey;
import fiuba.algo3.model.algomon.Charmander;
import fiuba.algo3.model.algomon.Rattata;

public class AtaqueRapidoTest {
	
	
	@Test
	public void test_AtaqueRapidoRecibeAchanseyComoAtacanteYrattataComoAtacadoYleQuita10PuntosDeVidaARattata(){
		
		Ataque ataqueRapido=new AtaqueRapido();
		
		Algomon chansey=new Chansey();
		Algomon rattata=new Rattata();
		
		ataqueRapido.causarEfecto( rattata, chansey );
		
		assertEquals(160d,rattata.getPuntosDeVida(),0.000d);
		
	}
	

	@Test
	public void test_AtaqueRapidoRecibeCharmanderComoAtacanteYaBulbasaurComoAtacadoYleQuita10PuntosAlAtacadoOseaBulbasaur(){
		
		Ataque ataqueRapido=new AtaqueRapido();
		
		Algomon charmander=new Charmander();
		Algomon bulbasaur=new Bulbasaur();
		
		ataqueRapido.causarEfecto( bulbasaur , charmander );
		
		assertEquals(130d,bulbasaur.getPuntosDeVida(),0.000d);
		

	}
}
