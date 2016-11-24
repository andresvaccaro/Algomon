package fiuba.algo3.model;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.Brasas;
import fiuba.algo3.model.accion.ataque.LatigoCepa;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Charmander;

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
	
	@Test
	public void test03SeCreaContenedorConDosAtaquesSeAumentaEn2LaCantidadDeAtaquesDelContenedorYAhoraTiene4Ataques(){
		LatigoCepa latigoCepa = new LatigoCepa();
		Stack<Ataque> ataques = new Stack<Ataque>();
		ataques.push(latigoCepa);
		ataques.push(latigoCepa);
		ContenedorDeAtaque contenedor = new ContenedorDeAtaque(ataques);
		contenedor.aumentarCantidad(2);
		assertEquals(contenedor.getCantidadAtaquesDisponibles(),4);		
				
	}
	
	@Test
	public void test04SeCreaContenedorDeAtaqueConAtaquesBrasasYSeCompruebaQueElContenedorTengaEsosAtaques(){
		Brasas brasas = new Brasas();
		Stack<Ataque> ataques = new Stack<Ataque>();
		ataques.push(brasas);
		ContenedorDeAtaque contenedor = new ContenedorDeAtaque(ataques);
		assertTrue(contenedor.sosDeAtaque(Brasas.class));
		
	}
	
	@Test
	public void test05SeLanzaAtaqueDeUnContenedorYEsteReduceSuCantidadDeAtaques(){
		Brasas brasas = new Brasas();
		Stack<Ataque> ataques = new Stack<Ataque>();
		ataques.push(brasas);
		ataques.push(brasas);
		ataques.push(brasas);
		ContenedorDeAtaque contenedor = new ContenedorDeAtaque(ataques);
		assertEquals(contenedor.getCantidadAtaquesDisponibles(),3);
		
		Algomon charmander = new Charmander();
		Algomon balbasaur = new Bulbasaur();
		
		contenedor.lanzarAtaque(charmander, balbasaur);
		
		assertEquals(contenedor.getCantidadAtaquesDisponibles(),2);
		
	}
	
	
	
	
}
