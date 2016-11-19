package fiuba.algo3.model;

import java.util.Stack;

public class Jigglypuff extends AlgomonNormal {

	
	private static double PUNTOS_DE_VIDA_INICIAL=130;
	public static final int CANTIDAD_ATAQUES_CANTO = 6;
	public static final int CANTIDAD_ATAQUES_BURBUJA = 15;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
	
	public Jigglypuff() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		
		Stack<Ataque> ataquesCanto = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_CANTO ; i++  ) {
			Ataque canto = new Canto();
			ataquesCanto.push(canto);
		} 
		ContenedorDeAtaque contenedorDeAtaquesCanto = new ContenedorDeAtaque(ataquesCanto);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesCanto);
		
		Stack<Ataque> ataquesBurbuja = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_BURBUJA ; i++  ) {
			Ataque burbuja = new Burbuja();
			ataquesBurbuja.push(burbuja);
		} 
		ContenedorDeAtaque contenedorDeAtaqueBurbuja = new ContenedorDeAtaque(ataquesBurbuja);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBurbuja);
		
		Stack<Ataque> ataquesAtaqueRapido = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_ATAQUE_RAPIDO ; i++  ) {
			Ataque ataqueRapido = new AtaqueRapido();
			ataquesAtaqueRapido.push(ataqueRapido);
		} 
		ContenedorDeAtaque contenedorDeAtaquesAtaqueRapido = new ContenedorDeAtaque(ataquesAtaqueRapido);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesAtaqueRapido);
		
	}

	@Override
	protected double obtenerPuntosDeVidaInicial() {
		return PUNTOS_DE_VIDA_INICIAL;
	}

	
	
}
