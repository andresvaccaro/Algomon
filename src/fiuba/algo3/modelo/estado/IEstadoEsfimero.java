package fiuba.algo3.modelo.estado;

import fiuba.algo3.modelo.accion.Accion;

public interface IEstadoEsfimero {
		
	Boolean estaDormido();

	void realizarAccion(Accion accion);
}
