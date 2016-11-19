package fiuba.algo3.model;

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
