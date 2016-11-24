package fiuba.algo3.model;

import java.util.Stack;

import fiuba.algo3.model.accion.ataque.Ataque;
import fiuba.algo3.model.algomon.Algomon;

public class ContenedorDeAtaque {
	Stack<Ataque> ataques ;
	
	public ContenedorDeAtaque(Stack<Ataque> ataquesACargar){
		
		ataques = ataquesACargar;
		
	}
	
	
	public void lanzarAtaque(Algomon algomonAtacante, Algomon algomonAtacado) {
		
		Ataque ataque = ataques.pop();
		
		ataque.cargarAtacado(algomonAtacado);
		
		ataque.cargarAlgomonQueRealizaLaAccion(algomonAtacante);
		
		algomonAtacante.getEstadoAlgomon().realizarAccion(ataque);
		
	}
	
	
	public Boolean sosDeAtaque(Class tipoAtaque){
		
		Ataque ataque = ataques.peek();
		
		return tipoAtaque.equals(ataque.getClass());
		
	}

	public void aumentarCantidad(int cantidadAAumentar) {
		
	   Ataque ataque = ataques.peek();
		
		for (int i=0 ; i< cantidadAAumentar ; i++ ){
			
			ataques.push( ataque );
		}	
	}
	
	

	public int getCantidadAtaquesDisponibles() {
		
		return ataques.size();
	}
	
	
	public Ataque obtenerAtaque(){
		
		return  ataques.peek();
	}
	
	
}
