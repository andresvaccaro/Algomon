package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Fogonazo;

public class CharmanderTest {
	
	
	@Test
	public void test1_CharmanderAtacaAotroAlgomon(){
		
		
		Algomon charmander=new Charmander();
		Algomon squirtle=new Squirtle();
		
		charmander.atacar(squirtle, Fogonazo.class);
		
		assertEquals(149d,squirtle.getPuntosDeVida(),0.000d);
	
		
	}

}
