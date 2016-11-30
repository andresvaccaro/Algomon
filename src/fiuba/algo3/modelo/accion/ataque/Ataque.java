package fiuba.algo3.modelo.accion.ataque;

import fiuba.algo3.modelo.accion.Accion;
import fiuba.algo3.modelo.algomon.Algomon;

public abstract class Ataque extends Accion{

	protected double potencia;	
	protected Algomon atacado;
	
	public abstract void causarEfecto(Algomon algomonAtacado,Algomon algomonAtacante);

	
	public void realizarAccion(){
		causarEfecto(this.atacado , this.algomonQueRealizaLaAccion);
	}
	
	
	public void cargarAtacado(Algomon atacado){
		this.atacado = atacado;
	}
	
	
	public Algomon getAlgomonAtacado(){
		
		return this.atacado;
	}
	
	@Override
	public boolean puedeRealizarlaDormido() {
		return Boolean.FALSE;
	}
	
	
}
