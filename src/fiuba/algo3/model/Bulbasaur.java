package fiuba.algo3.model;

import java.util.Stack;

public class Bulbasaur extends AlgomonPlanta {

	private final static double PUNTOS_DE_VIDA_INICIAL=140d;
	public static final int CANTIDAD_ATAQUES_CHUPAVIDAS = 8;
	public static final int CANTIDAD_ATAQUES_LATIGO_CEPA = 10;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
	
	public Bulbasaur() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		
		Stack<Ataque> ataquesChupavidas = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_CHUPAVIDAS ; i++  ) {
			Ataque chupavidas = new ChupaVidas();
			ataquesChupavidas.push(chupavidas);
		} 
		ContenedorDeAtaque contenedorDeAtaquesChupavidas = new ContenedorDeAtaque(ataquesChupavidas);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesChupavidas);
		
		Stack<Ataque> ataquesLatigoCepa = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_LATIGO_CEPA ; i++  ) {
			Ataque latigoCepa = new LatigoCepa();
			ataquesLatigoCepa.push(latigoCepa);
		} 
		ContenedorDeAtaque contenedorDeAtaqueLatigoCepa = new ContenedorDeAtaque(ataquesLatigoCepa);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueLatigoCepa);
		
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
		return  PUNTOS_DE_VIDA_INICIAL;
	}
}
