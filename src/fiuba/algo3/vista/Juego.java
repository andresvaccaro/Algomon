package fiuba.algo3.vista;

import java.util.HashMap;
import java.util.List;

import fiuba.algo3.model.Algomon;
import fiuba.algo3.model.Ataque;
import fiuba.algo3.model.Bulbasaur;
import fiuba.algo3.model.Chansey;
import fiuba.algo3.model.Charmander;
import fiuba.algo3.model.Entrenador;
import fiuba.algo3.model.Jigglypuff;
import fiuba.algo3.model.Rattata;
import fiuba.algo3.model.Squirtle;

public class Juego {

	private HashMap<String, Class> diccionarioDeAlgomones;
	
	private Entrenador entrenador1;
	
	private Entrenador entrenador2;
	
	private Entrenador entrenadorActivo;

	public Juego() {
		super();
		this.diccionarioDeAlgomones = new HashMap<>();
		this.diccionarioDeAlgomones.put("Charmander", Charmander.class);
		this.diccionarioDeAlgomones.put("Bulbasaur", Bulbasaur.class);
		this.diccionarioDeAlgomones.put("Chansey", Chansey.class);
		this.diccionarioDeAlgomones.put("Jigglypuff", Jigglypuff.class);		
		this.diccionarioDeAlgomones.put("Rattata", Rattata.class);
		this.diccionarioDeAlgomones.put("Squirtle", Squirtle.class);
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
		this.entrenadorActivo= this.entrenador1;		
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
		if(entrenadorActivo.equals(entrenador1)){
			entrenadorActivo= entrenador2;
		}else{
			entrenadorActivo= entrenador1;
		}
		
	}

	public List<Ataque> obtenerAtaquesDeAlgomonActivo() {
		return this.entrenadorActivo.obtenerAtaquesDeAlgomonActivo();
	}

	public void atacar(Ataque ataque) {		
		if(this.entrenadorActivo.equals(this.entrenador1)){
			this.entrenadorActivo.obtenerAlgomonActivo().atacar(this.entrenador2.obtenerAlgomonActivo(), ataque.getClass());	
		}else{
			this.entrenadorActivo.obtenerAlgomonActivo().atacar(this.entrenador1.obtenerAlgomonActivo(), ataque.getClass());
		}
		
	}

	public Boolean elJuegoEstaFinalizado() {
		Boolean estaTerminado= Boolean.FALSE;
		Entrenador entrenadorAValidarAlgomones;
		if(this.entrenadorActivo.equals(this.entrenador1)){
			entrenadorAValidarAlgomones = this.entrenador2;
		}else{
			entrenadorAValidarAlgomones = this.entrenador1;
		}		
		
		return entrenadorAValidarAlgomones.tieneAlgomonesVivos();
	}

	
	

	
	

	
	
	
	
}
