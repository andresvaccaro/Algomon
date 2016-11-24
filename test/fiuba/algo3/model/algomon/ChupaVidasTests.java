package fiuba.algo3.model.algomon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.ChupaVidas;

public class ChupaVidasTests {

	
	
	@Test
	public void test_bulbasaurConAtaqueChupavidasLeQuitaLos30PorCientoDeDa�oAlSquirtle(){
		
		Algomon bulbasaur=new Bulbasaur();
		Algomon squirtle=new Squirtle();
		
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);
		assertEquals(150d,squirtle.getPuntosDeVida(),0.000d);
		
		
		Ataque chupavida=new ChupaVidas();
		
		chupavida.causarEfecto(squirtle, bulbasaur);
		
		//bulbasaur le saco el 30% del da�o causado a squirtle
		
		assertEquals(149d,bulbasaur.getPuntosDeVida(),0.000d);
		assertEquals(120d,squirtle.getPuntosDeVida(),0.000d);
		
		
	}
}