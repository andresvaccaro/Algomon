package fiuba.algo3.model;

public class Restaurador extends Elemento {

	@Override
	public void realizarAccion() {
		this.algomonQueRealizaLaAccion.despertar();
		this.algomonQueRealizaLaAccion.enfriar();

	}

	
}
