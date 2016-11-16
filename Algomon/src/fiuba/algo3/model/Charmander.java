package fiuba.algo3.model;

public class Charmander extends AlgomonFuego {

	public Charmander() {
		super();
		this.puntosDeVida = 170d;
		
		Fogonaso fogonaso = new Fogonaso();		
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(fogonaso,LatigoCepa.CANTIDAD_ATAQUES_LATIGO_CEPA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);
		
		Brasas brasas = new Brasas();		
		ContenedorDeAtaque contenedorDeAtaqueBrasas = new ContenedorDeAtaque(brasas,Brasas.CANTIDAD_ATAQUES_BRASAS);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBrasas);
	}

}
