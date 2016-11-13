package fiuba.algo3.model;

public class AlgomonAgua extends Algomon{

	@Override
	public double obtenerMultiplicadorDeAtacante(Algomon algomonAtacante) {
		return algomonAtacante.obtenerMultiplicadorParaTipoAgua();
	}

	@Override
	public double obtenerMultiplicadorParaTipoFuego() {
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorParaTipoAgua() {
		return 0.5d;
	}

}
