package fiuba.algo3.model;

public class Squirtle extends AlgomonAgua {
	private final static double PUNTOS_DE_VIDA_INICIAL=150d;
	
	public Squirtle() {
		super();
		this.puntosDeVida = 150d;
		
		Burbuja burbuja = new Burbuja();		
		ContenedorDeAtaque contenedorDeAtaqueBurbuja= new ContenedorDeAtaque(burbuja,Burbuja.CANTIDAD_ATAQUES_BURBUJA);
		this.contenedoresDeAtaques.add(contenedorDeAtaqueBurbuja);
		
		CanionDeAgua canionDeAgua = new CanionDeAgua();		
		ContenedorDeAtaque contenedorDeCanionDeAgua= new ContenedorDeAtaque(canionDeAgua,CanionDeAgua.CANTIDAD_ATAQUES_CANION_DE_AGUA);
		this.contenedoresDeAtaques.add(contenedorDeCanionDeAgua);
		
	}

	@Override
	protected double obtenerPuntosDeVidaInicial() {
		return PUNTOS_DE_VIDA_INICIAL;
	}

	
	
}
