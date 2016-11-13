package fiuba.algo3.model;

public class Bulbasaur extends AlgomonPlanta {

	
	public Bulbasaur() {
		super();
		this.puntosDeVida = 140d;
		
		LatigoCepa latigoCepa = new LatigoCepa();		
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(latigoCepa,LatigoCepa.CANTIDAD_ATAQUES_LATIGO_CEPA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);
	}
}
