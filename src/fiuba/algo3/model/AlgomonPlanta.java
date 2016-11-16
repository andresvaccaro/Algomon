package fiuba.algo3.model;

public class AlgomonPlanta extends Algomon{

	@Override
	public double obtenerMultiplicadorDeAtaqueDeAgua() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDePlanta() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDeFuego() {	
		return 2d;
	}


}
