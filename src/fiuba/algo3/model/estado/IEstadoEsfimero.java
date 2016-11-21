package fiuba.algo3.model.estado;

import fiuba.algo3.model.accion.Accion;

public interface IEstadoEsfimero {
		
	Boolean estaDormido();

	void realizarAccion(Accion accion);
}
