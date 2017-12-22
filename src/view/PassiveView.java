package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;

public class PassiveView implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------
    @FXML
    private Button buttonMensch;

    //---------------------------------------------
    // Sonstige Membervariablen
    //---------------------------------------------
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonMensch.setOnAction(event -> {
            
        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
       
    }

    

}