package fiuba.algo3.modelo.algomon;

import java.util.Stack;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.AtaqueRapido;
import fiuba.algo3.modelo.accion.ataque.ChupaVidas;
import fiuba.algo3.modelo.accion.ataque.ContenedorDeAtaque;
import fiuba.algo3.modelo.accion.ataque.LatigoCepa;

public class Bulbasaur extends Algomon {

	private final static double PUNTOS_DE_VIDA_INICIAL=140d;
	public static final int CANTIDAD_ATAQUES_CHUPAVIDAS = 8;
	public static final int CANTIDAD_ATAQUES_LATIGO_CEPA = 10;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
			
	public Bulbasaur() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		this.nombre = "Bulbasaur";
		
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

	@Override
	public double obtenerMultiplicadorDeAtaqueDeAgua() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDePlanta() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDeFuego() {
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueNormal() {
		return 1d;
	}

	@Override
	public Algomon clone() throws CloneNotSupportedException {
		Bulbasaur bulbasaur = new Bulbasaur();
		return bulbasaur;
	}

	@Override
	public String obtenerUrlImagen() {		
		return "imagenes/bulbasaur.png";
	}

	
}
