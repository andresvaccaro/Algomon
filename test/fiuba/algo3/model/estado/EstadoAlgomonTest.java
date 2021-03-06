package fiuba.algo3.model.estado;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.estado.EstadoAlgomon;
import fiuba.algo3.modelo.estado.EstadoNormalEsfimero;
import fiuba.algo3.modelo.estado.EstadoNormalPersistente;


public class EstadoAlgomonTest {
	
	@Test
	public void test01SeInicializaEstadoAlgomonSinEstarQuemadoNiDormido(){
		
		EstadoAlgomon estado = new EstadoAlgomon();
		assertFalse(estado.estaDormido());
		assertFalse(estado.estaQuemado());
		assertEquals(estado.getEstadoEsfimero().getClass(),new EstadoNormalEsfimero().getClass());
		assertEquals(estado.getEstadoPersistente().getClass(),new EstadoNormalPersistente().getClass());
		
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
	
	@Test
	public void test04SeVerificaQueElEstadoQueEstaDormidoYQuemadoPuedaCambiarseAEstadosNormales(){
		
		EstadoAlgomon estado = new EstadoAlgomon();
		estado.dormir();
		estado.quemar();
		assertTrue(estado.estaDormido());
		assertTrue(estado.estaQuemado());
		
		estado.enfriar();
		estado.despertar();
		assertFalse(estado.estaDormido());
		assertFalse(estado.estaQuemado());
	
	}

}
