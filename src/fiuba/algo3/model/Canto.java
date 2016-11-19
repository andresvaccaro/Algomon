package fiuba.algo3.model;

public class Canto extends Ataque {
	
	
	public Canto() {
		super();
		this.potencia = 0;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante) {
		algomonAtacado.dormir();
	}

}
