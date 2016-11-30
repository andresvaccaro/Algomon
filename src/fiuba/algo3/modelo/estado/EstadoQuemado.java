package fiuba.algo3.modelo.estado;

import fiuba.algo3.modelo.accion.Accion;

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
