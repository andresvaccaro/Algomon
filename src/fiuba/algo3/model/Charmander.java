package fiuba.algo3.model;

public class Charmander extends AlgomonFuego {
	private final static double PUNTOS_DE_VIDA_INICIAL=170d;
	
	public Charmander() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		
		Fogonazo fogonazo = new Fogonazo();		
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(fogonazo,Fogonazo.CANTIDAD_ATAQUES_FOGONASO);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);

		Brasas brasas = new Brasas();		
		ContenedorDeAtaque contenedorDeAtaqueBrasas = new ContenedorDeAtaque(brasas,Brasas.CANTIDAD_ATAQUES_BRASAS);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBrasas);		
	}
	
	@Override
	protected double obtenerPuntosDeVidaInicial() {	
		return PUNTOS_DE_VIDA_INICIAL;
	}

}
