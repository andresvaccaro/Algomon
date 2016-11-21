package fiuba.algo3.vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Menus extends Application{

	@Override
	public void start( Stage stage) throws Exception {
		
	
	    VBox vb=new VBox();    
	        
        MenuBar menuBar = new MenuBar();
 
        Menu menuArchivo = new Menu("Archivo");
        Menu menuAcerca = new Menu("Acerca de nosotros");
 
        menuBar.getMenus().addAll(menuArchivo, menuAcerca);
        
        vb.getChildren().addAll(menuBar);
       
	    Scene scene = new Scene(vb, 400, 350);
    
        stage.setScene(scene);
        stage.show();
		
	}
	
	public static void main(String args[]){
		
		launch(args);
	}


}
