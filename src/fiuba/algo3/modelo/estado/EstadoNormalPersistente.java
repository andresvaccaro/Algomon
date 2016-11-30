package fiuba.algo3.modelo.estado;

import fiuba.algo3.modelo.accion.Accion;

public class EstadoNormalPersistente implements IEstadoPersistente {

	

	@Override
	public void realizarAccion(Accion accion) {	
		
	}

	@Override
	public Boolean estaQuemado() {
		return Boolean.FALSE;
	}

	

}
