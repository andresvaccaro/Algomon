package fiuba.algo3.controlador;

import fiuba.algo3.MainAlgomon;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlgomonCotrolador {

	
    private MainAlgomon mainAlgomon;

	@FXML
    private void inicializarJuego() {
		mainAlgomon.mostrarJuegovista();
    }	
    
	

	@FXML
    private void autores() {
		Alert alertaAutores = new Alert(AlertType.INFORMATION);
		alertaAutores.setTitle("Autores");
		alertaAutores.setHeaderText("Algoritmos 3 ");
		String autores= "Andres Vaccaro \n" +"Fabian Colque \n" +"Oscar Paniagua ";
		alertaAutores.setContentText(autores);		
		alertaAutores.showAndWait();
    }	

	@FXML
    private void salirJuego() {
		Platform.exit();
    }
	
  
	@FXML
    private void initialize() {
	
    }


	public MainAlgomon getMainAlgomon() {
		return mainAlgomon;
	}


	public void setMainAlgomon(MainAlgomon mainAlgomon) {
		this.mainAlgomon = mainAlgomon;
	}

	
	


	
	
	
}
