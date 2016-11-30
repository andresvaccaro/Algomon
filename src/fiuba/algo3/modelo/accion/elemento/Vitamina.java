package fiuba.algo3.modelo.accion.elemento;

public class Vitamina extends Elemento {

	@Override
	public void realizarAccion() {
		this.algomonQueRealizaLaAccion.aumentarCantidadDeAtaques(2);

	}

}
