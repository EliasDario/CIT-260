/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Amon Bernardo
 */
class HelpMenuView {

    void displayHelpMenuView() {
        boolean endView = false;
        do{
        String[] inputs = getInputs();
            if (inputs.equals(null) || inputs[0].toUpperCase().equals("Q")){ 
                return;
            }
        endView = doAction(inputs);
        }while (endView != true);
    }

    private String[] getInputs() {
          String[] inputs = new String[1]; // array one element long
          System.out.println ("\n***This is Help Menu View***\n");
          boolean valid = false;
          while (valid == false){   // while no input value has been entered
              System.out.print("\nN - To see a message "
                      + "\nR - To see a message "
                      + "\nH - To see a message "
                      + "\nE - To see a message "
                      + "\nChoose some option in the menu above: ");
              Scanner userInput = new Scanner(System.in);
              
              String userInputted = userInput.nextLine(); //Get the value entered from the keyboard
              userInputted = userInputted.trim(); //Trim off leading and trailing blanks from the value
              
              if (userInputted.length() < 1){
                 System.out.println("You must enter a value");
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
          switch (menuItem){
            case "N":
                System.out.println("\nYou selected N");
                return true;
            case "R":
                System.out.println("\nYou selected R");
                return true;
            case "H":
                System.out.println("\nYou selected H");
                return true;
            case "E":
                System.out.println("\nYou selected E");
                return true;
            default: 
                System.out.println("\nInvalid menu item");
          }
          return false;
    }
    
}
