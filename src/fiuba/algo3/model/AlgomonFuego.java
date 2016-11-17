package fiuba.algo3.model;

public abstract class AlgomonFuego extends Algomon{

	@Override
	public double obtenerMultiplicadorDeAtaqueDeAgua() {
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDePlanta() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDeFuego() {	
		return 0.5d;
	}

	
}
