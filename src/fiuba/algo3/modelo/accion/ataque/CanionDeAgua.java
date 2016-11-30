package fiuba.algo3.modelo.accion.ataque;

import fiuba.algo3.modelo.algomon.Algomon;

public class CanionDeAgua extends Ataque{

	
	public CanionDeAgua() {
		super();
		this.potencia = 20;
		
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia*algomonAtacado.obtenerMultiplicadorDeAtaqueDeAgua());
		
	}
}
