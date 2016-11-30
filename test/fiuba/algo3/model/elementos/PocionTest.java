package fiuba.algo3.model.elementos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.accion.elemento.Pocion;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Chansey;

public class PocionTest {
	
	
	@Test 
	public void test_chanseySeCargaUnaPocionYleIncrementa20PuntosDeVida(){
	
		Algomon chansey=new Chansey();
		
		assertEquals(130d,chansey.getPuntosDeVida(),0.000d);
		
		Elemento unaPocion=new Pocion();

		unaPocion.cargarAlgomonQueRealizaLaAccion(chansey);
		
		unaPocion.realizarAccion();
		
		assertEquals(150d,unaPocion.getAlgomonQueRealizaLaAccion().getPuntosDeVida(),0.000d);
		assertEquals(150d,chansey.getPuntosDeVida(),0.000d);
		
	}
	

}
