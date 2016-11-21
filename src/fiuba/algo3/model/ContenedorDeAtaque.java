package fiuba.algo3.model;

import java.util.Stack;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.algomon.Algomon;
import fiuba.algo3.model.estado.EstadoAlgomon;

public class ContenedorDeAtaque {
	Stack<Ataque> ataques ;
	//Ataque ataque;
	//int ataquesDisponibles;
	
	//ESte metodo hay que sacarlo
	//public ContenedorDeAtaque(Ataque ataque, int ataquesDisponibles) {
	//	this.ataque = ataque;
	//	this.ataquesDisponibles = ataquesDisponibles;
	//}
	
	public ContenedorDeAtaque(Stack<Ataque> ataquesACargar){
		ataques = ataquesACargar;
		
	}
	
	
	public void lanzarAtaque(Algomon algomonAtacante, Algomon algomonAtacado,EstadoAlgomon estadoAlgomon) {
		
		Ataque ataque = ataques.pop();
		ataque.cargarAtacado(algomonAtacado);	
		ataque.cargarAlgomonQueRealizaLaAccion(algomonAtacante);
		algomonAtacante.getEstadoAlgomon().realizarAccion(ataque); 
		//this.ataquesDisponibles--;
	}
	
	public Boolean sosDeAtaque(Class tipoAtaque){
		Ataque ataque = ataques.peek();
		return tipoAtaque.equals(ataque.getClass());
	}

	//SOLO TE FALTA ARREGLAR ESTE METODO
	public void aumentarCantidad(int cantidadAAumentar) {
		Ataque ataque = ataques.peek();
		for (int i=0 ; i< cantidadAAumentar ; i++ ){
			ataques.push(ataque);
		}	
	}

	public int getAtaquesDisponibles() {
		return ataques.size();
	}
	
	public Ataque obtenerAtaque(){
		return  ataques.peek();
	}
	
	
}
