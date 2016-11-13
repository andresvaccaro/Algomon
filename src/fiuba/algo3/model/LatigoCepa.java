package fiuba.algo3.model;

public class LatigoCepa extends Ataque {

	public static final int CANTIDAD_ATAQUES_LATIGO_CEPA = 10;

	public LatigoCepa() {
		super();
		this.tipoAtaque = new AtaquePlanta();
		this.potencia = 15;
	}
	
	@Override
	public void causarEfecto(Algomon algomonAtacante, Algomon algomonAtacado) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia*algomonAtacado.obtenerMultiplicadorDeAtaqueDePlanta());
	}

}
