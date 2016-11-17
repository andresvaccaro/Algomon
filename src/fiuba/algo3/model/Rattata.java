package fiuba.algo3.model;

public class Rattata extends AlgomonNormal {

	private static double PUNTOS_DE_VIDA_INICIAL=170;
	
	public Rattata() {
		super();		
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;

		Fogonazo fogonazo = new Fogonazo();		
		ContenedorDeAtaque contenedorDeAtaqueFogonazo = new ContenedorDeAtaque(fogonazo,Fogonazo.CANTIDAD_ATAQUES_FOGONASO);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueFogonazo);

	}

	@Override
	protected double obtenerPuntosDeVidaInicial() {
		return PUNTOS_DE_VIDA_INICIAL;
	}

	
}
