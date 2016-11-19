package fiuba.algo3.model;

public class ChupaVidas extends Ataque {
	
	public ChupaVidas() {
		super();
		this.potencia = 15;
	}
	
	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		double puntosASacar = this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDePlanta();
		algomonAtacado.disminuirPuntosDeVida(puntosASacar);
		algomonAtacante.aumentarPuntosDeVida(puntosASacar*0.3);
	}

}
