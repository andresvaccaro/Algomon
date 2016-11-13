package fiuba.algo3.model;

public abstract class Ataque {

	protected double potencia;
	
	public abstract void causarEfecto(Algomon algomonAtacante, Algomon algomonAtacado);

}
