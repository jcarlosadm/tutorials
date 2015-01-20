package ch.makery.address;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");
		
		initRootLayout();
		
		showPersonOverview();
	}
	
	/**
	 * Inicializa o root do layout
	 */
	public void initRootLayout(){
	    try {
            // carrega o root layout do arquivo fxml
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
	        this.rootLayout = (BorderPane) loader.load();
	        
	        // mostra a scene (cena) dentro do root layout
	        Scene scene = new Scene(rootLayout);
	        this.primaryStage.setScene(scene);
	        this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * Mostra person overview dentro do root layout
	 */
	public void showPersonOverview(){
	    try {
            // carrega o person overview
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
	        AnchorPane personOverview = (AnchorPane) loader.load();
	        
	        // define o person overview dentro do root layout
	        rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	/**
	 * Retorna o palco principal
	 * @return primary stage
	 */
	public Stage getPrimaryStage(){
	    return this.primaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
