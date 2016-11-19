package fiuba.algo3.model;

import java.util.Stack;

public class Squirtle extends AlgomonAgua {
	private final static double PUNTOS_DE_VIDA_INICIAL=150d;
	public static final int CANTIDAD_ATAQUES_BURBUJA = 15;
	public static final int CANTIDAD_ATAQUES_CANIONDEAGUA = 8;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
	
	public Squirtle() {
		super();
		this.puntosDeVida = 150d;
		
		Stack<Ataque> ataquesBurbuja = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_BURBUJA ; i++  ) {
			Ataque burbuja = new Burbuja();
			ataquesBurbuja.push(burbuja);
		} 
		ContenedorDeAtaque contenedorDeAtaqueBurbuja = new ContenedorDeAtaque(ataquesBurbuja);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBurbuja);
		
		Stack<Ataque> ataquesCanionDeAgua = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_CANIONDEAGUA ; i++  ) {
			Ataque canionDeAgua = new CanionDeAgua();
			ataquesCanionDeAgua.push(canionDeAgua);
		} 
		ContenedorDeAtaque contenedorDeAtaqueCanionDeAgua = new ContenedorDeAtaque(ataquesCanionDeAgua);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueCanionDeAgua);
		
		
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
