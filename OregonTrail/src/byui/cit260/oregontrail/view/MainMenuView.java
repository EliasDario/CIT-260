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
public class MainMenuView {
    
    public MainMenuView(){
    }

    public boolean displayMainMenuView() {
        
        boolean endOfView = false;
        do {
        String[] inputs = this.getInputs();
            if (inputs.equals(null) || inputs[0].toUpperCase().equals("Q")){ 
                return false;
            }
        endOfView = doAction(inputs);    
            }
        while (endOfView != true);
        return true;
}

    private String[] getInputs() {
        
        String[] inputs = new String[1]; // array one element long
          System.out.println ("Main Menu\n");
           System.out.println ("N - Start New Game\n" + 
                               "R - Restart Existing game\n"+
                               "H - Get Help on how to play the game\n"+ 
                               "E - Exit\n" +
                               "T - Quit Menu");
          boolean valid = false;
          while (valid == false){   // while no input value has been entered
              System.out.print("Choose one option or type Q to quit: ");
              Scanner userInput = new Scanner(System.in);
              
              String userInputted = userInput.nextLine(); //Get the value entered from the keyboard
              userInputted = userInputted.trim(); //Trim off leading and trailing blanks from the value
              
              if (userInputted.length() < 1){
                 System.out.println("You must specify a value");}
                 else if (" ".equals(userInputted)){
                         System.out.println("You must specify an allowed visible value");
                         // Added code for dealing with blank space user input (" ").
                 continue;
              }
              inputs[0] = userInputted;
              valid = true;
          } 
          return inputs;
    }

    private boolean doAction(String[] inputs) {
            String menuItem = inputs[0];
            menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "N": 
                startNewGame();
                break;
                
            case "R": 
                restartGame();
                break;
                
            case "H": 
                getHelp();
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
}
   
