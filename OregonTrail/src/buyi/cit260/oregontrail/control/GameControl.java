/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Player;
import oregontrail.OregonTrail;

/**
 *
 * @author Elías
 */
public class GameControl {
    public static int gamePunctuation (String occupation, int actorQty, int actorHealthy, int fund){
        int point = 0;
        if (occupation == "banker" || occupation == "carpenter" || occupation == "farmer"){
            if (actorQty >= 0 && actorQty <= 5){
                if (actorHealthy >= 0 && actorHealthy <= 5){
                    if (fund >= 0 && fund <= 999){
                        if (occupation == "banker"){
                            point = (actorQty + fund + actorHealthy) * 1;
                            return point;
                        }
                        else if (occupation == "carpenter"){
                            point = (actorQty + fund + actorHealthy) * 2;
                            return point;
                        }
                        else if (occupation == "farmer"){
                            point = (actorQty + fund + actorHealthy) * 3;
                            return point;
                        }
                    } 
                    else {return -1;}
                }
                else {return -1;}
            }
            else {return -1;}
        }
        else {return -1;}
    return -1;  
    }

    public static Player savePlayer(String name) {
        if (name == null || name.length() < 1){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        OregonTrail.setPlayer(player); // save the player
        return player;
    }

    public static void createNewGame(Player player) {
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      */
       System.out.println("this method was called");
}
    
}
