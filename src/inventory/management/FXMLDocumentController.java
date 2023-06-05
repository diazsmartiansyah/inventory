/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package inventory.management;

import inventory.management.apirequest.BarangRequest;
import inventory.management.helper.SessionHelper;
import inventory.management.model.Barang;
import inventory.management.model.Pedagang;
import inventory.management.model.User;
import inventory.management.resourceimplement.AuthImplement;
import inventory.management.resourceimplement.BarangImplement;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author andhi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane loginForm;

    @FXML
    private TextField username;

    @FXML
    private Button loginButton;

    @FXML
    private Button closeButton;

    @FXML
    private PasswordField password;
    
    //DATABASE TOOLS
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private double x = 0;
    private double y = 0;
    
    private AuthImplement authUtils;
    private BarangImplement barangUtils;
    
    public void loginAdmin(){
        
        String sql = "SELECT *FROM admin WHERE username = ? AND password = ? ";
        
        connect = database.connectDb();
        
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, username.getText());
            prepare.setString(2, password.getText());
            
            result = prepare.executeQuery();
            Alert alert;
            
            if(username.getText().isEmpty() || password.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Massage");
                alert.setHeaderText(null);
                alert.setContentText("Tolong Isi Form Yang Kosong");
                alert.showAndWait();
            }else{
                if(result.next()){
                    //KETIKA USERNAME DAN PASSWORD SESUAI, LANJUT KE DASBOARD
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Infformation Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Login Berhasil!");
                    alert.showAndWait();
                    
                    //MENGHILANGKAN FORM LOGIN KETIKA LOGIN BERHASIL
                    loginButton.getScene().getWindow().hide();
                    
                    //MENGHUBUNGKAN PADA HALAMAN DASHBOARD
                    Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    
                    root.setOnMousePressed((MouseEvent event) ->{
                      x = event.getSceneX();
                      y = event.getSceneY();
                    });
                    
                    root.setOnMouseDragged((MouseEvent event) ->{
                      stage.setX(event.getScreenX() - x);
                      stage.setY(event.getScreenY() - y);
                    });
                    
                    stage.initStyle(StageStyle.TRANSPARENT);
                    
                    stage.setScene(scene);
                    stage.show();
                }else{
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Massage");
                    alert.setHeaderText(null);
                    alert.setContentText("Username/Password Salah!");
                    alert.showAndWait();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void close(){ 
        System.exit(1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        authUtils = new AuthImplement();
        barangUtils = new BarangImplement();
    }
    
    //Isikan Username Dan Password
    //Untuk Username bisa pakai -> pedagang1
    //Untuk Password Bisa pakai -> pedagang
    
    public User login(String username, String password) {
        boolean isSuccessLogin = authUtils.login(username, password);
        if(!isSuccessLogin) {
            //Jika login gagal
            
        }
        User user = SessionHelper.getCurrentUser();
        return user;
    }
    
    public Pedagang getProfilePedagang() {
        Pedagang pedagang = SessionHelper.getCurrentPedagang();
        return pedagang;
    } 
    
    public Barang[] getListBarang() {
        Barang[] listBarang = barangUtils.getList(new BarangRequest());
        
        return listBarang;
    }
    
    public Barang getDetailBarang(int id) {
        Barang barang = barangUtils.getDetail(id);
        
        return barang;
    }
    
    public Barang updateBarang(int id) {
        BarangRequest request = new BarangRequest();
        
        //Set Atribute barang untuk diupdate
        request.setId(id);
        request.setKodeBarang("Isi Sesuai kebutuhan");
        request.setNama("Isi Sesuai kebutuhan");
        //request.setAttribute() dst
        
        
        Barang barang = barangUtils.update(request);
        
        return barang;
    }
    
    public boolean hapusBarang(int id) {
        boolean status = barangUtils.delete(id);
        
        return status;
    }
    
}