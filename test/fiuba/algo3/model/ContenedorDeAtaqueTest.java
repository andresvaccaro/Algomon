package fiuba.algo3.model;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Brasas;
import fiuba.algo3.model.accion.ataque.LatigoCepa;

public class ContenedorDeAtaqueTest {
	
	@Test
	public void test01SeCreaContenedorDeAtaqueCon1AtaqueYElContenedorTiene1Ataque(){
		
		Brasas brasas = new Brasas();
		Stack<Ataque> ataques = new Stack<Ataque>();
		ataques.push(brasas);
		ContenedorDeAtaque contenedor = new ContenedorDeAtaque(ataques);
		assertEquals(contenedor.getCantidadAtaquesDisponibles(),1);
		
	}
	
	@Test
	public void test02SeCreaContenedorConTresAtaquesYElContenedorTieneEseAtaque(){
		LatigoCepa latigoCepa = new LatigoCepa();
		Stack<Ataque> ataques = new Stack<Ataque>();
		ataques.push(latigoCepa);
		ataques.push(latigoCepa);
		ataques.push(latigoCepa);
		ContenedorDeAtaque contenedor = new ContenedorDeAtaque(ataques);
		assertEquals(contenedor.obtenerAtaque(),latigoCepa);		
				
	}
	
	
	

}
