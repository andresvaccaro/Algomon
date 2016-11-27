package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Canto;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Chansey;
import fiuba.algo3.model.algomon.Charmander;

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
