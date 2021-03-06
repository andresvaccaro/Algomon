package fiuba.algo3.modelo.estado;

import fiuba.algo3.modelo.accion.Accion;

public class EstadoDormido implements IEstadoEsfimero {

	private int cantidadDeAccionesPendientes;

	public EstadoDormido() {
		super();
		this.cantidadDeAccionesPendientes = 3;
	}

	@Override
	public Boolean estaDormido() {
		
		return Boolean.TRUE;
	}

	@Override
	public void realizarAccion(Accion accion) {
		if(accion.puedeRealizarlaDormido()){
			accion.realizarAccion();
		}
		if (cantidadDeAccionesPendientes == 1) {
			accion.getAlgomonQueRealizaLaAccion().despertar();
		} else {
			cantidadDeAccionesPendientes--;
		}

	}

}
