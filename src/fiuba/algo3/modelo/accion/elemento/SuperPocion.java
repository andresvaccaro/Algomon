package fiuba.algo3.modelo.accion.elemento;

public class SuperPocion extends Elemento {

	private static final double PUNTOS_DE_AMUENTO=40d;
	
	@Override
	public void realizarAccion() {		
		this.algomonQueRealizaLaAccion.aumentarPuntosDeVida(PUNTOS_DE_AMUENTO);
	}

}
