//homepage
package com.tonevellah.demofx1;
import javafx.event.ActionEvent;

public class Scene1Controller {
    static public int lvl=1; // level 1,2,3
    static public int car=1; // car 1,2,3
    static public int log=0; // log = 0 not logged in log in 1 logged in

    FxmlLoader fxmlLoader = new FxmlLoader();

    // Opening the login GUI
    public void loginpage(ActionEvent event){
        try {
            fxmlLoader.loadingFxml(event, "Scene2.fxml");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    // Opening the Signup GUI
    public void signuppage(ActionEvent event){
        try {
            fxmlLoader.loadingFxml(event, "Scene3.fxml");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    // Exiting the Application
    public void exit(ActionEvent e) {
        System.exit(0);
    }
}
