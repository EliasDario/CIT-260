/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.control.GameControl;
import java.util.Scanner;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class MainMenuView extends View{
    
    public MainMenuView(){
        super ("\n"
            + "\n----------------------------------"
            + "\n| Main Menu                      |"
            + "\n----------------------------------"
            + "\nN - Start New Game\n"
            + "R - Restart Existing game\n"
            + "H - Get Help on how to play the game\n"
            + "G - Store\n"
            + "E - Exit\n"
            + "T - Quit Menu\n"
            + "\n----------------------------------");
    }    
    @Override
    public boolean doAction(String value) {
            value = value.toUpperCase();
        switch (value) {
            case "N": 
                startNewGame();
                break;
                
            case "R": 
                restartGame();
                break;
                
            case "H": 
                getHelp();
                break;
            case "G": 
                store();
                break;
            case "E":
                return true;
            case "T":
                quitMenu();
                return false;
            default : System.out.println("\nInvalid menu Item\n");
                  break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail.getPlayer()); 
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
         
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void quitMenu() {
        QuitMenuView quitMenuView = new QuitMenuView();
        quitMenuView.displayQuitMenu();
    }

    private void store() {
        GeneralStore generalStore = new GeneralStore();
        generalStore.display();
    }
}
   
