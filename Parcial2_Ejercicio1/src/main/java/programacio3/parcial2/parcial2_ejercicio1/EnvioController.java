package programacio3.parcial2.parcial2_ejercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EnvioController {
    @FXML
    private Label welcomeText;

    private Button guardar;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void  guardarEnvio (Button guardar){

    }
}