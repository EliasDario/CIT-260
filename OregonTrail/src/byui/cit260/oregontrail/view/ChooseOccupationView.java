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
public class ChooseOccupationView extends View{
    public ChooseOccupationView(){
    super ("\nCHOOSE OCCUPATION:\n" +
            "1 - Banker from Boston\n" +
            "2 - Carpenter from Ohio\n" +
            "3 - Farmer from Illinois\n" +
            "4 - Which one should I choose\n" +
            "What is your choice?");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
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
