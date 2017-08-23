package application.controller;

import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {
    @FXML
    private MenuItem mi_save;
    @FXML
    private MenuItem mi_close;
    @FXML
    private TextField tf;
    @FXML
    private TextArea ta;
    @FXML
    private Button btn_UC;
    @FXML
    private Button btn_LC;
    @FXML
    private Button btn_C;
    
    @FXML
    void clear(MouseEvent event) {
    	ta.setText("");
    }
    @FXML
    void exitApp(ActionEvent event) {
    	System.exit(0);
    }
    @FXML
    void lowerCase(MouseEvent event) {
    	String text = ta.getText();
    	text = text.toLowerCase();
    	ta.setText(text);
    }
    @FXML
    void save(ActionEvent event) throws FileNotFoundException {
    	Frame f = new Frame();
    	JOptionPane op = new JOptionPane();
    	if(tf.getText().equals("")) {
    		op.showMessageDialog(f, "Musisz podaæ nazwê pliku!");
    	}else {
    	File plik = new File("C:\\Users\\Hanka\\Desktop\\Pliki\\"+tf.getText()+".txt");
    	PrintWriter zapis = new PrintWriter(plik);
    	Scanner sc = new Scanner(ta.getText());
    	while(sc.hasNextLine()) {
    		String line = sc.nextLine();
    		zapis.println(line);
    	}
		op.showMessageDialog(f, "Zapisano!");
		ta.setText("");
		tf.setText("");
		zapis.close();
		sc.close();
    	}	
    }
    @FXML
    void upperCase(MouseEvent event) {
    	String text = ta.getText();
    	text = text.toUpperCase();
    	ta.setText(text);
    }
}
