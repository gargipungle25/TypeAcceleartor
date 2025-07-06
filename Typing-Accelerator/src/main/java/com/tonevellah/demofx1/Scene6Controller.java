//view result
package com.tonevellah.demofx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Scene6Controller{
    @FXML
    Label wpmLabel;
    @FXML
    Label accuracyLabel;
    @FXML
    Label typedwordsLabel;
    @FXML
    Label wrongWordTypedLabel;
    @FXML
    Button button;
    private FxmlLoader fxmlLoader = new FxmlLoader();
    public void displayResult(int wpmScore,int accuracyScore,int typedWords,int wrongWords){
        typedwordsLabel.setText(String.valueOf(typedWords) + " Words");
        wrongWordTypedLabel.setText(String.valueOf(wrongWords) + " Words");
        accuracyLabel.setText(String.valueOf(accuracyScore) + "%");
        wpmLabel.setText(String.valueOf((int)wpmScore));
    }
    public void tryagain(ActionEvent event) {
        try {
            fxmlLoader.loadingFxml(event, "Scene4.fxml"); // Going to 'after signing or logging in' GUI
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
