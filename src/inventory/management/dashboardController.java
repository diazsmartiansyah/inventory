/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;

/**
 *
 * @author andhi
 */
public class dashboardController extends Application implements Initializable {

    @FXML
    private AnchorPane mainForm;

    @FXML
    private Button closeBtn;

    @FXML
    private Button minimizeBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button addProductBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Label logoutText;

    @FXML
    private Button ordersBtn;

    @FXML
    private Button scheduleBtn;

    @FXML
    private Button notesBtn;

    @FXML
    private Button profileBtn;

    @FXML
    private AnchorPane homePage;

    @FXML
    private Label home_totalOrders;

    @FXML
    private Label home_availableProducts;

    @FXML
    private Label home_totalIncome;

    @FXML
    private AreaChart<?, ?> home_incomeChart;

    @FXML
    private BarChart<?, ?> home_ordersChart;

    @FXML
    private AnchorPane addProductPage;

    @FXML
    private ImageView addProduct_ImageViewer;

    @FXML
    private Button addProduct_imageBtn;

    @FXML
    private TextField addProduct_productID;

    @FXML
    private TextField addProduct_productName;

    @FXML
    private TextField addProduct_productPrice;

    @FXML
    private TextField addProduct_productType;

    @FXML
    private Button addProduct_addBtn;

    @FXML
    private Button addProduct_clearBtn;

    @FXML
    private Button addProduct_updateBtn;

    @FXML
    private Button addProduct_deleteBtn;

    @FXML
    private Spinner<?> addProduct_productQuantity;

    @FXML
    private TableView<?> addProduct_tableView;

    @FXML
    private TableColumn<?, ?> addProduct_col_productID;

    @FXML
    private TableColumn<?, ?> addProduct_col_productName;

    @FXML
    private TableColumn<?, ?> addProduct_col_productType;

    @FXML
    private TableColumn<?, ?> addProduct_col_price;

    @FXML
    private TableColumn<?, ?> addProduct_col_quantity;

    @FXML
    private TextField addProduct_search;

    @FXML
    private AnchorPane ordersPage;

    @FXML
    private Button orders_payBtn;

    @FXML
    private Button orders_resetBtn;

    @FXML
    private Button orders_receiptBtn;

    @FXML
    private Spinner<?> orders_Quantity;

    @FXML
    private Label orders_total;

    @FXML
    private TextField orders_amount;

    @FXML
    private ComboBox<?> orders_productName;

    @FXML
    private ComboBox<?> orders_productType;

    @FXML
    private TableView<?> orders_tableView;

    @FXML
    private TableColumn<?, ?> orders_col_productType;

    @FXML
    private TableColumn<?, ?> orders_col_productName;

    @FXML
    private TableColumn<?, ?> orders_col_productPrice;

    @FXML
    private TableColumn<?, ?> orders_col_productQuantity;

    @FXML
    private AnchorPane schedulePage;

    @FXML
    private TableView<?> schedule_tableView;

    @FXML
    private TableColumn<?, ?> schedule_col_judul;

    @FXML
    private TableColumn<?, ?> schedule_col_detail;

    @FXML
    private TableColumn<?, ?> schedule_col_tanggal;

    @FXML
    private TableColumn<?, ?> schedule_col_mode;

    @FXML
    private TextField schedule_judul;

    @FXML
    private Button schedule_addBtn;

    @FXML
    private Button schedule_resetBtn;

    @FXML
    private Button schedule_updateBtn;

    @FXML
    private Button schedule_deleteBtn;

    @FXML
    private DatePicker schedule_tanggal;

    @FXML
    private ComboBox<?> schedule_mode;

    @FXML
    private TextArea schedule_detail;

    @FXML
    private AnchorPane notesPage;

    @FXML
    private TableView<?> notes_tableView;

    @FXML
    private TableColumn<?, ?> notes_col_judul;

    @FXML
    private TableColumn<?, ?> notes_col_catatan;

    @FXML
    private TableColumn<?, ?> notes_col_tanggal;

    @FXML
    private TextField notes_judul;

    @FXML
    private Button notes_addBtn;

    @FXML
    private Button notes_clearBtn;

    @FXML
    private Button notes_updateBtn;

    @FXML
    private Button notes_deleteBtn;

    @FXML
    private DatePicker notes_tanggal;

    @FXML
    private TextArea notes_catatan;

    @FXML
    private AnchorPane profilePage;

    @FXML
    private Button importProfilePhoto;

    @FXML
    private Label merchantName;

    @FXML
    private Label email;

    @FXML
    private Label phone;

    @FXML
    private Label address;

    @FXML
    private TextField nameField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;
    
    @FXML
    private Button changeBtnName;

    @FXML
    private Button changeBtnAddress;

    @FXML
    private Button changeBtnEmail;

    @FXML
    private Button changeBtnPhone;
    
    public void switchForm(ActionEvent event) {
         
        if(event.getSource() == homeBtn){
            homePage.setVisible(true);
            addProductPage.setVisible(false);
            ordersPage.setVisible(false);
            schedulePage.setVisible(false);
            notesPage.setVisible(false);
            profilePage.setVisible(false);
        }else if(event.getSource() == addProductBtn){
            homePage.setVisible(false);
            addProductPage.setVisible(true);
            ordersPage.setVisible(false);   
            schedulePage.setVisible(false);
            notesPage.setVisible(false);
            profilePage.setVisible(false);
        }else if(event.getSource() == ordersBtn){
            homePage.setVisible(false);
            addProductPage.setVisible(false);
            ordersPage.setVisible(true);
            schedulePage.setVisible(false);
            notesPage.setVisible(false);
            profilePage.setVisible(false);
        }else if(event.getSource() == scheduleBtn){
            homePage.setVisible(false);
            addProductPage.setVisible(false);
            ordersPage.setVisible(false);
            schedulePage.setVisible(true);
            notesPage.setVisible(false);
            profilePage.setVisible(false);
        }else if(event.getSource() == notesBtn){
            homePage.setVisible(false);
            addProductPage.setVisible(false);
            ordersPage.setVisible(false);
            schedulePage.setVisible(false);
            notesPage.setVisible(true);
            profilePage.setVisible(false);
        }else if(event.getSource() == profileBtn){
            homePage.setVisible(false);
            addProductPage.setVisible(false);
            ordersPage.setVisible(false);
            schedulePage.setVisible(false);
            notesPage.setVisible(false);
            profilePage.setVisible(true);
        }
    }

    private double x = 0;
    private double y = 0;

    public void logout() {
        try {

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Apakah anda yakin ingin logout?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                logoutBtn.getScene().getWindow().hide();
                logoutText.getScene().getWindow().hide();
                //BALIK KE FORM LOGIN KETIKA SIGNOUT
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });

                root.setOnMouseDragged((MouseEvent event) -> {
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);

                    stage.setOpacity(.8);
                });

                root.setOnMouseReleased((MouseEvent event) -> {
                    stage.setOpacity(1);
                });
                
                stage.initStyle(StageStyle.TRANSPARENT);
                
                stage.setScene(scene);
                stage.show();

            }else return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void minimize() {
        Stage stage = (Stage) mainForm.getScene().getWindow();
        stage.setIconified(true);
    }

    public void close() {
        System.exit(0);
    }
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	System.out.println("www");
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("www 2");
		Scene scene = mainForm.getScene();
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("www 3");
        launch(args);
    }

}
