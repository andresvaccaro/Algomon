package fiuba.algo3.modelo.estado;

import fiuba.algo3.modelo.accion.Accion;

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
