package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.accion.elemento.Pocion;
import fiuba.algo3.modelo.accion.elemento.Restaurador;
import fiuba.algo3.modelo.accion.elemento.SuperPocion;
import fiuba.algo3.modelo.accion.elemento.Vitamina;
import fiuba.algo3.modelo.algomon.Algomon;

public class Entrenador {

	private static final int CANTIDAD_DE_POCIONES = 2;

	private static final int CANTIDAD_DE_SUPER_POCIONES = 2;

	private static final int CANTIDAD_VITAMINAS = 4;

	private static final int CANTIDAD_RESTAURADORES =2;

	private String nombre;
	
	private List<Algomon> algomones;
	
	private Algomon algomonActivo;
	
	private HashMap<String, List<Elemento>> cotenedorDeElementos;

	public Entrenador(String nombre) {
		super();
		this.nombre = nombre;
		algomones = new  ArrayList<Algomon>();
		this.cotenedorDeElementos = new HashMap<String, List<Elemento>>();
		cargarElementos();
	}

	private void cargarElementos() {
		cargarPociones(this.cotenedorDeElementos);
		cargarSuperpociones(this.cotenedorDeElementos);
		cargarVitamina(this.cotenedorDeElementos);
		cargarRestaurador(this.cotenedorDeElementos);		
	}

	private void cargarRestaurador(HashMap<String, List<Elemento>> cotenedorDeElementos2) {
		List<Elemento> restauradores = new ArrayList<Elemento>();
		for (int i = 0; i < CANTIDAD_RESTAURADORES; i++) {
			Restaurador restaurador = new Restaurador();
			restauradores.add(restaurador);
		}
		cotenedorDeElementos.put(Restaurador.class.getSimpleName(), restauradores);

		
	}

	private void cargarVitamina(HashMap<String, List<Elemento>> cotenedorDeElementos2) {
		List<Elemento> vitaminas = new ArrayList<Elemento>();
		for (int i = 0; i < CANTIDAD_VITAMINAS; i++) {
			Vitamina vitamina = new Vitamina();
			vitaminas.add(vitamina);
		}
		cotenedorDeElementos.put(Vitamina.class.getSimpleName(), vitaminas);
		
	}

	private void cargarSuperpociones(HashMap<String, List<Elemento>> cotenedorDeElementos2) {
		List<Elemento> superPociones = new ArrayList<Elemento>();
		for (int i = 0; i < CANTIDAD_DE_SUPER_POCIONES; i++) {
			SuperPocion superPocion = new SuperPocion();
			superPociones.add(superPocion);
		}
		cotenedorDeElementos.put(SuperPocion.class.getSimpleName(), superPociones);
		
	}

	private void cargarPociones(HashMap<String, List<Elemento>> cotenedorDeElementos) {
		List<Elemento> pociones = new ArrayList<Elemento>();
		for (int i = 0; i < CANTIDAD_DE_POCIONES; i++) {
			Pocion pocion = new Pocion();
			pociones.add(pocion);
		}
		cotenedorDeElementos.put(Pocion.class.getSimpleName(), pociones);
	}

	public void agregarAlgomon(Algomon algomon) {
		this.algomones.add(algomon);
		if(this.algomonActivo==null){
			this.algomonActivo= algomon;
		}		
	}

	public String getNombre() {
		return nombre;
	}

	public String obtenerNombreAlgomonActivo() {
		return this.algomonActivo.getNombre();
	}

	public List<Algomon> getAlgomones() {
		return algomones;
	}

	public void cambiarAlgomonActivo(int numeroAlgomonSeleccionado) {
		if(numeroAlgomonSeleccionado-1<=this.algomones.size()-1){
			this.algomonActivo = this.algomones.get(numeroAlgomonSeleccionado-1);	
		}
				
	}

	public List<Ataque> obtenerAtaquesDeAlgomonActivo() {
	return this.algomonActivo.obtenerAtaquesDisponibles();
	}

	public Algomon obtenerAlgomonActivo() {
		return this.algomonActivo;		
	}

	public Boolean tieneAlgomonesVivos() {
		Boolean tieneTodosVivos= Boolean.TRUE;		
		for (Algomon algomon : algomones) {
			if(algomon.getPuntosDeVida()<=0){
				tieneTodosVivos= Boolean.FALSE;
			}
		}
		
		return tieneTodosVivos;
	}
	
	public List<Elemento> obtenerElementosDisponibles(){
		List<Elemento> elementos=new ArrayList<Elemento>();
		if (!this.cotenedorDeElementos.get("Pocion").isEmpty()){
			elementos.add(this.cotenedorDeElementos.get("Pocion").get(0));
		}
		if (!this.cotenedorDeElementos.get("SuperPocion").isEmpty()){
			elementos.add(this.cotenedorDeElementos.get("SuperPocion").get(0));
		}
		if (!this.cotenedorDeElementos.get("Vitamina").isEmpty()){
			elementos.add(this.cotenedorDeElementos.get("Vitamina").get(0));
		}
		if (!this.cotenedorDeElementos.get("Restaurador").isEmpty()){
			elementos.add(this.cotenedorDeElementos.get("Restaurador").get(0));
		}
		return elementos;
	}

	public List<Algomon> obtenerAlgomonesNoActivos() {
		List<Algomon> algomonesNoActivos= new ArrayList<Algomon>();
		
		for (Algomon algomon : this.algomones) {
			if(!algomon.equals(this.algomonActivo)){
				algomonesNoActivos.add(algomon);
			}
		}
		return algomonesNoActivos;
	}

	public void descontarElemento(Elemento elemento) {
		List<Elemento> elementos=this.cotenedorDeElementos.get(elemento.getNombre());
		elementos.remove(elementos.size()-1);
		
	}

	public int obtenerCantidadDeElementosDisponibles(String nombreElemento) {
		int cantidad=0;
		if(this.cotenedorDeElementos.get(nombreElemento)!=null){
			cantidad = this.cotenedorDeElementos.get(nombreElemento).size();
		}
		return cantidad;		
	}

	public void cambiarAlgomonActivo(String algomonSeleccionado) {
		for (Algomon algomon : algomones) {
			if(algomon.getNombre().equals(algomonSeleccionado)){
				algomonActivo= algomon;
			}
		}
		
	}

	public Boolean tieneMasAccionesParaRealizar() {		
		return tieneAtaquesDisponibles() || tieneElementosDisponibles();
	}

	private Boolean tieneElementosDisponibles() {
		Boolean elementosDisponibles = Boolean.FALSE;
		if(this.obtenerElementosDisponibles().size()<=0){
			elementosDisponibles = Boolean.FALSE;
		}
		return elementosDisponibles;
	}

	private Boolean tieneAtaquesDisponibles() {
		Boolean tieneAtaquesDisponibles = Boolean.FALSE;
		for (Algomon algomon : algomones) {
			if(algomon.tieneAtaquesDisponibles()){
				tieneAtaquesDisponibles = Boolean.TRUE;
			}
		}
		return tieneAtaquesDisponibles;
	}

	
	
	
	
}
