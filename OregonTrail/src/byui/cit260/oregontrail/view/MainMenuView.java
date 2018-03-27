/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.control.GameControl;
import buyi.cit260.oregontrail.control.PlayerControl;
import buyi.cit260.oregontrail.exceptions.GameControlException;
import buyi.cit260.oregontrail.exceptions.PlayerControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class MainMenuView extends View{
    
    public MainMenuView(){
        super ("\n"
            + "----------------------------------\n"
            + "| Main Menu                      |\n"
            + "----------------------------------\n"
            + "N - Start New Game\n"
            + "R - Restart Existing game\n"
            + "A - Simulate game points\n"
            + "H - Get Help on how to play the game\n"
            + "G - Store\n"
            + "E - Exit\n"
            + "T - Quit Menu\n"
            + "P - Test player control occupation (enter a number)\n"
            + "F - Test player control"
            + "\n----------------------------------");
    }    
    @Override
    public boolean doAction(String value) {
            value = value.toUpperCase();
        switch (value) {
            case "N": 
                try{
                startNewGame();
                return true;
                }
                catch (GameControlException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            case "R": 
                restartGame();
                break;
            case "A":
                simulatePoints();
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
            case "P":
                try{
                    PlayerControl.chooseOccupation(1);
                    //PlayerControl.chooseOccupation(Integer.parseInt(value));
                    return true;
                }
                catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            case "F":
                try{
//                    PlayerControl.changeWagonHealth("filling", "stead", "cold");
                    PlayerControl.changeWagonHealth("hungry", "stead", "cold");
                    return true;
                }
                catch (PlayerControlException e){
                    System.out.println(e.getMessage());
                }
            default : System.out.println("\nInvalid menu Item\n");
                  break;
        }
        return false;
    }

    private void startNewGame() throws GameControlException{
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
        helpMenuView.display();
    }

    private void quitMenu() {
        QuitMenuView quitMenuView = new QuitMenuView();
        quitMenuView.displayQuitMenu();
    }

    private void store() {
        GeneralStore generalStore = new GeneralStore();
        generalStore.display();
    }

    private void simulatePoints() {
        SimulateGamePointView simulateGamePointView = new SimulateGamePointView();
        simulateGamePointView.displaySimulateGamePoint();
    }
}
   
