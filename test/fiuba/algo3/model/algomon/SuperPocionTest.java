package fiuba.algo3.model.algomon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.SuperPocion;

public class SuperPocionTest {
	
	
	@Test 
	public void test_SuperPocionSeLeAplicaAcharmanderYleIncrementa40PuntosDeVida(){
	
		Algomon charmander=new Charmander();
		
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);
		
		Elemento unaSuperPocion=new SuperPocion();

		unaSuperPocion.cargarAlgomonQueRealizaLaAccion(charmander);
		
		unaSuperPocion.realizarAccion();
		
		assertEquals(210d,charmander.getPuntosDeVida(),0.000d);
		
	}
}
