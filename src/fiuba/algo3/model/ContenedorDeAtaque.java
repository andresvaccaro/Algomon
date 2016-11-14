package fiuba.algo3.model;

public class ContenedorDeAtaque {
	Ataque ataque;
	int ataquesDisponibles;
	
	public ContenedorDeAtaque(Ataque ataque, int cantidadAtaquesBurbuja) {
		this.ataque = ataque;
	}

	public void lanzarAtaque(Algomon algomonAtacante, Algomon algomonAtacado,EstadoAlgomon estadoAlgomon) {
		estadoAlgomon.aplicarAtaque(ataque,algomonAtacante,algomonAtacado);
//		ataque.causarEfecto(algomonAtacante, algomonAtacado);
	}
	
	public Boolean sosDeAtaque(Class tipoAtaque){
		return tipoAtaque.equals(this.ataque.getClass());
	}
	
	
}
