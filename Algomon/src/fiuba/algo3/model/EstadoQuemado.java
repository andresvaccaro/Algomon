package fiuba.algo3.model;

public class EstadoQuemado implements IEstadoPersistente {

	@Override
	public void realizarAccion(Algomon algomon) {
			algomon.disminuirDiezPorciento();
	}

	
	
}
