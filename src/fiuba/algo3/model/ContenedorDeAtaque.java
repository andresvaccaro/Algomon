package fiuba.algo3.model;

public class ContenedorDeAtaque {
	Ataque ataque;
	int ataquesDisponibles;
	
	public ContenedorDeAtaque(Ataque ataque, int ataquesDisponibles) {
		this.ataque = ataque;
		this.ataquesDisponibles = ataquesDisponibles;
	}

	public void lanzarAtaque(Algomon algomonAtacante, Algomon algomonAtacado,EstadoAlgomon estadoAlgomon) {
		ataque.cargarAtacado(algomonAtacado);	
		ataque.cargarAlgomonQueRealizaLaAccion(algomonAtacante);
		algomonAtacante.getEstadoAlgomon().realizarAccion(ataque); 
		this.ataquesDisponibles--;
	}
	
	public Boolean sosDeAtaque(Class tipoAtaque){
		return tipoAtaque.equals(this.ataque.getClass());
	}

	public void aumentarCantidad(int cantidadAAumentar) {
		this.ataquesDisponibles= this.ataquesDisponibles+cantidadAAumentar;
		
	}

	public int getAtaquesDisponibles() {
		return ataquesDisponibles;
	}
	
	
	
}
