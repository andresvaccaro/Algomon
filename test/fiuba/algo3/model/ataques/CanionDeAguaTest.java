package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.CanionDeAgua;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Charmander;
import fiuba.algo3.model.algomon.Squirtle;


public class CanionDeAguaTest {
	
	
	@Test
	public void test_canionDeAguaDeSquirtleLeCausaEfectoAcharmanderYleQuita40PuntosDeVidaAcharmander(){
		
		Algomon squirtle=new Squirtle();
		Algomon charmander=new Charmander();
		
		Ataque canionDeAgua=new CanionDeAgua();
		
		//squirtle le causa el efecto a charmander
		
		canionDeAgua.causarEfecto(charmander, squirtle);
		
		assertEquals(130d,charmander.getPuntosDeVida(),0.000d);
		
	}

}
