package org.dein;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/org/dein/fxml/flowPane.fxml"));
/*        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource( "/org/dein/fxml/flowPane.fxml/fxml/flowPane.fxml"));*/
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("FlowPane Alignment");
        String url = getClass().getResource("/org/dein/css/styles.css").toString();
        scene.getStylesheets().addAll(url);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}