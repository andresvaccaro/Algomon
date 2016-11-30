package fiuba.algo3.modelo.accion.elemento;

import fiuba.algo3.modelo.accion.Accion;

public abstract class Elemento extends Accion {
	
	private String nombre = this.getClass().getSimpleName();

	@Override
	public abstract void realizarAccion();

	@Override
	public boolean puedeRealizarlaDormido() {
		return Boolean.TRUE;
	}

	public String getNombre() {
		return nombre;
	}
	

	
}
