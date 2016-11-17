package fiuba.algo3.model;

public class Fogonazo extends Ataque {

	public static final int CANTIDAD_ATAQUES_FOGONASO = 4;
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
