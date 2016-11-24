package fiuba.algo3.model.algomon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.Pocion;

public class PocionTest {
	
	
	@Test 
	public void test_unaPocionSeLeAsignaAchanseyYleIncrementa20PuntosDeVida(){
	
		Algomon chansey=new Chansey();
		
		assertEquals(130d,chansey.getPuntosDeVida(),0.000d);
		
		Elemento unaPocion=new Pocion();

		unaPocion.cargarAlgomonQueRealizaLaAccion(chansey);
		
		unaPocion.realizarAccion();
		
		assertEquals(150d,chansey.getPuntosDeVida(),0.000d);
		
	}
	

}
