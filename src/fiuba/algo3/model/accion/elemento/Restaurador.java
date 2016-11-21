package fiuba.algo3.model.accion.elemento;

public class Restaurador extends Elemento {

	@Override
	public void realizarAccion() {
		this.algomonQueRealizaLaAccion.despertar();
		this.algomonQueRealizaLaAccion.enfriar();

	}

	
}
