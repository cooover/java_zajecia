package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
    void sendAction(MouseEvent event) {
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
    	info+="Znajomoœæ jêzyków programowaniw: "+cb_sel+"\n";
    	combo_sel = combo.getSelectionModel().getSelectedItem()+"\n";
    	info+= combo_sel;
    	System.out.println(info);
    }
    
    public void initialize(){
    	combo.getItems().add("Back-end Dev");
    	combo.getItems().add("Frond-end Dev");
    	combo.getSelectionModel().select(0);
    }
}

