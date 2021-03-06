package fiuba.algo3.controlador;

import java.io.File;

import fiuba.algo3.MainAlgomon;
import fiuba.algo3.modelo.Juego;
import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.elemento.Elemento;
import fiuba.algo3.modelo.algomon.Algomon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class JuegoControlador {

	private static final int REALIZAR_ATAQUE_ACCION_INDICE = 0;
	private static final int EVIAR_ELEMENTO_ACCION_INDICE = 1;
	private static final int CAMBIAR_ALGOMON_INDICE = 2;

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

	@FXML
	private TableView tablaElementosEntrenador1 = new TableView();
	@FXML
	private TableView tablaElementosEntrenador2 = new TableView();

	@FXML
	private Button botonAgregarAlgomonEntrenador1;

	@FXML
	private Button botonAgregarAlgomonEntrenador2;

	@FXML
	private Button botonIniciarJuego;

	@FXML
	private Pane panelDeJuego;

	@FXML
	private TextField txtEntrenadorActivo;

	@FXML
	private TextField txtAlgomonActivo;

	@FXML
	private TextField txtEstadoAlgomonActivo;

	@FXML
	private ComboBox<String> acciones;

	@FXML
	private ComboBox<String> cbxAtaquesDisponibles;
	@FXML
	private ComboBox<String> cbxElementosDisponibles;
	@FXML
	private ComboBox<String> cbxAlgomonesDisponibles;

	ObservableList<Algomon> datosTablaAlgomonesEntrenador1 = FXCollections.observableArrayList();
	ObservableList<Algomon> datosTablaAlgomonesEntrenador2 = FXCollections.observableArrayList();
	ObservableList<String> datosAtaques = FXCollections.observableArrayList();
	ObservableList<String> datosElementos = FXCollections.observableArrayList();
	ObservableList<String> datosAlgomones = FXCollections.observableArrayList();

	ObservableList<ElementoVista> datosElementosEntrenador1 = FXCollections.observableArrayList();
	ObservableList<ElementoVista> datosElementosEntrenador2 = FXCollections.observableArrayList();

	@FXML
	private ImageView imagenAlgomonAtacante;
	@FXML
	private ImageView imagenAlgomonAtacado;

	@FXML
	private TextField txtNombreEntrenador1;
	@FXML
	private TextField txtNombreEntrenador2;

	@FXML
	private void initialize() {
		juego = new Juego();

		juego.agregarEntrenador("Entrenador1");
		juego.agregarEntrenador("Entrenador2");
		juego.iniciarJuego();
		for (Algomon algomon : juego.obtenerTodosLosAlgomones()) {
			items.add(algomon.getNombre());
		}
		comboAlgomonesEntrenador1.setItems(items);
		comboAlgomonesEntrenador2.setItems(items);
		generarTablas();
		panelDeJuego.setVisible(false);
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

		TableColumn<ElementoVista, String> nombreColumnaElementoEntrenador1 = new TableColumn<>("Nombre");
		nombreColumnaElementoEntrenador1.setCellValueFactory(new PropertyValueFactory<ElementoVista, String>("nombre"));
		TableColumn<ElementoVista, String> cantidadDeElementosDisponibles1 = new TableColumn<>("Disponibles");
		cantidadDeElementosDisponibles1
				.setCellValueFactory(new PropertyValueFactory<ElementoVista, String>("cantidadDisponible"));
		this.tablaElementosEntrenador1.getColumns().addAll(nombreColumnaElementoEntrenador1,
				cantidadDeElementosDisponibles1);

		TableColumn<Elemento, String> nombreColumnaElementoEntrenador2 = new TableColumn<>("Nombre");
		nombreColumnaElementoEntrenador2.setCellValueFactory(new PropertyValueFactory<Elemento, String>("nombre"));
		TableColumn<ElementoVista, String> cantidadDeElementosDisponibles2 = new TableColumn<>("Disponibles");
		cantidadDeElementosDisponibles2
				.setCellValueFactory(new PropertyValueFactory<ElementoVista, String>("cantidadDisponible"));
		this.tablaElementosEntrenador2.getColumns().addAll(nombreColumnaElementoEntrenador2,
				cantidadDeElementosDisponibles2);
	}

	@FXML
	private void agregarAlgomonEntrenador1() {
		int algomonSeleccionadoIndex = this.comboAlgomonesEntrenador1.getSelectionModel().getSelectedIndex();

		try {
			if (algomonSeleccionadoIndex < 0) {
				Alert alertaAlgomonNoSeleccionado = new Alert(AlertType.ERROR);
				alertaAlgomonNoSeleccionado.setTitle("Error");
				alertaAlgomonNoSeleccionado.setHeaderText("Debe seleccionar un algomon");
				alertaAlgomonNoSeleccionado.showAndWait();
			} else {
				this.items.get(algomonSeleccionadoIndex);
				juego.agregarAlgomonAEntrenador(this.items.get(algomonSeleccionadoIndex), juego.getEntrenador1());
				this.datosTablaAlgomonesEntrenador1.clear();
				for (Algomon algomon : juego.getEntrenador1().getAlgomones()) {
					this.datosTablaAlgomonesEntrenador1.add(algomon);
				}
				this.tablaAlgomonesAgregadosEntrenador1.setItems(this.datosTablaAlgomonesEntrenador1);
			}

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void agregarAlgomonEntrenador2() {
		int algomonSeleccionadoIndex = this.comboAlgomonesEntrenador2.getSelectionModel().getSelectedIndex();
		try {
			if (algomonSeleccionadoIndex < 0) {
				Alert alertaAlgomonNoSeleccionado = new Alert(AlertType.ERROR);
				alertaAlgomonNoSeleccionado.setTitle("Error");
				alertaAlgomonNoSeleccionado.setHeaderText("Debe seleccionar un algomon");
				alertaAlgomonNoSeleccionado.showAndWait();
			} else {
				this.items.get(algomonSeleccionadoIndex);
				juego.agregarAlgomonAEntrenador(this.items.get(algomonSeleccionadoIndex), juego.getEntrenador2());
				this.datosTablaAlgomonesEntrenador2.clear();
				for (Algomon algomon : juego.getEntrenador2().getAlgomones()) {
					this.datosTablaAlgomonesEntrenador2.add(algomon);
				}
				this.tablaAlgomonesAgregadosEntrenador2.setItems(this.datosTablaAlgomonesEntrenador2);
			}

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void iniciarJuego() {
		if (this.datosTablaAlgomonesEntrenador1.isEmpty() || this.datosTablaAlgomonesEntrenador2.isEmpty()) {
			Alert alertaNoHaySuficientesAlgomones = new Alert(AlertType.ERROR);
			alertaNoHaySuficientesAlgomones.setTitle("Error");
			alertaNoHaySuficientesAlgomones.setHeaderText("Debe seleccionar Algomones");
			alertaNoHaySuficientesAlgomones.showAndWait();
		} else {
			this.botonAgregarAlgomonEntrenador1.setDisable(true);
			this.botonAgregarAlgomonEntrenador2.setDisable(true);
			this.comboAlgomonesEntrenador1.setDisable(true);
			this.comboAlgomonesEntrenador2.setDisable(true);
			this.panelDeJuego.setVisible(true);
			this.botonIniciarJuego.setDisable(true);
			this.txtEntrenadorActivo.setText(juego.obtenerNombreJugadorActivo());
			this.txtEstadoAlgomonActivo.setText(juego.obtenerEstadoAlgomonActivo());
			this.txtEstadoAlgomonActivo.setEditable(false);
			this.txtEntrenadorActivo.setEditable(false);
			this.txtAlgomonActivo.setText(juego.obtenerNombreAlgomonActivo());
			this.txtAlgomonActivo.setEditable(false);
			this.cbxAlgomonesDisponibles.setDisable(true);
			this.cbxAtaquesDisponibles.setDisable(true);
			this.cbxElementosDisponibles.setDisable(true);
			cargarElementosEntrenadores();
			cargarImagenAlgomones();
		}

	}

	private void cargarImagenAlgomones() {
		Image image = new Image(new File(this.juego.obtenerUrlImagenAtacante()).toURI().toString());
		imagenAlgomonAtacante.setImage(image);

		Image image2 = new Image(new File(this.juego.obtenerUrlImagenAtacado()).toURI().toString());
		imagenAlgomonAtacado.setImage(image2);

	}

	private void cargarElementosEntrenadores() {
		this.datosElementosEntrenador1.clear();
		for (Elemento elemento : juego.getEntrenador1().obtenerElementosDisponibles()) {
			ElementoVista elementoView = new ElementoVista();
			elementoView.setNombre(elemento.getNombre());
			elementoView.setCantidadDisponible(
					String.valueOf(juego.getEntrenador1().obtenerCantidadDeElementosDisponibles(elemento.getNombre())));
			this.datosElementosEntrenador1.add(elementoView);
		}
		this.tablaElementosEntrenador1.setItems(this.datosElementosEntrenador1);

		this.datosElementosEntrenador2.clear();
		for (Elemento elemento : juego.getEntrenador2().obtenerElementosDisponibles()) {
			ElementoVista elementoView = new ElementoVista();
			elementoView.setNombre(elemento.getNombre());
			elementoView.setCantidadDisponible(
					String.valueOf(juego.getEntrenador2().obtenerCantidadDeElementosDisponibles(elemento.getNombre())));
			this.datosElementosEntrenador2.add(elementoView);
		}
		this.tablaElementosEntrenador2.setItems(this.datosElementosEntrenador2);
	}

	@FXML
	private void habilitarAccion() {
		int accionSeleccionadaIndex = this.acciones.getSelectionModel().getSelectedIndex();
		if (accionSeleccionadaIndex == REALIZAR_ATAQUE_ACCION_INDICE) {
			if(juego.entrenadorActivoTieneAlgomonActivoVivo()){
				this.cbxAtaquesDisponibles.setDisable(false);
				cargarAtaques();
				this.cbxAlgomonesDisponibles.setDisable(true);
				this.cbxElementosDisponibles.setDisable(true);	
			}else{
				Alert alertaAlgomonMuerto = new Alert(AlertType.WARNING);
				alertaAlgomonMuerto.setTitle("Estado Algomon");
				alertaAlgomonMuerto.setHeaderText(null);
				alertaAlgomonMuerto.setContentText("El algomon activo esta muerto, solo puede cambiar el algomon");
				alertaAlgomonMuerto.showAndWait();
			}
			
		} else {
			if (accionSeleccionadaIndex == EVIAR_ELEMENTO_ACCION_INDICE) {
				if(juego.entrenadorActivoTieneAlgomonActivoVivo()){
					this.cbxAtaquesDisponibles.setDisable(true);
					this.cbxAlgomonesDisponibles.setDisable(true);
					this.cbxElementosDisponibles.setDisable(false);
					cargarElementos();	
				}else{
					Alert alertaAlgomonMuerto = new Alert(AlertType.WARNING);
					alertaAlgomonMuerto.setTitle("Estado Algomon");
					alertaAlgomonMuerto.setHeaderText(null);
					alertaAlgomonMuerto.setContentText("El algomon activo esta muerto, solo puede cambiar el algomon");
					alertaAlgomonMuerto.showAndWait();	
				}
				
			} else {
				this.cbxAtaquesDisponibles.setDisable(true);
				this.cbxAlgomonesDisponibles.setDisable(false);
				this.cbxElementosDisponibles.setDisable(true);
				cargarAlgomonesNoActivos();
			}
		}

	}

	private void cargarAlgomonesNoActivos() {
		datosAlgomones.clear();
		for (Algomon algomon : juego.getEntrenadorActivo().obtenerAlgomonesNoActivosVivos()) {
			datosAlgomones.add(algomon.getClass().getSimpleName());
		}
		cbxAlgomonesDisponibles.setItems(datosAlgomones);

	}

	private void cargarElementos() {
		datosElementos.clear();
		for (Elemento elemento : juego.getEntrenadorActivo().obtenerElementosDisponibles()) {
			datosElementos.add(elemento.getClass().getSimpleName());
		}
		cbxElementosDisponibles.setItems(datosElementos);

	}

	private void cargarAtaques() {
		datosAtaques.clear();
		for (Ataque ataque : juego.obtenerAtaquesDeAlgomonActivo()) {
			datosAtaques.add(ataque.getClass().getSimpleName());
		}
		cbxAtaquesDisponibles.setItems(datosAtaques);
	}

	private void refrescarPantalla() {
		this.txtAlgomonActivo.setText(juego.obtenerNombreAlgomonActivo());
		this.txtEntrenadorActivo.setText(juego.obtenerNombreJugadorActivo());
		this.txtEstadoAlgomonActivo.setText(juego.obtenerEstadoAlgomonActivo());
		this.acciones.getSelectionModel().clearSelection();
		this.cbxAlgomonesDisponibles.setDisable(true);
		this.cbxAlgomonesDisponibles.getSelectionModel().clearSelection();
		this.cbxAtaquesDisponibles.setDisable(true);
		this.cbxAtaquesDisponibles.getSelectionModel().clearSelection();
		this.cbxElementosDisponibles.setDisable(true);
		this.cbxElementosDisponibles.getSelectionModel().clearSelection();
		this.refrescarTablasDeVidasDeAlgomones();
		this.cargarElementosEntrenadores();
		this.cargarImagenAlgomones();
	}

	private void refrescarTablasDeVidasDeAlgomones() {
		this.datosTablaAlgomonesEntrenador1.clear();
		for (Algomon algomon : juego.getEntrenador1().getAlgomones()) {
			this.datosTablaAlgomonesEntrenador1.add(algomon);
		}
		this.tablaAlgomonesAgregadosEntrenador1.setItems(this.datosTablaAlgomonesEntrenador1);

		this.datosTablaAlgomonesEntrenador2.clear();
		for (Algomon algomon : juego.getEntrenador2().getAlgomones()) {
			this.datosTablaAlgomonesEntrenador2.add(algomon);
		}
		this.tablaAlgomonesAgregadosEntrenador2.setItems(this.datosTablaAlgomonesEntrenador2);

	}

	@FXML
	private void realizarAccion() {

		int accionSeleccionadaIndex = this.acciones.getSelectionModel().getSelectedIndex();		
					
		if (accionSeleccionadaIndex == REALIZAR_ATAQUE_ACCION_INDICE) {
			String nombreAtaque = obtenerAtaqueSeleccionado();
			Ataque ataque = this.juego.obetenerAtaque(nombreAtaque);
			juego.atacar(ataque);
		} else {
			if (accionSeleccionadaIndex == EVIAR_ELEMENTO_ACCION_INDICE) {
				String nombreElemento = obtenerElementoSeleccionado();
				Elemento elemento = this.juego.obtenerElemento(nombreElemento);
				this.juego.enviarElemento(elemento);
			} else {
				String algomonSeleccionado = obtenerAlgomonSeleccionado();
				this.juego.cambiarAlgomonActivo(algomonSeleccionado);
			}

		}
		if (this.juego.elJuegoEstaFinalizado()) {
			Alert alertaJuegoFinalizado = new Alert(AlertType.INFORMATION);
			alertaJuegoFinalizado.setTitle("Se termino el juego");
			alertaJuegoFinalizado.setHeaderText("El ganador es");
			alertaJuegoFinalizado.setContentText(juego.obtenerNombreJugadorActivo());
			alertaJuegoFinalizado.showAndWait();
		} else {
			juego.cambiarJugador();
			Alert alertaCambioDeTurno = new Alert(AlertType.INFORMATION);
			alertaCambioDeTurno.setTitle("Cambio de turno");
			alertaCambioDeTurno.setHeaderText(null);
			alertaCambioDeTurno.setContentText("Es turno de "+juego.obtenerNombreJugadorActivo());			
			alertaCambioDeTurno.showAndWait();
			
		}

		refrescarPantalla();
	}

	private String obtenerAlgomonSeleccionado() {
		return this.datosAlgomones.get(this.cbxAlgomonesDisponibles.getSelectionModel().getSelectedIndex());
	}

	private String obtenerElementoSeleccionado() {
		int elementoSeleccionadoIndex = this.cbxElementosDisponibles.getSelectionModel().getSelectedIndex();
		String nombreElementoSeleccionado = datosElementos.get(elementoSeleccionadoIndex);
		return nombreElementoSeleccionado;
	}

	private String obtenerAtaqueSeleccionado() {
		int ataqueSeleccionadoIndex = this.cbxAtaquesDisponibles.getSelectionModel().getSelectedIndex();
		String nombreAtaqueSeleccionado = datosAtaques.get(ataqueSeleccionadoIndex);
		return nombreAtaqueSeleccionado;
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
