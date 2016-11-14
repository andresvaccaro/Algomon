package fiuba.algo3.model;

public class EstadoNormalEsfimero implements IEstadoEsfimero {

	@Override
	public void atacar(Ataque ataque, Algomon algomonAtacado,Algomon algomonAtacante) {
		ataque.causarEfecto(algomonAtacado);
	}

	@Override
	public Boolean estaDormido() {
		return Boolean.FALSE;
	}
		

}
