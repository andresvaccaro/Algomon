package fiuba.algo3.model.accion.ataque;

import fiuba.algo3.model.algomon.Algomon;

public class Brasas extends Ataque {
	
	
	public Brasas() {
		super();
		this.potencia = 16;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		
		algomonAtacado.disminuirPuntosDeVida( this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDeFuego() );		
	}

}
