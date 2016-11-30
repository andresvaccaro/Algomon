package fiuba.algo3.modelo.accion.ataque;

import fiuba.algo3.modelo.algomon.Algomon;

public class Burbuja extends Ataque{
		
	
	public Burbuja() {
		super();
		this.potencia = 10;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {		
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDeAgua());
		
	}



}
