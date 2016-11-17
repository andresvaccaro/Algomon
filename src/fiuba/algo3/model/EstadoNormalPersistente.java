package fiuba.algo3.model;

import fiuba.algo3.model.accion.Accion;

public class EstadoNormalPersistente implements IEstadoPersistente {

	

	@Override
	public void realizarAccion(Accion accion) {	
		
	}

	@Override
	public Boolean estaQuemado() {
		return Boolean.FALSE;
	}

	

}
