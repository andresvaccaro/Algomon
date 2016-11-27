package fiuba.algo3.model.estado;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.model.accion.Accion;
import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.accion.elemento.Pocion;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Charmander;

public class EstadoDormidoTest {
	

	@Test
	public void test_algomonEnEstadoDormidoNoPuedeRealizarAccionPor3Turnos(){
		
		IEstadoEsfimero algomonDormido=new EstadoDormido();
		
		assertTrue( algomonDormido.estaDormido() );
		
		
	}

}
