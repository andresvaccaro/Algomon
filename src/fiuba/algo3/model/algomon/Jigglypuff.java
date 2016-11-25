package fiuba.algo3.model.algomon;

import java.util.Stack;

import fiuba.algo3.model.ContenedorDeAtaque;
import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.ataque.AtaqueRapido;
import fiuba.algo3.model.accion.ataque.Burbuja;
import fiuba.algo3.model.accion.ataque.Canto;

public class Jigglypuff extends AlgomonNormal {

	private static double PUNTOS_DE_VIDA_INICIAL = 130;
	public static final int CANTIDAD_ATAQUES_CANTO = 6;
	public static final int CANTIDAD_ATAQUES_BURBUJA = 15;
	public static final int CANTIDAD_ATAQUES_ATAQUE_RAPIDO = 16;

	public Jigglypuff() {
		super();
		this.puntosDeVida = PUNTOS_DE_VIDA_INICIAL;
		this.nombre = "Jigglypuff";

		Stack<Ataque> ataquesCanto = new Stack<Ataque>();
		for (int i = 0; i < CANTIDAD_ATAQUES_CANTO; i++) {
			Ataque canto = new Canto();
			ataquesCanto.push(canto);
		}
		ContenedorDeAtaque contenedorDeAtaquesCanto = new ContenedorDeAtaque(ataquesCanto);
		this.contenedoresDeAtaques.add(contenedorDeAtaquesCanto);

		Stack<Ataque> ataquesBurbuja = new Stack<Ataque>();
		for (int i = 0; i < CANTIDAD_ATAQUES_BURBUJA; i++) {
			Ataque burbuja = new Burbuja();
			ataquesBurbuja.push(burbuja);
		}
		ContenedorDeAtaque contenedorDeAtaqueBurbuja = new ContenedorDeAtaque(ataquesBurbuja);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBurbuja);

		Stack<Ataque> ataquesAtaqueRapido = new Stack<Ataque>();
		for (int i = 0; i < CANTIDAD_ATAQUES_ATAQUE_RAPIDO; i++) {
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
		Jigglypuff jigglypuff = new Jigglypuff();
		return jigglypuff;
	}

}
