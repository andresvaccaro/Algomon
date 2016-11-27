package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Burbuja;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Squirtle;

public class BurbujaTest {
	
	@Test
	public void test_AtaqueConBurbujaDeSquirtleCausaEfectoABulbasaurYleQuita5PuntosDeVidaAbulbasaur(){
		
		Algomon squirtle=new Squirtle();
		Algomon bulbasaur=new Bulbasaur();
		
		Ataque burbuja=new Burbuja();
		
		burbuja.causarEfecto(bulbasaur, squirtle);
		
		assertEquals(135d,bulbasaur.getPuntosDeVida(),0.000d);	
		
	}

}
