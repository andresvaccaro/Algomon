package fiuba.algo3.model.estado;

import static org.junit.Assert.*;


import org.junit.Test;


public class EstadoAlgomonTest {
	
	@Test
	public void test01SeInicializaEstadoAlgomonSinEstarQuemadoNiDormido(){
		
		EstadoAlgomon estado = new EstadoAlgomon();
		assertFalse(estado.estaDormido());
		assertFalse(estado.estaQuemado());
		
	}

}
