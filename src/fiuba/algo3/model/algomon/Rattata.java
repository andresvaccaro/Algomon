package fiuba.algo3.model.algomon;

import java.util.Stack;

import fiuba.algo3.model.ContenedorDeAtaque;
import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.accion.ataque.Burbuja;
import fiuba.algo3.model.accion.ataque.Fogonazo;

public class Rattata extends AlgomonNormal {

	private static double PUNTOS_DE_VIDA_INICIAL=170;
	public static final int CANTIDAD_ATAQUES_FOGONAZO = 4;
	public static final int CANTIDAD_ATAQUES_BURBUJA = 15;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;

	
	public Rattata() {
		super();		
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		this.nombre = "Rattata";

		Stack<Ataque> ataquesFogonazo = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_FOGONAZO ; i++  ) {
			Ataque fogonazo = new Fogonazo();
			ataquesFogonazo.push(fogonazo);
		} 
		ContenedorDeAtaque contenedorDeAtaquesFogonazo = new ContenedorDeAtaque(ataquesFogonazo);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesFogonazo);
		
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
