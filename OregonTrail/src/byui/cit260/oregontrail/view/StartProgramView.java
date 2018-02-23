/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Amon Bernardo
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
    public void displayStartProgramView(){
        boolean endOfView = false;
        do{
            String[] inputs = this.getInputs();
            if (inputs.equals(null) || inputs[0].toUpperCase().equals("Q")){ 
                break;
            }
            endOfView = doAction(inputs);
        }while (endOfView != true);
    }

    private String[] getInputs() {
        
        String[] inputs = new String[1]; // array one element long 

        System.out.println(
            "       ___                                      _____                _   _      ___ \n"
            + "      / _ \\   _ _   ___   __ _   ___   _ _     |_   _|  _ _   __ _  (_) | |    / __|  __ _   _ __    ___ \n"
            + "     | (_) | | '_| / -_) / _` | / _ \\ | ' \\      | |   | '_| / _` | | | | |   | (_ | / _` | | '  \\  / -_)\n"
            + "      \\___/  |_|   \\___| \\__, | \\___/ |_||_|     |_|   |_|   \\__,_| |_| |_|    \\___| \\__,_| |_|_|_| \\___|\n"
            + "                         |___/ \n"

        );
        System.out.println ("Welcome to Oregon Trail Game!\n");
        System.out.println ("In this game you will drive a pionner expedition through the plains!\n");
        boolean valid = false;
        while (valid == false){   // while no input value has been entered
            System.out.print("Type the user name or type \"Q\" to quit: ");
            Scanner userInput = new Scanner(System.in);

            String userInputted = userInput.nextLine(); //Get the value entered from the keyboard
            userInputted = userInputted.trim(); //Trim off leading and trailing blanks from the value

            if (userInputted.length() < 1){
               System.out.println("You must enter a non-blank value");
               continue;
            }
            inputs[0] = userInputted;
            valid = true;
        } 
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        Player player = new Player();
        player = GameControl.savePlayer(playerName);
        if (player == null){
            System.out.println("Could not create the player.\n" +
                    "You must enter a non-blank value");
            return false;
        }
        System.out.println("================================================= \n"
            + "Welcome to the game " + playerName
            + "\nWe hope you have a lot of fun!\n"
            + "================================================= \n");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        return true;
    }
    
}
