package fiuba.algo3.vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuDeJuego extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Button inicio=new Button("Iniciar Partida");
		
		Button acerca=new Button("Acerca de Algomon Go");
		
		Button reglas=new Button("Reglas del juego");
		
		VBox vertical=new VBox(15);
		
		vertical.getChildren().addAll(inicio,acerca,reglas);
		
		
		Scene scene=new Scene(vertical,500,500);
		
		
		stage.setScene(scene);
		stage.setTitle("Algomon go");
		stage.show();
		
	}
	
	public static void main(String args[]){
		
		launch(args);
	}


}
