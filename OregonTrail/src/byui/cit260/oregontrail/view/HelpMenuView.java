/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Lucia
 */
class HelpMenuView {

    public HelpMenuView(){
    }

    public void displayHelpMenuView() {
        boolean endOfView = false;
        do{
            String[] inputs = this.getInputs();
            if (inputs.equals(null)|| inputs[0].toUpperCase().equals("C")){
                break;
            }
            endOfView = doAction(inputs);
        }while (endOfView != true);
//System.out.println("displayHelpMenuView() method was called");
        }

    private String[] getInputs() {
        
        String[] inputs = new String[1];
        System.out.println("Help Menu\n");
        boolean valid = false;
        while (valid == false){ //while no input value has been entered
            System.out.println("The original game was about the realities of 19th-century pioneer life on the Oregon Trail.\n"+
                           " The player assumes the role of a wagon leader guiding a party of settlers from Independence, Missouri, to Oregon's Willamette Valley via a covered wagon in 1848.\n"+
                           "GAMEPLAY:\n"+
                           "-The game includes several landmarks along the trail where players can make decisions, shop for supplies or rest.\n"+
                           "-An important aspect of the game was the ability to hunt. Using guns and bullets bought over the course of play.\n"+
                           "-Throughout the course of the game, members of the player's party could fall ill and not rest, causing further harm to the victim.\n"+
                           "-At the conclusion of the journey, a player's score is determined in two stages. In the first stage, the program awards a \"raw\" or unscaled number of points for each remaining family member\n"+
                           "In the second stage, the program multiplies this raw score depending on the party's initial level of resources determined by the profession of the party's leader\n");
            System.out.print("Press \"C\"to continue");
            Scanner userInput = new Scanner(System.in);
            
            String userInputted = userInput.nextLine(); //Get the value entered from the keybord
            userInputted = userInputted.trim();
            
            if (userInputted.length() < 1){
               System.out.println("You must press \"C\"to continue");
               continue;
            }
            inputs[0] = userInputted;
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs [0];
        menuItem = menuItem.toUpperCase();
        
        if (menuItem != "C"){
        return true;
        }
        else{
        System.out.println("Please press \"C\" to continue to Main Menu\n"+
                "Advice: You should follow the instructions to make it to the Game\n");
        }
        
        return true;
    }
    
}



