package playermanager;

import Game.Game;
import view.GUI;

public class PlayerManager {

    private GUI gui;
    private Game game;

    private Player player1;
    private Player player2;

    public PlayerManager(GUI gui) {
        game = new Game();
        this.gui = gui;
        player1 = new Mensch();
        player2 = new Mensch();
        displayPlayerStatus();
    }

    public void setPlayer1Mensch() {
        player1 = new Mensch();
        displayPlayerStatus();
    }

    public void setPlayer1Computer() {
        player1 = new Computer();
        displayPlayerStatus();
    }

    public void setPlayer2Mensch() {
        player2 = new Mensch();
        displayPlayerStatus();
    }

    public void setPlayer2Computer() {
        player2 = new Computer();
        displayPlayerStatus();
    }

    private void displayPlayerStatus() {
        String text = "Spieler 1: " + player1.getTyp()
                + ", Spieler 2: " + player2.getTyp();
        gui.setStatus(text);
    }

    public void aktionMensch() {
        
    }

}
