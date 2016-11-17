package fiuba.algo3.model;

public class Burbuja extends Ataque{
		
	public static final int CANTIDAD_ATAQUES_BURBUJA = 15;
	public Burbuja() {
		super();
		this.potencia = 10;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {		
		algomonAtacado.disminuirPuntosDeVida(this.potencia * algomonAtacado.obtenerMultiplicadorDeAtaqueDeAgua());
		
	}



}
