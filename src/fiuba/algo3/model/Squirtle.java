package fiuba.algo3.model;

public class Squirtle extends AlgomonAgua {

	public Squirtle() {
		super();
		
		Burbuja burbuja = new Burbuja();		
		ContenedorDeAtaque contenedorDeAtaqueBurbuja= new ContenedorDeAtaque(burbuja,Burbuja.CANTIDAD_ATAQUES_BURBUJA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBurbuja);
		
		CanionDeAgua canionDeAgua = new CanionDeAgua();		
		ContenedorDeAtaque contenedorDeCanionDeAgua= new ContenedorDeAtaque(canionDeAgua,CanionDeAgua.CANTIDAD_ATAQUES_CANION_DE_AGUA);
		this.contenedoresDeAtaques.add(contenedorDeCanionDeAgua);
		
	}

	
	
}
