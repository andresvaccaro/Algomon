package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

public class BulbasaurTests {
	
	
	@Test
	public void test_seCreaBulbasaurConPuntosDeVidasYataquesYseVerificasSusDatos(){
		
		Algomon bulbasaur=new Bulbasaur();
		
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);
		
		
	}

}
