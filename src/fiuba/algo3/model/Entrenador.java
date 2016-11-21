package fiuba.algo3.model;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.algomon.Algomon;

public class Entrenador {

	private String nombre;
	
	private List<Algomon> algomones;
	
	private Algomon algomonActivo;
	

	public Entrenador(String nombre) {
		super();
		this.nombre = nombre;
		algomones = new  ArrayList<Algomon>();
	}

	public void agregarAlgomon(Algomon algomon) {
		this.algomones.add(algomon);
		if(this.algomonActivo==null){
			this.algomonActivo= algomon;
		}		
	}

	public String getNombre() {
		return nombre;
	}

	public String obtenerNombreAlgomonActivo() {
		return this.algomonActivo.getNombre();
	}

	public List<Algomon> getAlgomones() {
		return algomones;
	}

	public void cambiarAlgomonActivo(int numeroAlgomonSeleccionado) {
		if(numeroAlgomonSeleccionado-1<=this.algomones.size()-1){
			this.algomonActivo = this.algomones.get(numeroAlgomonSeleccionado-1);	
		}
				
	}

	public List<Ataque> obtenerAtaquesDeAlgomonActivo() {
	return this.algomonActivo.obtenerAtaquesDisponibles();
	}

	public Algomon obtenerAlgomonActivo() {
		return this.algomonActivo;		
	}

	public Ataque obtenerAtaqueDePosicion(int i) {		
		return null;
	}

	public Boolean tieneAlgomonesVivos() {
		Boolean tieneTodosVivos= Boolean.TRUE;		
		for (Algomon algomon : algomones) {
			if(algomon.getPuntosDeVida()<=0){
				tieneTodosVivos= Boolean.FALSE;
			}
		}
		
		return tieneTodosVivos;
	}
	
	
	
	
}
