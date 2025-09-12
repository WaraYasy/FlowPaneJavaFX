package org.dein;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * <p>
 * Se encarga de cargar la interfaz desde un archivo FXML, aplicar estilos CSS y mostrar la ventana principal.
 * </p>
 *
 * @author Wara Pacheco
 * @version 1.0
 */
public class App extends Application {

    private static Scene scene;

    /**
     * Este método se ejecuta al arrancar la aplicación.
     * Carga la interfaz (FXML), aplica el CSS y muestra la ventana.
     *
     * @param stage Ventana principal de la aplicación.
     * @throws IOException Si hay un problema al cargar el archivo FXML.
     */
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

    /**
     * Método principal de la aplicación.
     * Lanza la aplicaación de JavaFX.
     *
     * @param args Argumentos de la línea de comandos (No sse requieren).
     */
    public static void main(String[] args) {
        launch();
    }

}