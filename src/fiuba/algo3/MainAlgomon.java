package fiuba.algo3;

import java.io.IOException;

import fiuba.algo3.controlador.AlgomonCotrolador;
import fiuba.algo3.controlador.JuegoControlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainAlgomon extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	public MainAlgomon() {
		super();	
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Algomon");
		inicializarAlgomon();

	}


	
	public void mostrarJuegovista() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainAlgomon.class.getResource("vista/JuegoVista.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();

			rootLayout.setCenter(personOverview);

			
			JuegoControlador juegoController =  loader.getController();
			juegoController.setMainAlgomon(this);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	
	private void inicializarAlgomon() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainAlgomon.class.getResource("vista/AlgomonVista.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

			AlgomonCotrolador algomonControlador = loader.getController();
			algomonControlador.setMainAlgomon(this);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

		
	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}

}
