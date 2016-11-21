package fiuba.algo3.model.accion;

import fiuba.algo3.model.algomon.Algomon;

public abstract class Accion {
	
	protected Algomon algomonQueRealizaLaAccion;
	
	public abstract void realizarAccion();
	
	public void cargarAlgomonQueRealizaLaAccion(Algomon algomonQueRealizaLaAccion){
		this.algomonQueRealizaLaAccion = algomonQueRealizaLaAccion;
	}

	public Algomon getAlgomonQueRealizaLaAccion() {
		return algomonQueRealizaLaAccion;
	}

	public abstract boolean puedeRealizarlaDormido();
	
	
	
	
	
}
