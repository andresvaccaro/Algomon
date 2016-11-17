package fiuba.algo3.model;

import fiuba.algo3.model.accion.Accion;

public interface IEstadoEsfimero {
		
	Boolean estaDormido();

	void realizarAccion(Accion accion);
}
