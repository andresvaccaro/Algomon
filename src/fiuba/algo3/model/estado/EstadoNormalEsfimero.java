package fiuba.algo3.model.estado;

import fiuba.algo3.model.accion.Accion;

public class EstadoNormalEsfimero implements IEstadoEsfimero {

	@Override
	public Boolean estaDormido() {
		return Boolean.FALSE;
	}

	@Override
	public void realizarAccion(Accion accion) {
		accion.realizarAccion();
	}

}
