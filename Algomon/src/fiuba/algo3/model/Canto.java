package fiuba.algo3.model;

public class Canto extends Ataque {
	
	public static final int CANTIDAD_ATAQUES_CANTO = 6;
	
	public Canto() {
		super();
		this.potencia = 0;
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado) {
		algomonAtacado.dormir();
	}

}
