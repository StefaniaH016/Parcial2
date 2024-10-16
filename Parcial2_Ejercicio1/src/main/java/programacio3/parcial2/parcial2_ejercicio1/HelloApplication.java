package programacio3.parcial2.parcial2_ejercicio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

        String archivo, formato;
    
        archivo = "/Users/Admin/ideaProjects/Parcial2_Ejercicio1/Envios.txt";

        formato = "@%s" + "\n";
        
        try {
            PersistenciaSeries.almacenarDatos(archivo, formato, envios);


        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error en la manipulacion del archivo " + e.getMessage(), "Dialogo de Error", JOptionPane.ERROR_MESSAGE);

        }
}
