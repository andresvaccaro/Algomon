package fiuba.algo3.model;

public class CanionDeAgua extends Ataque{

	public static final int CANTIDAD_ATAQUES_CANION_DE_AGUA = 20;
	public CanionDeAgua() {
		super();
		this.potencia = 20;
		
	}

	@Override
	public void causarEfecto(Algomon algomonAtacado) {
		algomonAtacado.disminuirPuntosDeVida(this.potencia*algomonAtacado.obtenerMultiplicadorDeAtaqueDeAgua());
		
	}
}
