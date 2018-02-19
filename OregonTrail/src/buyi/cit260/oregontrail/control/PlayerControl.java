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
    
    //made by Lucia.
    
    public static String chooseOccupation(String playerOccupation){
    
        String banker = "$1600";
        String carpenter = "$800";
        String farmer = "$400";
        String error = "Error please enter one of the numbers of the options";
        
        if ( playerOccupation.equals("1")) { // occupation is banker
            return banker;
        }
        if ( playerOccupation.equals("2")) { // occupation is carpenter
            return carpenter;
        }
        if ( playerOccupation.equals("3")) { // occupation is farmer
            return farmer;
    }
        if ( !playerOccupation.equals("1") || !playerOccupation.equals("2") || !playerOccupation.equals("3") ) { // occupation is banker
            return error; }
        
        
    }
