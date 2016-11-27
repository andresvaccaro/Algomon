package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.CanionDeAgua;


public class CañonDeAguaTest {
	
	
	@Test
	public void test_cañonDeAguaDeSquirtleLeCausaEfectoAcharmanderYleQuita40PuntosDeVidaAcharmander(){
		
		Algomon squirtle=new Squirtle();
		Algomon charmander=new Charmander();
		
		Ataque cañonDeAgua=new CanionDeAgua();
		
		//squirtle le causa el efecto a charmander
		
		cañonDeAgua.causarEfecto(charmander, squirtle);
		
		assertEquals(130d,charmander.getPuntosDeVida(),0.000d);
		
	}

}
