package fiuba.algo3.model;

public class Jigglypuff extends AlgomonNormal {

	public Jigglypuff() {
		super();
		this.puntosDeVida = 130;

		Canto canto = new Canto();		
		ContenedorDeAtaque contenedorDeAtaqueCanto = new ContenedorDeAtaque(canto,Canto.CANTIDAD_ATAQUES_CANTO);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueCanto);
	}

	
	
}
