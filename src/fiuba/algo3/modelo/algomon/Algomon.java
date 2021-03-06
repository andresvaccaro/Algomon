package fiuba.algo3.modelo.algomon;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.ContenedorDeAtaque;
import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.estado.EstadoAlgomon;

public abstract class Algomon implements Cloneable {

	protected double puntosDeVida;

	protected String nombre;

	protected List<ContenedorDeAtaque> contenedoresDeAtaques;

	protected EstadoAlgomon estadoAlgomon;
	
	public abstract String obtenerUrlImagen();

	public Algomon() {
		super();
		this.contenedoresDeAtaques = new ArrayList<>();
		this.estadoAlgomon = new EstadoAlgomon();
	}

	public void atacar(Algomon algomonAtacado, Class tipoDeAtaque) {

		ContenedorDeAtaque contenedorDeAtaque = buscarContenedorDeAtaque(tipoDeAtaque);

		contenedorDeAtaque.lanzarAtaque(this, algomonAtacado);
	}

	public void recibirElemento(Elemento elemento) {
		elemento.cargarAlgomonQueRealizaLaAccion(this);
		this.estadoAlgomon.realizarAccion(elemento);
	}

	public int obtenerCantidadDeAtaquesDisponibles(Class tipoDeAtaque) {
		ContenedorDeAtaque contenedorDeAtaque = buscarContenedorDeAtaque(tipoDeAtaque);
		return contenedorDeAtaque.getCantidadAtaquesDisponibles();
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
		if (this.puntosDeVida < 0) {
			this.puntosDeVida = 0;
		}
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
		this.puntosDeVida = this.puntosDeVida - obtenerPuntosDeVidaInicial() * 0.10;
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

	public void aumentarCantidadDeAtaques(int cantidadAAumentar) {

		for (ContenedorDeAtaque contenedorDeAtaque : contenedoresDeAtaques) {

			contenedorDeAtaque.aumentarCantidad(cantidadAAumentar);
		}

	}

	public String getNombre() {

		return nombre;
	}

	public List<Ataque> obtenerAtaquesDisponibles() {

		List<Ataque> ataquesDisponibles = new ArrayList<Ataque>();

		for (ContenedorDeAtaque contenedorDeAtaque : this.contenedoresDeAtaques) {

			if (contenedorDeAtaque.getCantidadAtaquesDisponibles() > 0) {

				ataquesDisponibles.add(contenedorDeAtaque.obtenerAtaque());
			}

		}

		return ataquesDisponibles;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public abstract Algomon clone() throws CloneNotSupportedException;
	
	public String obtenerDescripcionDeEstado(){
		return this.estadoAlgomon.getEstadoEsfimero().getClass().getSimpleName() + " - "+this.estadoAlgomon.getEstadoPersistente().getClass().getSimpleName();
	}

	public Boolean tieneAtaquesDisponibles() {
		Boolean ataquesDisponibles = Boolean.FALSE;
		if(this.obtenerAtaquesDisponibles().size()>0){
			ataquesDisponibles = Boolean.TRUE;
		}
		return ataquesDisponibles;
	}

	public Boolean estaVivo() {	
		return this.puntosDeVida>0;
	}

}
