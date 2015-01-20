package ch.makery.address.view;

import ch.makery.address.MainApp;
import ch.makery.address.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController {
    
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;
    
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;
    
    // Reference to main application
    private MainApp mainApp;
    
    /**
     * Construtor
     */
    public PersonOverviewController() {
    }
    
    /**
     * Inicializa a classe controller. Esse método é chamado automaticamente
     * após o arquivo fxml ter sido carregado
     */
    @FXML
    private void initialize(){
        // inicializa a tabela de pessoa com duas colunas
        this.firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        this.lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
    
    /**
     * É chamada pela aplicação principal para dar uma referência de volta a si mesmo.
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
        
        // adiciona dados da observable list na tabela
        this.personTable.setItems(this.mainApp.getPersonData());
    }
    
}
