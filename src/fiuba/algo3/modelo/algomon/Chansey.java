package fiuba.algo3.modelo.algomon;

import java.util.Stack;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.AtaqueRapido;
import fiuba.algo3.modelo.accion.ataque.Canto;
import fiuba.algo3.modelo.accion.ataque.ContenedorDeAtaque;
import fiuba.algo3.modelo.accion.ataque.LatigoCepa;

public class Chansey extends AlgomonNormal {
	
	private final static double PUNTOS_DE_VIDA_INICIAL=130;
	public static final int CANTIDAD_ATAQUES_CANTO = 6;
	public static final int CANTIDAD_ATAQUES_LATIGO_CEPA = 10;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
	
	public Chansey() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		this.nombre = "Chansey";
		
		Stack<Ataque> ataquesCanto = new Stack<Ataque>();
		for (int i=0 ; i < CANTIDAD_ATAQUES_CANTO ; i++  ) {
			Ataque canto = new Canto();
			ataquesCanto.push(canto);
		} 
		ContenedorDeAtaque contenedorDeAtaquesCanto = new ContenedorDeAtaque(ataquesCanto);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesCanto);
		
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
		return PUNTOS_DE_VIDA_INICIAL;
	}

	@Override	
	public Algomon clone() throws CloneNotSupportedException {
		Chansey chansey = new Chansey();
		return chansey;
	}

	

}
