package fiuba.algo3.model.estado;

import fiuba.algo3.model.accion.Accion;

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

	public void realizarAccion(Accion accion) {
		estadoEsfimero.realizarAccion(accion);
		estadoPersistente.realizarAccion(accion);
	}
	
	
	public void despertar() {
		this.setEstadoEsfimero(new EstadoNormalEsfimero());	
	}
	
	public void dormir() {
		this.setEstadoEsfimero(new EstadoDormido());		
	}
	
	public Boolean estaDormido() {
		return this.estadoEsfimero.estaDormido();
	}
	
	public void quemar() {
		this.setEstadoPersistente(new EstadoQuemado());		
	}
	public Boolean estaQuemado() {
		return this.estadoPersistente.estaQuemado();
	}
	public void enfriar() {
		this.setEstadoPersistente(new EstadoNormalPersistente());		
	}
	
	
		
	
}
