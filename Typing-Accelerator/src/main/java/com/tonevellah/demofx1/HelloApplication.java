//start
// login scene
package com.tonevellah.demofx1;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("TYPING ACCELERATOR");
            Image icon = new Image("C:\\Users\\Valeska\\OneDrive\\Desktop\\Sem3MiniProject\\src\\main\\resources\\com\\tonevellah\\demofx1\\TypeAcceleratorLogo.png    ");
            stage.getIcons().add(icon);
            stage.setFullScreen(true);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        launch();
    }
}