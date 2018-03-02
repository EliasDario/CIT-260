/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;
import oregontrail.OregonTrail;

/**
 *
 * @author lucia
 */
public class ChooseOccupationView {
    
    public boolean displayChooseOccupationView(){
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
          System.out.println ("CHOOSE OCCUPATION:\n");
           System.out.println ("1 - Banker from Boston\n" + 
                               "2 - Carpenter from Ohio\n"+
                               "3 - Farmer from Illinois\n"+ 
                               "4 - Which one should I choose\n");
          System.out.println("What is your choice?");
          boolean valid = false;
          while (valid == false){   // while no input value has been entered
              System.out.print("Choose one option: ");
              Scanner userInput = new Scanner(System.in);
              
              String userInputted = userInput.nextLine(); //Get the value entered from the keyboard
              userInputted = userInputted.trim(); //Trim off leading and trailing blanks from the value
              
              if (userInputted.length() < 1){
                 System.out.println("You must choose one option");}
                 else if ("".equals(userInputted)){
                         System.out.println("You must choose one occupation");
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
            case "1": 
                System.out.println("Congratulations! You are a banker and have $1600 to start your trip");
                break;
                
            case "2": 
                System.out.println("Congratulations! You are a carpenter and have $800 to start your trip");
                break;
                
            case "3": 
                System.out.println("Congratulations! You are a farmer and have $400 to start your trip");
                break;
                
            case "4":
                System.out.println(" Traveling to Oregon isn't easy!\n"+
                        "But if you are a banker, you will have more money for supplies and services than a carpenter or a farmer.\n"+
                        "However, the harder you have to try, the more points you deserve!\n"+
                        "Therefore,the farmer earns the greatest number o points and the banker earns the least.\n");
                System.out.println("Press \"C\"to continue");
                break;
            case "C":
                return true;
                
            default : System.out.println("\nInvalid menu Item\n");
                  break;
        }
        return false;
    }
    
}
