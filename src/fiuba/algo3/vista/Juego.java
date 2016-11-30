package fiuba.algo3.vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fiuba.algo3.model.Entrenador;
import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.accion.elemento.Elemento;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.algomon.Bulbasaur;
import fiuba.algo3.model.algomon.Chansey;
import fiuba.algo3.model.algomon.Charmander;
import fiuba.algo3.model.algomon.Jigglypuff;
import fiuba.algo3.model.algomon.Rattata;
import fiuba.algo3.model.algomon.Squirtle;

public class Juego {

	private HashMap<String, Algomon> diccionarioDeAlgomones;

	private Entrenador entrenador1;

	private Entrenador entrenador2;

	private Entrenador entrenadorActivo;

	public Juego() {
		super();
		this.diccionarioDeAlgomones = new HashMap<>();
		this.diccionarioDeAlgomones.put("Charmander", new Charmander());
		this.diccionarioDeAlgomones.put("Bulbasaur", new Bulbasaur());
		this.diccionarioDeAlgomones.put("Chansey", new Chansey());
		this.diccionarioDeAlgomones.put("Jigglypuff", new Jigglypuff());
		this.diccionarioDeAlgomones.put("Rattata", new Rattata());
		this.diccionarioDeAlgomones.put("Squirtle", new Squirtle());
	}

	public void agregarEntrenador(String nombreEntrenador) {
		if (entrenador1 == null) {
			entrenador1 = new Entrenador(nombreEntrenador);
		} else {
			entrenador2 = new Entrenador(nombreEntrenador);
		}
		this.entrenadorActivo = entrenador1;

	}

	public void agregarCharmanderAentrenador(Entrenador entrenador) {
		entrenador.agregarAlgomon(new Charmander());

	}

	public void agregarBulbasaurAentrenador(Entrenador entrenador) {
		entrenador.agregarAlgomon(new Bulbasaur());

	}

	public void agregarChanseyAentrenador(Entrenador entrenador) {
		entrenador.agregarAlgomon(new Chansey());

	}

	public void agregarJigglypuffAentrenador(Entrenador entrenador) {
		entrenador.agregarAlgomon(new Jigglypuff());

	}

	public void agregarRattataAentrenador(Entrenador entrenador) {
		entrenador.agregarAlgomon(new Rattata());

	}

	public void agregarSquirtleAentrenador(Entrenador entrenador) {
		entrenador.agregarAlgomon(new Squirtle());

	}

	public Entrenador getEntrenador1() {
		return entrenador1;
	}

	public void setEntrenador1(Entrenador entrenador1) {
		this.entrenador1 = entrenador1;
	}

	public Entrenador getEntrenador2() {
		return entrenador2;
	}

	public void setEntrenador2(Entrenador entrenador2) {
		this.entrenador2 = entrenador2;
	}

	public void iniciarJuego() {
		this.entrenadorActivo = this.entrenador1;
	}

	public Entrenador getEntrenadorActivo() {
		return entrenadorActivo;
	}

	public String obtenerNombreJugadorActivo() {
		return this.entrenadorActivo.getNombre();
	}

	public String obtenerNombreAlgomonActivo() {
		return this.entrenadorActivo.obtenerNombreAlgomonActivo();
	}

	public List<Algomon> obtenerAlgomonesDisponiblesDelJugadorActivo() {
		return this.entrenadorActivo.getAlgomones();
	}

	public void cambiarAlgomonActivo(int numeroAlgomonSeleccionado) {
		this.entrenadorActivo.cambiarAlgomonActivo(numeroAlgomonSeleccionado);

	}

	public void cambiarJugador() {
		if (entrenadorActivo.equals(entrenador1)) {
			entrenadorActivo = entrenador2;
		} else {
			entrenadorActivo = entrenador1;
		}

	}

	public List<Ataque> obtenerAtaquesDeAlgomonActivo() {
		return this.entrenadorActivo.obtenerAtaquesDeAlgomonActivo();
	}

	public void atacar(Ataque ataque) {
		if (this.entrenadorActivo.equals(this.entrenador1)) {
			this.entrenadorActivo.obtenerAlgomonActivo().atacar(this.entrenador2.obtenerAlgomonActivo(),
					ataque.getClass());
		} else {
			this.entrenadorActivo.obtenerAlgomonActivo().atacar(this.entrenador1.obtenerAlgomonActivo(),
					ataque.getClass());
		}

	}

	public Boolean elJuegoEstaFinalizado() {		
		Entrenador entrenadorAValidarAlgomones;
		if (this.entrenadorActivo.equals(this.entrenador1)) {
			entrenadorAValidarAlgomones = this.entrenador2;
		} else {
			entrenadorAValidarAlgomones = this.entrenador1;
		}

		return !entrenadorAValidarAlgomones.tieneAlgomonesVivos();
	}

	public void enviarElemento(Elemento elemento) {
		this.entrenadorActivo.obtenerAlgomonActivo().recibirElemento(elemento);
		this.entrenadorActivo.descontarElemento(elemento);

	}

	public List<Algomon> obtenerTodosLosAlgomones() {
		List<Algomon> algomones = new ArrayList<Algomon>();
		algomones.add(new Bulbasaur());
		algomones.add(new Chansey());
		algomones.add(new Charmander());
		algomones.add(new Jigglypuff());
		algomones.add(new Rattata());
		algomones.add(new Squirtle());
		return algomones;
	}

	public void agregarAlgomonAEntrenador(String nombreAlgomon, Entrenador entrenador)
			throws CloneNotSupportedException {
		;
		entrenador.agregarAlgomon(this.diccionarioDeAlgomones.get(nombreAlgomon).clone());
	}

	public Ataque obetenerAtaque(String nombreAtaque) {
		Ataque ataqueEncontrado = null;
		for (Ataque ataque : obtenerAtaquesDeAlgomonActivo()) {
			if (ataque.getClass().getSimpleName().equals(nombreAtaque)) {
				ataqueEncontrado = ataque;
			}
		}
		return ataqueEncontrado;
	}

	public Elemento obtenerElemento(String nombreElemento) {
		Elemento elementoEncontrado = null;
		for (Elemento elemento : this.entrenadorActivo.obtenerElementosDisponibles()) {
			if (elemento.getClass().getSimpleName().equals(nombreElemento)) {
				elementoEncontrado = elemento;
			}
		}
		return elementoEncontrado;
	}

	public String obtenerEstadoAlgomonActivo() {		
		return this.entrenadorActivo.obtenerAlgomonActivo().obtenerDescripcionDeEstado();
	}

	public void cambiarAlgomonActivo(String algomonSeleccionado) {		
		this.entrenadorActivo.cambiarAlgomonActivo(algomonSeleccionado);		
	}

}
