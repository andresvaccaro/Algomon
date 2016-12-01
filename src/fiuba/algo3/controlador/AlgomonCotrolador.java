package fiuba.algo3.controlador;

import fiuba.algo3.MainAlgomon;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;

public class AlgomonCotrolador {

	
    private MainAlgomon mainAlgomon;

	@FXML
    private void inicializarJuego() {
		mainAlgomon.mostrarJuegovista();
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
