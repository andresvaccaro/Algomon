package fiuba.algo3.model;

public class AlgomonNormal extends Algomon {

	@Override
	public double obtenerMultiplicadorDeAtacante(Algomon algomonAtacante) {
		return algomonAtacante.obtenerMultiplicadorParaTipoNormal();		
	}

	@Override
	public double obtenerMultiplicadorParaTipoFuego() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double obtenerMultiplicadorParaTipoPlanta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double obtenerMultiplicadorParaTipoAgua() {
		// TODO Auto-generated method stub
		return 0;
	}

}
