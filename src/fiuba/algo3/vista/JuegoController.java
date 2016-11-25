package fiuba.algo3.vista;

import fiuba.algo3.MainAlgomon;
import fiuba.algo3.model.algomon.Algomon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class JuegoController {

	@FXML
	private MenuButton menuJugador1;

	private MainAlgomon mainAlgomon;

	private Juego juego;

	private ObservableList<Algomon> algomonesSeleccionables = FXCollections.observableArrayList();

	@FXML
	private ComboBox<Algomon> algomonesParaSeleccionar;

	@FXML
	private ComboBox<String> comboAlgomonesEntrenador1;
	@FXML
	private ComboBox<String> comboAlgomonesEntrenador2;
	@FXML
	private ObservableList<String> items = FXCollections.observableArrayList();
	@FXML
	private TableView tablaAlgomonesAgregadosEntrenador1 = new TableView();

	@FXML
	private TableView tablaAlgomonesAgregadosEntrenador2 = new TableView();

	ObservableList<Algomon> datosTablaAlgomonesEntrenador1 = FXCollections.observableArrayList();
	ObservableList<Algomon> datosTablaAlgomonesEntrenador2 = FXCollections.observableArrayList();

	@FXML
	private void initialize() {
		juego = new Juego();

		juego.agregarEntrenador("Oscar");
		juego.agregarEntrenador("Fabian");
		for (Algomon algomon : juego.obtenerTodosLosAlgomones()) {
			items.add(algomon.getNombre());
		}
		comboAlgomonesEntrenador1.setItems(items);
		comboAlgomonesEntrenador2.setItems(items);
		generarTablas();
	}

	private void generarTablas() {
		TableColumn<Algomon, String> nombre = new TableColumn<>("Nombre");
		nombre.setCellValueFactory(new PropertyValueFactory<Algomon, String>("nombre"));
		TableColumn<Algomon, String> vida = new TableColumn<>("Vida");
		vida.setCellValueFactory(new PropertyValueFactory<Algomon, String>("puntosDeVida"));
		tablaAlgomonesAgregadosEntrenador1.getColumns().addAll(nombre, vida);
		
		TableColumn<Algomon, String> nombreTablaEntrenador2 = new TableColumn<>("Nombre");
		nombreTablaEntrenador2.setCellValueFactory(new PropertyValueFactory<Algomon, String>("nombre"));
		TableColumn<Algomon, String> vidaTablaEntrenador2 = new TableColumn<>("Vida");
		vidaTablaEntrenador2.setCellValueFactory(new PropertyValueFactory<Algomon, String>("puntosDeVida"));
		tablaAlgomonesAgregadosEntrenador2.getColumns().addAll(nombreTablaEntrenador2, vidaTablaEntrenador2);

	}

	@FXML
	private void agregarAlgomonEntrenador1() {
		int algomonSeleccionadoIndex = this.comboAlgomonesEntrenador1.getSelectionModel().getSelectedIndex();
		this.items.get(algomonSeleccionadoIndex);
		try {
			juego.agregarAlgomonAEntrenador(this.items.get(algomonSeleccionadoIndex), juego.getEntrenador1());
			this.datosTablaAlgomonesEntrenador1.clear();
			for (Algomon algomon : juego.getEntrenador1().getAlgomones()) {
				this.datosTablaAlgomonesEntrenador1.add(algomon);
			}
			this.tablaAlgomonesAgregadosEntrenador1.setItems(this.datosTablaAlgomonesEntrenador1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void agregarAlgomonEntrenador2() {
		int algomonSeleccionadoIndex = this.comboAlgomonesEntrenador2.getSelectionModel().getSelectedIndex();
		this.items.get(algomonSeleccionadoIndex);
		try {
			juego.agregarAlgomonAEntrenador(this.items.get(algomonSeleccionadoIndex), juego.getEntrenador2());
			this.datosTablaAlgomonesEntrenador2.clear();
			for (Algomon algomon : juego.getEntrenador2().getAlgomones()) {
				this.datosTablaAlgomonesEntrenador2.add(algomon);
			}
			this.tablaAlgomonesAgregadosEntrenador2.setItems(this.datosTablaAlgomonesEntrenador2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
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

	public ComboBox<String> getComboAlgomonesEntrenador1() {
		return comboAlgomonesEntrenador1;
	}

	public void setComboAlgomonesEntrenador1(ComboBox<String> comboAlgomonesEntrenador1) {
		this.comboAlgomonesEntrenador1 = comboAlgomonesEntrenador1;
	}

	public ComboBox<String> getComboAlgomonesEntrenador2() {
		return comboAlgomonesEntrenador2;
	}

	public void setComboAlgomonesEntrenador2(ComboBox<String> comboAlgomonesEntrenador2) {
		this.comboAlgomonesEntrenador2 = comboAlgomonesEntrenador2;
	}

	public ObservableList<String> getItems() {
		return items;
	}

	public void setItems(ObservableList<String> items) {
		this.items = items;
	}

}
