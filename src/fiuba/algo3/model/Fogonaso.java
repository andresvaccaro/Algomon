package fiuba.algo3.model;

public class Fogonaso extends Ataque {

	public static final int CANTIDAD_ATAQUES_FOGONASO = 15;
	public Fogonaso() {
		super();
		this.potencia = 10;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDeFuego());		
	}

}
