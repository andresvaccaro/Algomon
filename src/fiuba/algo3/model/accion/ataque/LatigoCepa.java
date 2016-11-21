package fiuba.algo3.model.accion.ataque;

import fiuba.algo3.model.algomon.Algomon;

public class LatigoCepa extends Ataque {


	public LatigoCepa() {
		super();
		this.tipoAtaque = new AtaquePlanta();
		this.potencia = 15;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado, Algomon algomonAtacante) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDePlanta());
	}

}
