package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Canto;

public class CantoTest {

	
	@Test
	public void test_ChanseyLeAfectaConCantoAcharmanderYloDejaEnEstadoDormido(){
		
		Algomon chansey=new Chansey();
		Algomon charmander=new Charmander();
		
		Ataque canto=new Canto();
	
		assertFalse(charmander.estaDormido());
		
		canto.causarEfecto(charmander, chansey);
		
		assertTrue(charmander.estaDormido());
		
		//faltaria el tema de los turmos
	}
	
	
}
