package fiuba.algo3.vista;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Aplicacion extends Application{

	@Override
	public void start(Stage stage) throws Exception {
//		
//		Image imageCharmander = new Image(getClass().getResourceAsStream("charmander.gif"));
//		Image imageBulbasaur = new Image(getClass().getResourceAsStream("Bulbasaur.gif"));
//		
		
	    MenuBar menuBar = new MenuBar();
	       
	    Menu menuArchivo = new Menu("Archivo");
	    Menu menuAcerca = new Menu("Acerca de nosotros");
	       
	    menuBar.getMenus().addAll(menuArchivo, menuAcerca);
           
		
		Label txtJugador=new Label("Jugador 1 , Ingrese su nombre ");
		txtJugador.setFont(new Font("Arial",15));
		TextField nombreDeJugador=new TextField();
		nombreDeJugador.setMaxWidth(100);;
		
		
		Button btnCharmander=new Button("CHARMANDER");
		btnCharmander.setTextFill(Color.FIREBRICK);
		
		Button btnBulbasaur=new Button("BULBASAUR");
		btnBulbasaur.setTextFill(Color.GREEN);

		Button btnSquirtle=new Button("SQUIRTLE");
		btnSquirtle.setTextFill(Color.BLUE);

		Button exit=new Button("Salir del juego");
			
//		Button btnBulbasaur=new Button("bulbasaur",new ImageView(imageBulbasaur));
//		
//		btnCharmander.setMaxWidth(100);
//		btnBulbasaur.setMaxWidth(100);
//		
		
	
		exit.setOnAction(e->System.exit(0));
		
		MiBotonEventHandler botonEventHandler=new MiBotonEventHandler(btnCharmander);
		MiBotonEventHandler botonEventHandler1=new MiBotonEventHandler(btnBulbasaur);
		MiBotonEventHandler botonEventHandler2=new MiBotonEventHandler(btnSquirtle);
		
		btnCharmander.setOnAction(botonEventHandler);
		btnBulbasaur.setOnAction(botonEventHandler1);
		btnSquirtle.setOnAction(botonEventHandler2);
		
		
		
		
		VBox horizontal=new VBox();
		
		horizontal.getChildren().addAll(txtJugador,nombreDeJugador);
		horizontal.getChildren().addAll(menuBar,btnCharmander,btnBulbasaur,btnSquirtle,exit);
		horizontal.setSpacing(10);
		horizontal.setPadding(new Insets(20));
		
		Scene scene=new Scene(horizontal,500,500);
		
		stage.setScene(scene);
		stage.setTitle("Algomon go");
		stage.show();
		
	}
	
	public static void main(String args[]){
		
		launch(args);
	}

}
