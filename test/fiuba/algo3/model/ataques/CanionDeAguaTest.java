package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.CanionDeAgua;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Charmander;
import fiuba.algo3.modelo.algomon.Squirtle;


public class CanionDeAguaTest {
	
	
	@Test
	public void test_canionDeAguaDeSquirtleLeCausaEfectoAcharmanderYleQuita40PuntosDeVida(){
		
		Algomon squirtle=new Squirtle();
		Algomon charmander=new Charmander();
		
		Ataque canionDeAgua=new CanionDeAgua();
		
		canionDeAgua.cargarAlgomonQueRealizaLaAccion(squirtle);
		canionDeAgua.cargarAtacado(charmander);
		
		
		assertEquals(170d,charmander.getPuntosDeVida(),0.000d);	
		assertEquals(170d, canionDeAgua.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		//squirtle le causa el efecto a charmander
		canionDeAgua.causarEfecto(charmander, squirtle);
		
		assertEquals(130d,charmander.getPuntosDeVida(),0.000d);
		assertEquals(130d, canionDeAgua.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
	}

}
