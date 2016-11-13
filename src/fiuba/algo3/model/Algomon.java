package fiuba.algo3.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Algomon {

	protected double puntosDeVida;
	
	protected List<ContenedorDeAtaque> contenedoresDeAtaques;	
	
	public Algomon() {
		super();
		this.contenedoresDeAtaques = new ArrayList<>();
	}

	public void atacar(Algomon algomonAtacado, Class tipoDeAtaque) {			
		ContenedorDeAtaque contenedorDeAtaque = buscarContenedorDeAtaque(tipoDeAtaque);		
		contenedorDeAtaque.lanzarAtaque(this,algomonAtacado);
	}

	private ContenedorDeAtaque buscarContenedorDeAtaque(Class tipoDeAtaque) {
		ContenedorDeAtaque contenedorEncontrado= null;
		for (ContenedorDeAtaque contenedorDeAtaque : contenedoresDeAtaques) {
			if( contenedorDeAtaque.sosDeAtaque(tipoDeAtaque)){
				contenedorEncontrado= contenedorDeAtaque;
			}
		}
		return contenedorEncontrado;
	}

	public double getPuntosDeVida() {
		return puntosDeVida;
	}

	public abstract double obtenerMultiplicadorDeAtacante(Algomon algomonAtacante);

	public abstract double obtenerMultiplicadorParaTipoFuego();

	public abstract double obtenerMultiplicadorParaTipoAgua();

	public void disminuirPuntosDeVida(double puntosADisminuir) {		
		this.puntosDeVida= this.puntosDeVida - puntosADisminuir;
	}
	
	
	
}
