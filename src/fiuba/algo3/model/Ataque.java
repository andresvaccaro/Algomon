package fiuba.algo3.model;

public abstract class Ataque {

	protected double potencia;
	protected TipoAtaque tipoAtaque;
	
	public abstract void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante);

}
