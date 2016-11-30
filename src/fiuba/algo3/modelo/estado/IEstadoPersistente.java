package fiuba.algo3.modelo.estado;

import fiuba.algo3.modelo.accion.Accion;

public interface IEstadoPersistente {
	
	public void realizarAccion(Accion accion);

	public Boolean estaQuemado();

}
