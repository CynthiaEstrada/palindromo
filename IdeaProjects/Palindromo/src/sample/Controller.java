package sample;

import javafx.event.ActionEvent;
import javafx.event.EventDispatchChain;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.swing.text.html.ImageView;
import javax.xml.ws.Action;
import java.awt.*;
import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;



public class Controller {

    String pala;
    @FXML
    private Button Comprobar;
    @FXML
    private TextArea palabra;


    public String getPala() {
        return pala;
    }

    public void initialize() {
        assert Comprobar != null : "fx:id =\"boton1\" was not injected: check yor FXML file 'sample.fxml'.";

        // Button boton1 = new Button("Comprobar");

        Comprobar.setOnAction((event) -> {
            palabra.setText(pala);

        });

        /*boton1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9");
        boton1.setOnAction(new EventHandler<ActionEvent>() {
        }*/

  /*  @Override
    public EventDispatchChain buildEventDispatchChain(EventDispatchChain tail) {
        return null;
    });*/


    }

}

