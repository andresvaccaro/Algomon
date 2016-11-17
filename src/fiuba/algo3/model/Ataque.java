package fiuba.algo3.model;

import fiuba.algo3.model.accion.Accion;

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
}
