package fiuba.algo3.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MiBotonEventHandler implements EventHandler<ActionEvent>{

	private Button boton;
	
	
	public MiBotonEventHandler(Button boton){
		this.boton=boton;
	}
	
	@Override
	public void handle(ActionEvent actionEvent) {
		
		String texto=" activo";
		System.out.print(texto);
		this.boton.setText(texto);
		
	}

}
