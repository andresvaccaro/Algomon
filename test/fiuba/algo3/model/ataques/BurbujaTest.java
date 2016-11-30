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
	public void test_SquirtleAtacaConConBurbujaCausaEfectoABulbasaurYleQuita5PuntosDeVida(){
		
		Algomon squirtle=new Squirtle();
		Algomon bulbasaur=new Bulbasaur();
		
		Ataque burbuja=new Burbuja();
		
		
		burbuja.cargarAlgomonQueRealizaLaAccion(squirtle);
		burbuja.cargarAtacado(bulbasaur);
		
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);	
		assertEquals(140d,burbuja.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		burbuja.causarEfecto(bulbasaur, squirtle);
		
		assertEquals(135d,bulbasaur.getPuntosDeVida(),0.000d);	
		assertEquals(135d,burbuja.getAlgomonAtacado().getPuntosDeVida(),0.000d);
	}

}
