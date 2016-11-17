package fiuba.algo3.model;

public class Jigglypuff extends AlgomonNormal {

	
	private static double PUNTOS_DE_VIDA_INICIAL=130;
	
	public Jigglypuff() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;

		Canto canto = new Canto();		
		ContenedorDeAtaque contenedorDeAtaqueCanto = new ContenedorDeAtaque(canto,Canto.CANTIDAD_ATAQUES_CANTO);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueCanto);
	}

	@Override
	protected double obtenerPuntosDeVidaInicial() {
		return PUNTOS_DE_VIDA_INICIAL;
	}

	
	
}
