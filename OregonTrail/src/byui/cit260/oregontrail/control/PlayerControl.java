/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import buyi.cit260.oregontrail.exceptions.PlayerControlException;

/**
 *
 * @author Elías
 */
public class PlayerControl {
    public static String changeWagonHealth( String ration, String pace, String weather) throws PlayerControlException{
     
    //variables declaration
    
        String wagonHealth;

        ration = ration.toLowerCase();
        pace = pace.toLowerCase();
        weather = weather.toLowerCase();

        if (ration != "filling" && ration != "bare bones" &  ration != "meager"){
            throw new PlayerControlException("Some internal error happened with ration, sorry");
        } 
        if (pace !="stead" && pace != "strenuous" && pace != "gruelling"){
            throw new PlayerControlException("Some internal error happened with pace, sorry");
        }
        if (weather != "sunny" && weather != "clowdy" && weather != "cold"){
             throw new PlayerControlException("Some internal error happened with weather, sorry");
        }
        //Algoritm        
        if(ration == "filling"){
            wagonHealth = "good";
        }

        else if(ration == "bare bones"){
            wagonHealth = "bad";
        }

        else if(ration == "meager" && pace == "steady" && (weather == "sunny" || weather == "clowdy")){
            wagonHealth = "good";
        }
        else{
            wagonHealth = "bad";
        }


        return wagonHealth;
    }
    
    //made by Lucia.
    
    public static String chooseOccupation(int playerOccupation) throws NumberFormatException{
    
        String banker = "$1600";
        String carpenter = "$800";
        String farmer = "$400";
        
        if ( playerOccupation == 1) { // occupation is banker
            return new String("Banker start with $") + banker;
        }
        if ( playerOccupation == 2) { // occupation is carpenter
            return new String("Carpenter start with $") + carpenter;
        }
        if ( playerOccupation == 3) { // occupation is farmer
            return new String("Farmer start with $") + farmer; 
        }
        throw new NumberFormatException("Some internal error happened with player occupation number, sorry."); 

    }
}

    
        // testing inputs
//        if (!(ration ==  "filling") || !(ration == "meager") || !(ration == "bare bones")){
//         return errorMessage; }
//        
//       else if (!(pace == "steady") || !(pace == "strenuous") || !(pace == "gruelling")){
//         return errorMessage; }
//        
//       else if (!(weather == "rainy") || !(weather == "sunny")  || !(weather == "snowy") || !(weather == "clowdy")){
//        return errorMessage; }