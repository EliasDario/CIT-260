/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Amon Bernardo
 */
public class SimulateGamePoint {
    public SimulateGamePoint(){}
    
    public void displaySimulateGamePoint(){
        boolean endOfView = false;
        do{
            String[] player = new String[4];
            player = getInput();
            endOfView = doAction(player);
        }while (endOfView != true);
        return;
}

    private String[] getInput() {
        String[] player = new String[4];
        boolean verify = false;
        int actQty = -1;
        int actHealthy = -1;
        int playerFund = -1;
        String playerOccupation = new String();
        do{
            if (actQty < 0 || actQty > 5){
                System.out.println("Enter the actor quantity number (0-5): ");
                
                Scanner sc = new Scanner(System.in);
                String[] input = new String[1];
                input[0] = sc.nextLine();
                
                actQty = Integer.parseInt(input[0]);
                if (actQty < 0 || actQty > 5){
                    System.out.println("\nactor quantity incorrect. Please, type again.");
                    continue;
                }
            }
            if (actHealthy < 0 || actHealthy > 5){
                System.out.println("Enter the actor healthy number (0-5): ");
                Scanner sc = new Scanner(System.in);
                String[] input = new String[1];
                input[0] = sc.nextLine();
                actHealthy = Integer.parseInt(input[0]);
                if (actHealthy < 0 || actHealthy > 5){
                    System.out.println("\nactor healthy number incorrect. Please, type again.");
                    continue;
                }
            }
            if (playerFund < 0 || playerFund > 999){
                System.out.println("Enter the player fund number (0-999): ");
                
                Scanner sc = new Scanner(System.in);
                String[] input = new String[1];
                input[0] = sc.nextLine();
                
                playerFund = Integer.parseInt(input[0]);
                if (playerFund < 0 || playerFund > 999){
                    System.out.println("\nplayer fund incorrect. Please, type again.");
                    continue;
                }
            }
            if (playerOccupation != "banker" || playerOccupation != "farmer" || playerOccupation != "carpenter"){
                System.out.println("Enter the player occupation: ");
                
                Scanner sc = new Scanner(System.in);
                String[] input = new String[1];
                input[0] = sc.nextLine();
                
                if (input[0].equals("banker")){
                    playerOccupation = "banker";
                }else if (input[0].equals("farmer")){
                    playerOccupation = "farmer";
                }else if(input[0].equals("carpenter")){
                    playerOccupation = "carpenter";
                }else {
                    System.out.println("\nOccupation incorrect. Please, type again.");
                    continue;
                }
                
            }

            player[0] = Integer.toString(actQty);
            player[1] = Integer.toString(actHealthy);
            player[2] = Integer.toString(playerFund);
            player[3] = playerOccupation;
            verify = true;
        }while (verify != true);
        return player;
    }
    
    private boolean doAction(String[] player) {
       System.out.println("\nThe Punctions Simulations results is: " + simulateGamePunctuation(player));
       return true;


    }

    private String simulateGamePunctuation(String[] player) {
        int point = GameControl.gamePunctuation(player[3], Integer.parseInt(player[0]), Integer.parseInt(player[1]), Integer.parseInt(player[2]));
        return Integer.toString(point);
    }
    
}


