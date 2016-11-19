package fiuba.algo3.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Algomon {

	protected double puntosDeVida;	
	
	protected List<ContenedorDeAtaque> contenedoresDeAtaques;

	protected EstadoAlgomon estadoAlgomon;

	public Algomon() {
		super();
		this.contenedoresDeAtaques = new ArrayList<>();
		this.estadoAlgomon = new EstadoAlgomon();
	}

	public void atacar(Algomon algomonAtacado, Class tipoDeAtaque) {
		ContenedorDeAtaque contenedorDeAtaque = buscarContenedorDeAtaque(tipoDeAtaque);
		contenedorDeAtaque.lanzarAtaque(this, algomonAtacado, this.estadoAlgomon);
	}
	
	public void recibirElemento(Elemento elemento) {
		elemento.cargarAlgomonQueRealizaLaAccion(this);
		this.estadoAlgomon.realizarAccion(elemento);
	}

	
	
	public int obtenerCantidadDeAtaquesDisponibles(Class tipoDeAtaque) {
		ContenedorDeAtaque contenedorDeAtaque = buscarContenedorDeAtaque(tipoDeAtaque);
		return contenedorDeAtaque.getAtaquesDisponibles();
	}
	
	private ContenedorDeAtaque buscarContenedorDeAtaque(Class tipoDeAtaque) {
		ContenedorDeAtaque contenedorEncontrado = null;
		for (ContenedorDeAtaque contenedorDeAtaque : contenedoresDeAtaques) {
			if (contenedorDeAtaque.sosDeAtaque(tipoDeAtaque)) {
				contenedorEncontrado = contenedorDeAtaque;
			}
		}
		return contenedorEncontrado;
	}

	public double getPuntosDeVida() {
		return puntosDeVida;
	}

	public void disminuirPuntosDeVida(double puntosADisminuir) {
		this.puntosDeVida = this.puntosDeVida - puntosADisminuir;
	}

	public abstract double obtenerMultiplicadorDeAtaqueDeAgua();

	public abstract double obtenerMultiplicadorDeAtaqueDePlanta();

	public abstract double obtenerMultiplicadorDeAtaqueDeFuego();
	
	public abstract double obtenerMultiplicadorDeAtaqueNormal();

	public Boolean estaDormido() {
		return this.estadoAlgomon.estaDormido();
	}
	
	public Boolean estaQuemado() {
		return this.estadoAlgomon.estaQuemado();
	}

	public void dormir() {
		this.estadoAlgomon.dormir();
	}

	public void disminuirDiezPorciento() {
		this.puntosDeVida = this.puntosDeVida  - obtenerPuntosDeVidaInicial() * 0.10;
	}

	public void despertar() {
		this.estadoAlgomon.despertar();
	}

	public void aumentarPuntosDeVida(double puntosASumar) {
		this.puntosDeVida = this.puntosDeVida + puntosASumar;
	}

	public EstadoAlgomon getEstadoAlgomon() {
		return estadoAlgomon;
	}

	public void quemar() {
		this.estadoAlgomon.quemar();
		
	}

	protected abstract double obtenerPuntosDeVidaInicial();

	public void enfriar() {
		this.estadoAlgomon.enfriar();		
	}

	public void aumentarCantidadDeAtaques(int cantidadAAumentar){
		for (ContenedorDeAtaque contenedorDeAtaque : contenedoresDeAtaques) {
			contenedorDeAtaque.aumentarCantidad(cantidadAAumentar);
		}
		
	}


	

	
	
}
