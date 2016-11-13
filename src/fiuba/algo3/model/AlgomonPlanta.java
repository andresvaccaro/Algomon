package fiuba.algo3.model;

public class AlgomonPlanta extends Algomon{

	@Override
	public double obtenerMultiplicadorDeAtacante(Algomon algomonAtacante) {			
		return algomonAtacante.obtenerMultiplicadorParaTipoPlanta();
	}

	@Override
	public double obtenerMultiplicadorParaTipoFuego() {
		return 2d;		
	}

	@Override
	public double obtenerMultiplicadorParaTipoAgua() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorParaTipoPlanta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
