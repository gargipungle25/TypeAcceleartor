package com.tonevellah.demofx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlLoader {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void loadingFxml(ActionEvent event, String fxml){
        try {
            root = FXMLLoader.load(getClass().getResource(fxml));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root,1920,1080);
//            stage.setHeight(root.maxHeight());
//            stage.setWidth(420);

//            stage.setFullScreen(true);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println("Error while loading " + fxml);
        }
    }
}
