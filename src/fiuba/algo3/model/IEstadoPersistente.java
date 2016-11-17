package fiuba.algo3.model;

import fiuba.algo3.model.accion.Accion;

public interface IEstadoPersistente {
	
	public void realizarAccion(Accion accion);

	public Boolean estaQuemado();

}
