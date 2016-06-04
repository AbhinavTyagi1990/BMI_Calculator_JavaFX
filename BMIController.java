/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author AbhinavTyagi
 */
public class BMIController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private RadioButton pi;
    @FXML
    private RadioButton km;
    @FXML
    private TextField weight;
    @FXML
    private TextField height;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try{
        Double w = new Double(weight.getText());
        Double h = new Double(height.getText());
        Double bmi;
        
        if(pi.isSelected()){
            bmi = (w * 703.0)/(h*h);
            label.setText(String.format("%.2f",bmi));
        }
        else if(km.isSelected()) {
            bmi = w /(h*h);
            label.setText(String.format("%.2f",bmi));
        }
        
        }catch(NumberFormatException nf){
            weight.setText("Enter valid value");
            weight.selectAll();
            weight.requestFocus();
            height.setText("Enter valid value");
            height.selectAll();
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
