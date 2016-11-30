package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.Canto;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Chansey;
import fiuba.algo3.modelo.algomon.Charmander;

public class CantoTest {

	
	@Test
	public void test_ChanseyLeAfectaConCantoAcharmanderYloDejaEnEstadoDormido(){
		
		Algomon chansey=new Chansey();
		Algomon charmander=new Charmander();
		
		Ataque canto=new Canto();
	
		canto.cargarAlgomonQueRealizaLaAccion(chansey);
		canto.cargarAtacado(charmander);
	
		assertFalse(charmander.estaDormido());
		
		canto.causarEfecto(charmander, chansey);
		
		assertTrue(charmander.estaDormido());
		assertTrue( canto.getAlgomonAtacado().estaDormido());
		
		//faltaria el tema de los turmos
	}
	
	
}
