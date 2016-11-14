package fiuba.algo3.model;

public class EstadoAlgomon {

	private IEstadoEsfimero estadoEsfimero;
	private IEstadoPersistente estadoPersistente;
		
	public EstadoAlgomon() {
		super();
		this.estadoEsfimero = new EstadoNormalEsfimero();
		this.estadoPersistente = new EstadoNormalPersistente();
	}
	public IEstadoEsfimero getEstadoEsfimero() {
		return estadoEsfimero;
	}
	public void setEstadoEsfimero(IEstadoEsfimero estadoEsfimero) {
		this.estadoEsfimero = estadoEsfimero;
	}
	public IEstadoPersistente getEstadoPersistente() {
		return estadoPersistente;
	}
	public void setEstadoPersistente(IEstadoPersistente estadoPersistente) {
		this.estadoPersistente = estadoPersistente;
	}
	public void aplicarAtaque(Ataque ataque, Algomon algomonAtacante, Algomon algomonAtacado) {
		estadoEsfimero.atacar(ataque,algomonAtacado,algomonAtacante);
		estadoPersistente.realizarAccion(algomonAtacante);
	}
	public void despertar() {
		estadoEsfimero= new EstadoNormalEsfimero();	
	}
	
	public void dormir() {
		estadoEsfimero = new EstadoDormido();		
	}
	
	public Boolean estaDormido() {
		return this.estadoEsfimero.estaDormido();
	}
	
	
	
		
	
}
