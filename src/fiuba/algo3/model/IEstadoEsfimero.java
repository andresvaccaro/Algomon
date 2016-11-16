package fiuba.algo3.model;

public interface IEstadoEsfimero {
	
	void atacar(Ataque ataque, Algomon algomonAtacado, Algomon algomonAtacante);

	Boolean estaDormido();
}
