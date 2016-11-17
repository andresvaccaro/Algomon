package fiuba.algo3.model;

import fiuba.algo3.model.accion.Accion;

public class EstadoQuemado implements IEstadoPersistente {

	@Override
	public void realizarAccion(Accion accion) {
			accion.getAlgomonQueRealizaLaAccion().disminuirDiezPorciento();
	}

	@Override
	public Boolean estaQuemado() {
		return Boolean.TRUE;
	}

	
	
}
