package fiuba.algo3.model.accion.ataque;

import fiuba.algo3.model.algomon.Algomon;

public class Canto extends Ataque {
	
	
	public Canto() {
		super();
		this.potencia = 0;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		algomonAtacado.dormir();
	}

}
