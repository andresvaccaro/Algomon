package fiuba.algo3.model.accion.elemento;

public class Pocion extends Elemento {

	private static final double PUNTOS_DE_AMUENTO=20d;
	
	@Override
	public void realizarAccion() {		
		this.algomonQueRealizaLaAccion.aumentarPuntosDeVida(PUNTOS_DE_AMUENTO);
	}

}
