//Choose Level Car color and start game controller
package com.tonevellah.demofx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.*;

import static com.tonevellah.demofx1.Scene1Controller.lvl;
import static com.tonevellah.demofx1.Scene1Controller.car;

public class Scene5Controller implements Initializable {
    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    public RadioButton rButton1;
    @FXML
    public RadioButton rButton2;
    @FXML
    public RadioButton rButton3;
    @FXML
    private ChoiceBox<String> myChoiceBox=new ChoiceBox<String>();
    private String[] cars = {"Yellow","Red","Pink"};
    private FxmlLoader fxmlLoader = new FxmlLoader();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        myChoiceBox.getItems().addAll(cars);
        myChoiceBox.setOnAction(this::getCar);
        myChoiceBox.setStyle("-fx-font: 20 arial;");
    }
    public void getCar(ActionEvent event) {

        String mytime = myChoiceBox.getValue();
        if(mytime=="Yellow") car=1;
        else if(mytime=="Red") car=2;
        else if(mytime=="Pink") car=3;
    }
    // Deciding the level of the Game
    public void getLevel(ActionEvent event) {
        if(rButton1.isSelected()) lvl=1;
        else if(rButton2.isSelected()) lvl=2;
        else if(rButton3.isSelected()) lvl=3;
    }
    public void gotogame(ActionEvent e) { // On Action of Start Game Button
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            Gamecontroller gamecontroller = loader.getController();
            gamecontroller.takeGivenLine();
            gamecontroller.setfirstword();
//            scene = new Scene(root);
            scene = new Scene(root,1920,1080);

            stage.setScene(scene);
            stage.show();
        } catch(Exception se){
            System.out.println(se);
        }
    }

    public void goback(ActionEvent event)  {
        try {
//        System.out.println(log);
            fxmlLoader.loadingFxml(event, "Scene4.fxml"); // Going to 'after signing or logging in' GUI
        }catch (Exception e){
            System.out.println(e);

        }
    }
}
