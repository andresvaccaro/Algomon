package fiuba.algo3.model;

public class AtaqueRapido extends Ataque {
	
	public AtaqueRapido() {
		super();
		this.potencia = 10;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado, Algomon algomonAtacante) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueNormal());

	}

}