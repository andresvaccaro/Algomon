package fiuba.algo3.model;

public class AlgomonAgua extends Algomon{

	@Override
	public double obtenerMultiplicadorDeAtaqueDeAgua() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDePlanta() {	
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDeFuego() {
		return 0.5d;
	}



}
