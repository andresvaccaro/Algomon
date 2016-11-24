package fiuba.algo3.model;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Brasas;

public class ContenedorDeAtaqueTest {
	
	@Test
	public void test01SeCreaContenedorDeAtaqueCon1AtaqueYElContenedorTiene1Ataque(){
		
		Brasas brasas = new Brasas();
		Stack<Ataque> ataques = new Stack<Ataque>();
		ataques.push(brasas);
		ContenedorDeAtaque contenedor = new ContenedorDeAtaque(ataques);
		assertEquals(contenedor.getCantidadAtaquesDisponibles(),1);
		
	}

}
