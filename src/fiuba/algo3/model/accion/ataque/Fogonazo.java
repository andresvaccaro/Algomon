package fiuba.algo3.model.accion.ataque;

import fiuba.algo3.model.algomon.Algomon;

public class Fogonazo extends Ataque {

	public Fogonazo() {
		super();
		this.potencia = 2;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDeFuego());		
		algomonAtacado.quemar();
	}

}
