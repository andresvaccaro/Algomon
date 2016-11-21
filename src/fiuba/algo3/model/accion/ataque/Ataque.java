package fiuba.algo3.model.accion.ataque;

import fiuba.algo3.model.accion.Accion;
import fiuba.algo3.model.algomon.Algomon;

public abstract class Ataque extends Accion{

	protected double potencia;
	protected TipoAtaque tipoAtaque;	
	protected Algomon atacado;
	
	public abstract void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante);

	
	public void realizarAccion(){
		causarEfecto(this.atacado , this.algomonQueRealizaLaAccion);
	}
	
	
	public void cargarAtacado(Algomon atacado){
		this.atacado = atacado;
	}
	
	@Override
	public boolean puedeRealizarlaDormido() {
		return Boolean.FALSE;
	}
}
