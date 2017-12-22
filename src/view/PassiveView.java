package view;

import playermanager.PlayerManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;

public class PassiveView implements Initializable , GUI{

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------
    @FXML
    private RadioMenuItem player1Mensch, player1Computer,
            player2Mensch, player2Computer;
    @FXML
    private Button buttonMensch;
    
    @FXML
    private Label labelStatus;

    //---------------------------------------------
    // Sonstige Membervariablen
    //---------------------------------------------
    private PlayerManager playerManager;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        player1Mensch.setOnAction(event -> {
            playerManager.setPlayer1Mensch();
        });

        player1Computer.setOnAction(event -> {
            playerManager.setPlayer1Computer();
        });

        player2Mensch.setOnAction(event -> {
            playerManager.setPlayer2Mensch();
        });

        player2Computer.setOnAction(event -> {
            playerManager.setPlayer2Computer();
        });

        buttonMensch.setOnAction(event -> {

        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
        playerManager = new PlayerManager(this);
    }

    @Override
    public void setStatus(String text) {
        labelStatus.setText(text);
    }

}
