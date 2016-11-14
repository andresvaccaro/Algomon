package fiuba.algo3.model;

public class EstadoDormido implements IEstadoEsfimero {

	private int cantidadDeAccionesPendientes;
	
	
	
	public EstadoDormido() {
		super();
		this.cantidadDeAccionesPendientes=3;
	}



	@Override
	public void atacar(Ataque ataque, Algomon algomonAtacado,Algomon algomonAtacante) {		
		if(cantidadDeAccionesPendientes==1){
			algomonAtacante.despertar();
		}else{
			cantidadDeAccionesPendientes--;
		}
	}



	@Override
	public Boolean estaDormido() {	
		return Boolean.TRUE;
	}

	
}
