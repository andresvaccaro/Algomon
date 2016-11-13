package fiuba.algo3.model;

public class Chansey extends AlgomonNormal {

	public Chansey() {
		super();
		this.puntosDeVida = 130;
		
		LatigoCepa latigoCepa = new LatigoCepa();		
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(latigoCepa,LatigoCepa.CANTIDAD_ATAQUES_LATIGO_CEPA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);
		
	}

	

}
