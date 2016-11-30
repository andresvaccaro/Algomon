package fiuba.algo3.model.elementos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.accion.elemento.SuperPocion;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Charmander;

public class SuperPocionTest {
	
	
	@Test 
	public void test_SuperPocionSeLeAplicaAcharmanderYleIncrementa40PuntosDeVida(){
	
		Algomon charmander=new Charmander();
		
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);
		
		Elemento unaSuperPocion=new SuperPocion();

		unaSuperPocion.cargarAlgomonQueRealizaLaAccion(charmander);
		
		unaSuperPocion.realizarAccion();
		
		assertEquals(210d,charmander.getPuntosDeVida(),0.000d);
		assertEquals(210d,unaSuperPocion.getAlgomonQueRealizaLaAccion().getPuntosDeVida(),0.000d);
		
	}
}
