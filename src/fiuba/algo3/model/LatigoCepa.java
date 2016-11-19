package fiuba.algo3.model;

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
