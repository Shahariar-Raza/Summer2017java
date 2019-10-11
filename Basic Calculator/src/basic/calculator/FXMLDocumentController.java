/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Shaha
 */
public class FXMLDocumentController implements Initializable {
    
    int num1;
    int num2;
    String operation;
  

    @FXML
    private TextField displayField;
    @FXML
    private Button digitThreeButton;
    @FXML
    private Button digitFourButton;
    @FXML
    private Button digitOneButton;
    @FXML
    private Button digitTwoButton;
    @FXML
    private Button digitFiveButton;
    @FXML
    private Button digitSixButton;
    @FXML
    private Button digitNineButton;
    @FXML
    private Button digitEightButton;
    @FXML
    private Button digitZeroButton;
    @FXML
    private Button digitSevenButton;
    @FXML
    private Button displayClearButton;
    @FXML
    private Button dotButton;
    @FXML
    private Button equalButton;
    @FXML
    private Button addButton;
    @FXML
    private Button subtractionButton;
    @FXML
    private Button multiplecationButton;
    @FXML
    private Button divideButton;
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleDigitThreeAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "3";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitFourAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "4";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitOneAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "1";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitTwoAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "2";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitFiveAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "5";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitSixAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "6";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitNineAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "9";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitEightAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "8";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitZeroAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "0";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitSevenAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        String newText = oldText + "7";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleClearButton(ActionEvent event) {
    
    displayField.clear();
    
    }

    @FXML
    private void handleDotButtonAction(ActionEvent event) {
    
        String oldText = displayField.getText();
        if (!oldText.contains(".")){
        String newText = oldText + ".";
        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
        }
    }


    @FXML
    private void handleAddButtonAction(ActionEvent event) {
       
        num1 = Integer.parseInt(displayField.getText());
        displayField.clear();
        operation = "ADD";
        
    }

    @FXML
    private void handleSubtractionButtonAction(ActionEvent event) {
        num1 = Integer.parseInt(displayField.getText());
        displayField.clear();
        operation = "SUB";
    }

    @FXML
    private void handleMultiplecationButtonAction(ActionEvent event) {
    
    
    }

    @FXML
    private void handleDivideButtonAction(ActionEvent event) {
    
    
    
    }
    
        @FXML
    private void handleEqualButtonAction(ActionEvent event) {
        
        num2 = Integer.parseInt(displayField.getText());
        int result = 0; 
        if (operation.equals("ADD"))
            result = num1 + num2;
        else if (operation.equals("SUB"))
            result = num1 - num2;
        displayField.setText(" "+ result);
    }   
}