package fiuba.algo3.modelo.accion.ataque;

import fiuba.algo3.modelo.algomon.Algomon;

public class LatigoCepa extends Ataque {


	public LatigoCepa() {
		super();
		this.potencia = 15;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado, Algomon algomonAtacante) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDePlanta());
	}

}
