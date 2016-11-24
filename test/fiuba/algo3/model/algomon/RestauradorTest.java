package fiuba.algo3.model.algomon;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Canto;
import fiuba.algo3.model.accion.ataque.Fogonazo;
import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.Restaurador;

public class RestauradorTest {

	
	@Test
	public void test_RattataRecibeUnAtaqueCantoDeChansey_y_unAtaqueFogonazoDeCharmanderLoCualLoDejaQuemadoYdormidoYluegoSeLeAplicaUnRestauradorYvuelveAsuEstadoNormal(){
		
			Algomon rattata=new Rattata();
			Algomon chansey=new Chansey();
			Algomon charmander=new Charmander();
			
			assertFalse( rattata.estaDormido() );
			assertFalse( rattata.estaQuemado() );
			
			
			Ataque canto=new Canto();
			Ataque fogonazo=new Fogonazo();
			
			Elemento restaurador=new Restaurador();
			
			// chansey con ataque canto deja dormido a rattata
			
			canto.causarEfecto(rattata, chansey);
			
			assertTrue(rattata.estaDormido());
			
			//charmander con ataque fogonazo  deja quemado a rattata 
			
			fogonazo.causarEfecto(rattata, charmander);
			
			assertTrue(rattata.estaQuemado());
			
			//Ahora se le aplica el restaurador a rattata para que vuelva a su estado normal
			
			restaurador.cargarAlgomonQueRealizaLaAccion(rattata);
			
			restaurador.realizarAccion();
			
			assertFalse( rattata.estaDormido() );
			assertFalse( rattata.estaQuemado() );
			
			
			
	}	
}
