package fiuba.algo3.vista;

import fiuba.algo3.MainAlgomon;
import fiuba.algo3.model.algomon.Algomon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;

public class JuegoController {

	@FXML
	private MenuButton menuJugador1;

	private MainAlgomon mainAlgomon;
	
	private Juego juego;
	
	private ObservableList<Algomon> algomonesSeleccionables = FXCollections.observableArrayList();
	
	@FXML
	private ComboBox<Algomon> algomonesParaSeleccionar ;
	
	@FXML
	private ComboBox<String> cbx;
	private ObservableList<String> items = FXCollections.observableArrayList("1","2");	
	
	@FXML
	private void initialize() {	
		juego = new Juego();
		cbx.setItems(items);
		
		
	}

	private void cargarListaDeAlgomonesDisponibles() {			
//		for (Algomon algomon : juego.obtenerTodosLosAlgomones()) {
//			algomonesSeleccionables.add(algomon);
//		}
//		algomonesParaSeleccionar = new ComboBox<>(this.algomonesSeleccionables);		

		ObservableList<String> items = FXCollections.observableArrayList();
		items.addAll("item-1", "item-2", "item-3", "item-4", "item-5");
		cbx= new ComboBox<String>(items);


	}

	public MainAlgomon getMainAlgomon() {
		return mainAlgomon;
	}

	public void setMainAlgomon(MainAlgomon mainAlgomon) {
		this.mainAlgomon = mainAlgomon;
	}

	public MenuButton getMenuJugador1() {
		return menuJugador1;
	}

	public void setMenuJugador1(MenuButton menuJugador1) {
		this.menuJugador1 = menuJugador1;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public ObservableList<Algomon> getAlgomonesSeleccionables() {
		return algomonesSeleccionables;
	}

	public void setAlgomonesSeleccionables(ObservableList<Algomon> algomonesSeleccionables) {
		this.algomonesSeleccionables = algomonesSeleccionables;
	}

	public ComboBox<Algomon> getAlgomonesParaSeleccionar() {
		return algomonesParaSeleccionar;
	}

	public void setAlgomonesParaSeleccionar(ComboBox<Algomon> algomonesParaSeleccionar) {
		this.algomonesParaSeleccionar = algomonesParaSeleccionar;
	}

	public ComboBox<String> getCbx() {
		return cbx;
	}

	public void setCbx(ComboBox<String> cbx) {
		this.cbx = cbx;
	}

	
	

	
}

