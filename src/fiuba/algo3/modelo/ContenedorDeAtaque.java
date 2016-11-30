package fiuba.algo3.modelo;

import java.util.Stack;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.algomon.Algomon;

public class ContenedorDeAtaque {
	Stack<Ataque> ataques;
	private Ataque ataqueDelContenedor;

	public ContenedorDeAtaque(Stack<Ataque> ataquesACargar) {

		ataques = ataquesACargar;
		ataqueDelContenedor = ataques.peek();

	}

	public void lanzarAtaque(Algomon algomonAtacante, Algomon algomonAtacado) {

		if (this.getCantidadAtaquesDisponibles() > 0) {
			Ataque ataque = ataques.pop();

			ataque.cargarAtacado(algomonAtacado);

			ataque.cargarAlgomonQueRealizaLaAccion(algomonAtacante);

			algomonAtacante.getEstadoAlgomon().realizarAccion(ataque);

		}
	}

	public Boolean sosDeAtaque(Class tipoAtaque) {

		return tipoAtaque.equals(ataqueDelContenedor.getClass());

	}

	public void aumentarCantidad(int cantidadAAumentar) {

		for (int i = 0; i < cantidadAAumentar; i++) {

			ataques.push(ataqueDelContenedor);
		}
	}

	public int getCantidadAtaquesDisponibles() {

		return ataques.size();
	}

	public Ataque obtenerAtaque() {

		return ataqueDelContenedor;
	}

}
