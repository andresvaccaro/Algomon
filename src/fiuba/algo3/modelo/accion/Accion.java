package fiuba.algo3.modelo.accion;

import fiuba.algo3.modelo.algomon.Algomon;

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
