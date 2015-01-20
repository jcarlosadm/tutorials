package ch.makery.address;

import java.io.IOException;

import ch.makery.address.model.Person;
import ch.makery.address.view.PersonOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
    /**
     * Lista de Persons
     */
    private ObservableList<Person> personData = FXCollections.observableArrayList();
    
    /**
     * Construtor
     */
    public MainApp() {
        // sample data
        this.personData.add(new Person("Hans","Muster"));
        this.personData.add(new Person("Ruth","Mueler"));
        this.personData.add(new Person("Heinz","Kurz"));
        this.personData.add(new Person("Cornelia","Meier"));
        this.personData.add(new Person("Werner","Meye"));
    }
    
    /**
     * Retorna lista de Persons
     * @return
     */
    public ObservableList<Person> getPersonData(){
        return this.personData;
    }
    
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
	        
	        // dá ao controlador acesso ao main app
	        PersonOverviewController controller = loader.getController();
	        controller.setMainApp(this);
	        
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
