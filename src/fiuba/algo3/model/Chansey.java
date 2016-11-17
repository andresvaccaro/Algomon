package fiuba.algo3.model;

public class Chansey extends AlgomonNormal {
	
	private final static double PUNTOS_DE_VIDA_INICIAL=130;
	
	public Chansey() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		
		LatigoCepa latigoCepa = new LatigoCepa();		
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(latigoCepa,LatigoCepa.CANTIDAD_ATAQUES_LATIGO_CEPA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);
		
		
		Canto canto = new Canto();		
		ContenedorDeAtaque contenedorDeAtaqueCanto = new ContenedorDeAtaque(canto,Canto.CANTIDAD_ATAQUES_CANTO);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueCanto);
		
	}

	@Override
	protected double obtenerPuntosDeVidaInicial() {
		return PUNTOS_DE_VIDA_INICIAL;
	}

	

}
