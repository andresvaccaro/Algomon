package fiuba.algo3.modelo.accion.elemento;

public class Restaurador extends Elemento {

	@Override
	public void realizarAccion() {
		this.algomonQueRealizaLaAccion.despertar();
		this.algomonQueRealizaLaAccion.enfriar();

	}

	
}
