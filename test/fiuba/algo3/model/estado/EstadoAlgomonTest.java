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
	
	@Test
	public void test02SeCambiaEstadoAlgomonAQuemadoYSeVerifcaQueSeCambieSuEstadoSoloAQuemado(){
		
		EstadoAlgomon estado = new EstadoAlgomon();
		estado.quemar();
		assertFalse(estado.estaDormido());
		assertTrue(estado.estaQuemado());
		
	}
	
	@Test
	public void test03SeCambiaEstadoAlgomonADormidoYSeVerifcaQueSeCambieSuEstadoSoloADormido(){
		
		EstadoAlgomon estado = new EstadoAlgomon();
		estado.dormir();
		assertTrue(estado.estaDormido());
		assertFalse(estado.estaQuemado());
		
	}

}
