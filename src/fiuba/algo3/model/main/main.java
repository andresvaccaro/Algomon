package fiuba.algo3.model.main;

import java.util.Scanner;

import fiuba.algo3.model.Algomon;
import fiuba.algo3.model.Ataque;
import fiuba.algo3.model.Entrenador;
import fiuba.algo3.vista.Juego;

public class main {

	
	private static Scanner entradaEscaner = new Scanner (System.in);
	private static Scanner entradaEscaner2 = new Scanner (System.in);
	private static Juego juego;
	
	public static void main(String[] args) {	
		nuevoJuego();
	}

	private static void nuevoJuego(){
		juego = new Juego();
		System.out.println("Ingrese nombre de entrenador 1 ");				
		String nombreEntrenador1 = entradaEscaner.nextLine();
		Entrenador entrenador1 = new Entrenador(nombreEntrenador1);		
        seleccionarAlgomones(entrenador1);
        juego.setEntrenador1(entrenador1);    
        System.out.flush();
        System.out.println("Ingrese nombre de entrenador 2 ");				
		String nombreEntrenador2 = entradaEscaner2.nextLine();
		Entrenador entrenador2 = new Entrenador(nombreEntrenador2);
		seleccionarAlgomones(entrenador2);
		juego.setEntrenador2(entrenador2);
		System.out.flush();
		iniciarPartida();
	}

	
	
	private static void iniciarPartida() {
		Boolean juegoTerminado= Boolean.FALSE;
		juego.iniciarJuego();
		while(!juegoTerminado){
			System.out.println(juego.obtenerNombreJugadorActivo());
			System.out.println(juego.obtenerNombreAlgomonActivo());
			System.out.println("Seleccione su proximaAccion");
			System.out.println("1- Cambiar Algomon activo");
			System.out.println("2- Atacar ");
			System.out.println("3- Enviar Elemento ");
			Scanner lecturaAccion = new Scanner (System.in);
			int tipoDeAccion = lecturaAccion.nextInt();
			switch (tipoDeAccion) {
			case 1:
				opcionesParaCambiarElAlgomon();			
				break;
			case 2:
				opcionesParaAtacarAOtroAlgomon();
				juegoTerminado=juego.elJuegoEstaFinalizado();
				juego.cambiarJugador();
				break;
			case 3:
//				opcionesParaEnviarElemento();
				juego.cambiarJugador();
				juegoTerminado=juego.elJuegoEstaFinalizado();
				break;
			default:
				
				break;
			}
			
		}
								
	}

	private static void opcionesParaAtacarAOtroAlgomon() {			
		System.out.println("Seleccione el ataque que desea realizar:");
		int numeradorDeAtaques=1;
		for (Ataque ataque : juego.obtenerAtaquesDeAlgomonActivo()) {
			System.out.println(numeradorDeAtaques + ataque.getClass().getName() );
		}
		Scanner lecturaAtaque = new Scanner (System.in);
		int ataqueSeleccionado = lecturaAtaque.nextInt();		
		juego.atacar(juego.obtenerAtaquesDeAlgomonActivo().get(ataqueSeleccionado-1));				
	}

	private static void opcionesParaCambiarElAlgomon() {
		System.out.println("El Algomon activo es ");
		System.out.println(juego.obtenerNombreAlgomonActivo());
		
		System.out.println("Seleccione un algomon por el cual quiera cambiar a su algomon activo");
		int numeroDeAlgomon=1;
		for (Algomon algomon : juego.obtenerAlgomonesDisponiblesDelJugadorActivo()) {
			System.out.println(numeroDeAlgomon + algomon.getNombre());
			numeroDeAlgomon++;
		}
		Scanner lectorDeAlgomon = new Scanner (System.in);
		int numeroAlgomonSeleccionado= lectorDeAlgomon.nextInt();
		juego.cambiarAlgomonActivo(numeroAlgomonSeleccionado);
		
	}

	private static void seleccionarAlgomones(Entrenador entrenador) {
		int cantidadDeAlgomonesASeleccionar= 3;
		
		while(cantidadDeAlgomonesASeleccionar>0){
			System.out.println("Seleccione un algomon");
			System.out.println("1- Charmander");
			System.out.println("2- Bulbasaur");
			System.out.println("3- Chansey");
			System.out.println("4- Jigglypuff");		
			System.out.println("5- Rattata");
			System.out.println("6- Squirtle");
			int algomonSeleccionado = entradaEscaner.nextInt();
			switch (algomonSeleccionado) {
			case 1:
				juego.agregarCharmanderAentrenador(entrenador);	
				break;
			case 2:
				juego.agregarBulbasaurAentrenador(entrenador);
				break;
			case 3:				
				juego.agregarChanseyAentrenador(entrenador);
				break;
			case 4:				
				juego.agregarJigglypuffAentrenador(entrenador);
				break;
			case 5:				
				juego.agregarRattataAentrenador(entrenador);
				break;
			case 6:				
				juego.agregarSquirtleAentrenador(entrenador);
				break;
			default:
				break;
			}
			cantidadDeAlgomonesASeleccionar--;			
		}
		
	}
	
}
