package fiuba.algo3.model;

import java.util.Stack;

public class Charmander extends Algomon {
	
	private final static double PUNTOS_DE_VIDA_INICIAL=170d;
	public static final int CANTIDAD_ATAQUES_BRASAS = 10;
	public static final int CANTIDAD_ATAQUES_FOGONAZO = 4;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
	
	public Charmander() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		
		Stack<Ataque> ataquesBrasas = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_BRASAS ; i++  ) {
			Ataque brasas = new Brasas();
			ataquesBrasas.push(brasas);
		} 
		ContenedorDeAtaque contenedorDeAtaquesBrasas = new ContenedorDeAtaque(ataquesBrasas);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesBrasas);
		
		Stack<Ataque> ataquesFogonazo = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_FOGONAZO ; i++  ) {
			Ataque fogonazo = new Fogonazo();
			ataquesFogonazo.push(fogonazo);
		} 
		ContenedorDeAtaque contenedorDeAtaqueFogonazo = new ContenedorDeAtaque(ataquesFogonazo);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueFogonazo);
		
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

	@Override
	public double obtenerMultiplicadorDeAtaqueDeAgua() {
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDePlanta() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDeFuego() {
		return 0.5d;
	}

}
