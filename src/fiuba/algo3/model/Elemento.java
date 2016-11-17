package fiuba.algo3.model;

import fiuba.algo3.model.accion.Accion;

public abstract class Elemento extends Accion {

	@Override
	public abstract void realizarAccion();

	@Override
	public boolean puedeRealizarlaDormido() {
		return Boolean.TRUE;
	}

}
