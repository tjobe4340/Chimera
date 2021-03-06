package application.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button creditsButton;

    @FXML
    private AnchorPane mainMenuAnchor;

    @FXML
    private Button playButton;

    @FXML
    private Button quitButton;

    @FXML
    private ImageView titleGif;
    
    /*
     * this controller is for the main menu and consists of three buttons, the background and the anchorpane.
     * 
     * the details of the buttons are below
     * 		open class which starts the game
     *		open credits which opens the credits scene
     *		quit which exits the game. using a function found in the documentation.
     */
    @FXML
    void openClassScreen(ActionEvent event) throws IOException {
        mainMenuAnchor = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/level1.fxml"));
        Scene scene = new Scene(mainMenuAnchor);//window im going to 
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();//window im in
        window.setScene(scene);
    }

    @FXML
    void openCredits(ActionEvent event) throws IOException {
        mainMenuAnchor = FXMLLoader.load(getClass().getClassLoader().getResource("application/view/credits.fxml"));
        Scene scene = new Scene(mainMenuAnchor);//window im going to 
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();//window im in
        window.setScene(scene);
    }

    @FXML
    void quitGame(ActionEvent event) {
    	Platform.exit();
    }
   
}