package fiuba.algo3.modelo.algomon;

import java.util.Stack;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.AtaqueRapido;
import fiuba.algo3.modelo.accion.ataque.Burbuja;
import fiuba.algo3.modelo.accion.ataque.CanionDeAgua;
import fiuba.algo3.modelo.accion.ataque.ContenedorDeAtaque;

public class Squirtle extends Algomon {
	private final static double PUNTOS_DE_VIDA_INICIAL=150d;
	public static final int CANTIDAD_ATAQUES_BURBUJA = 15;
	public static final int CANTIDAD_ATAQUES_CANIONDEAGUA = 8;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;
	
	public Squirtle() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		this.nombre = "Squirtle";
		
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

	@Override
	public double obtenerMultiplicadorDeAtaqueDeAgua() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDePlanta() {
		return 2d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueDeFuego() {
		return 0.5d;
	}

	@Override
	public double obtenerMultiplicadorDeAtaqueNormal() {
		return 1d;
	}

	@Override
	public Algomon clone() throws CloneNotSupportedException {
		Squirtle squirtle = new Squirtle();
		return squirtle;
	}

	@Override
	public String obtenerUrlImagen() {
		return "imagenes/squirtle.png";
	}
	
	
}
