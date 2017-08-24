package application.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import application.database.DBConnector;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {
    private static final AlertType Warning = null;
	@FXML
    private TextField tf_login;
    @FXML
    private PasswordField pf_pass;
    @FXML
    private TextField tf_pass;
    @FXML
    private Button btn_show;
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_db;
    @FXML
    private Button btn_close;
    
    public DBConnector db;
    String logowanie;
    @FXML
    void showAction(MouseEvent event) {
    	pf_pass.setVisible(false);
    	tf_pass.setVisible(true);
    	String pass = pf_pass.getText();
    	tf_pass.setText(pass);
    	pf_pass.setText("");
    }
    @FXML
    void hideAction(MouseEvent event) {
    	pf_pass.setVisible(true);
    	tf_pass.setVisible(false);
    	String pass = tf_pass.getText();
    	pf_pass.setText(pass);
    	tf_pass.setText("");
    }
    @FXML
    void closeAction(MouseEvent event) {
    	System.exit(0);
    }
    @FXML
    void loginAction(MouseEvent event) throws IOException {
    	if((tf_login.getText().equals("admin") && (tf_pass.getText().equals("admin")) || (tf_login.getText().equals("admin") && pf_pass.getText().equals("admin")))) {
    		Stage stageInfo = new Stage();
    		Parent parent =(Parent) FXMLLoader.load(getClass().getResource("/application/view/InfoView.fxml"));
    		Scene sceneInfo = new Scene(parent);
    		stageInfo.setScene(sceneInfo);
    		stageInfo.setTitle("�wiczenie JFX3 po zalogowaniu");
    		stageInfo.getIcons().add(new Image("https://ignite.apache.org/images/java.png"));
    		stageInfo.show();
    	} else {
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Poda�e� b��dny login lub has�o");
    		a.setTitle("B��d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}
    }
    @FXML
    void loginDBAction(MouseEvent event) throws ClassNotFoundException, SQLException, IOException {
    	Connection conn1 = db.Connection();
    	Statement stat = conn1.createStatement();
    	ResultSet rs = stat.executeQuery("select * from users where login ='"+tf_login.getText()+"'and pass='"+pf_pass.getText()+"';");
    	
    	if(rs.next()) { // da true albo false w przypadku gdy wystepuje jakis rekord
    		logowanie = rs.getString("login");
    		Stage stageTable = new Stage();
    		Parent parent =(Parent) FXMLLoader.load(getClass().getResource("/application/view/DBView.fxml"));
    		Scene sceneTable = new Scene(parent);
    		stageTable.setScene(sceneTable);
    		stageTable.setTitle("Table DB");
    		stageTable.getIcons().add(new Image("https://ignite.apache.org/images/java.png"));
    		stageTable.show();
    	}else {
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Poda�e� b��dny login lub has�o");
    		a.setTitle("B��d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}    	
    }
    public void initialize() {
    	db = new DBConnector();
    }

}
