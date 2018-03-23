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
class HelpMenuView extends View {

    public HelpMenuView(){
        super ("The original game was about the realities of 19th-century pioneer life on the Oregon Trail.\n"+
                           " The player assumes the role of a wagon leader guiding a party of settlers from Independence, Missouri, to Oregon's Willamette Valley via a covered wagon in 1848.\n"+
                           "GAMEPLAY:\n"+
                           "-The game includes several landmarks along the trail where players can make decisions, shop for supplies or rest.\n"+
                           "-An important aspect of the game was the ability to hunt. Using guns and bullets bought over the course of play.\n"+
                           "-Throughout the course of the game, members of the player's party could fall ill and not rest, causing further harm to the victim.\n"+
                           "-At the conclusion of the journey, a player's score is determined in two stages. In the first stage, the program awards a \"raw\" or unscaled number of points for each remaining family member\n"+
                           "In the second stage, the program multiplies this raw score depending on the party's initial level of resources determined by the profession of the party's leader\n");
    
    }

   
    @Override
    public boolean doAction(String value) {
        String menuItem = value;
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



