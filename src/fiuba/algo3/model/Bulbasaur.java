package fiuba.algo3.model;

public class Bulbasaur extends AlgomonPlanta {

	private final static double PUNTOS_DE_VIDA_INICIAL=140d;
	
	public Bulbasaur() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		
		LatigoCepa latigoCepa = new LatigoCepa();		
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(latigoCepa,LatigoCepa.CANTIDAD_ATAQUES_LATIGO_CEPA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);
		
		ChupaVidas chupaVidas = new ChupaVidas();		
		ContenedorDeAtaque contenedorDeAtaqueChupaVidas = new ContenedorDeAtaque(chupaVidas,ChupaVidas.CANTIDAD_ATAQUES_CHUPA_VIDAS);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueChupaVidas);
	}

	@Override
	protected double obtenerPuntosDeVidaInicial() {
		return  PUNTOS_DE_VIDA_INICIAL;
	}
}
