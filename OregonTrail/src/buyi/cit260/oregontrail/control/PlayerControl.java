/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

/**
 *
 * @author Elías
 */
public class PlayerControl {
    public static int changePlayerHealth( int ration, int pace, int weather) {
    
        if (ration < 0 || ration >51){
        return -1; }
        
        if (pace != 1 || pace != 2 || pace != 3){
        return -1; }
        
        if (weather != 1 || weather != 2 || weather != 3 || weather != 4){
        return -1; }
        
        int playerHealth = playerHealth - (pace * weather);
        
        return playerHealth;
        
    }
}
