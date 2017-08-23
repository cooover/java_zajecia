package application.controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class InfoController {
    @FXML
    private TextField tf_first;
    @FXML
    private TextField tf_last;
    @FXML
    private RadioButton rb1;
    @FXML
    private ToggleGroup pyt2;
    @FXML
    private RadioButton rb2;
    @FXML
    private RadioButton rb3;
    @FXML
    private CheckBox cb1;
    @FXML
    private CheckBox cb2;
    @FXML
    private CheckBox cb3;
    @FXML
    private TextField tf_other;
    @FXML
    private ComboBox<String> combo;
    @FXML
    private Button btn_send;
    @FXML
    void inneAction(MouseEvent event) {
    	if (cb3.isSelected()) {
    		tf_other.setDisable(false);
    	}else {
    		tf_other.setText("");
    		tf_other.setDisable(true);
    	}
    }
    @FXML
    void sendAction(MouseEvent event) throws FileNotFoundException {
    	String rb_sel="";
    	String cb_sel="";
    	String combo_sel="";
    	String info = "Dane ankietowanego: "+tf_first.getText()+", "+tf_last.getText()+"\n";
    	
    	if(rb1.isSelected()){
    		rb_sel = rb1.getText();
    	}else if(rb2.isSelected()){
    		rb_sel = rb2.getText();
    	}else if(rb3.isSelected()){
    		rb_sel = rb3.getText();
    	}
    	info+="Znajomoœæ jêzyka angielskiego: "+rb_sel+"\n";
    	if(cb1.isSelected()) {
    		cb_sel = cb1.getText()+", ";
    	}
    	if(cb2.isSelected()) {
    		cb_sel += cb2.getText()+", ";
    	}
    	if(cb3.isSelected()) {
    		cb_sel += cb3.getText()+": "+tf_other.getText();
    	}    	
    	info+="Znajomoœæ jêzyków programowania: "+cb_sel+"\n";
    	combo_sel = "Wybór kursu: "+combo.getSelectionModel().getSelectedItem()+"\n";
    	info+= combo_sel;
    	if(tf_first.getText().equals("") || tf_last.getText().equals("")) {
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Nie poda³eœ imienia lub nazwiska");
    		a.setTitle("B³¹d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}else {
    		PrintWriter pw = new PrintWriter("C:\\Users\\Hanka\\Desktop\\Pliki\\"+tf_last.getText()+tf_first.getText()+".txt");
	    	pw.println(info);
	    	pw.close();
	    	Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("Dane zosta³y przes³ane");
			a.setTitle("Dziêkujemy!");
			a.setHeaderText("Dziêkujemy za wype³nienie ankiety");
			a.showAndWait();
	    	}
    }
    
    public void initialize(){
    	combo.getItems().add("Back-end Dev");
    	combo.getItems().add("Frond-end Dev");
    	combo.getSelectionModel().select(0);
    }
}

