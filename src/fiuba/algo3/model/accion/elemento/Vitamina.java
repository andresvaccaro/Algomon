package fiuba.algo3.model.accion.elemento;

public class Vitamina extends Elemento {

	@Override
	public void realizarAccion() {
		this.algomonQueRealizaLaAccion.aumentarCantidadDeAtaques(2);

	}

}
