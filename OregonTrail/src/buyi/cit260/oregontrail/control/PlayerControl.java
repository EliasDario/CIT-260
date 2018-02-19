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
    public static String changeWagonHealth( String ration, String pace, String weather) {
     
    //variables declaration
    
    String wagonHealth;
    String errorMessage = "Please, enter the correct option";
    
        // testing inputs
//        if (!(ration ==  "filling") || !(ration == "meager") || !(ration == "bare bones")){
//         return errorMessage; }
//        
//       else if (!(pace == "steady") || !(pace == "strenuous") || !(pace == "gruelling")){
//         return errorMessage; }
//        
//       else if (!(weather == "rainy") || !(weather == "sunny")  || !(weather == "snowy") || !(weather == "clowdy")){
//        return errorMessage; }
        
        //Algoritm
        if(ration == "filling"){
            wagonHealth = "good";
        }
        
        else if(ration == "bare bones"){
            wagonHealth = "bad";
        }
        
        else if(ration == "meager" && pace == "steady" && (weather == "sunny" || weather == "clowdy")){
            wagonHealth = "good";}
            else{
                    wagonHealth = "bad";
                    }
            return wagonHealth;
    }
    
    //made by Lucia.
    
    public static String chooseOccupation(String playerOccupation){
    
        String banker = "$1600";
        String carpenter = "$800";
        String farmer = "$400";
        String error = "Error, please enter one of the numbers of the options";
        
        if ( playerOccupation.equals("1")) { // occupation is banker
            return banker;
        }
        if ( playerOccupation.equals("2")) { // occupation is carpenter
            return carpenter;
        }
        if ( playerOccupation.equals("3")) { // occupation is farmer
            return farmer;
    }
        if ( !playerOccupation.equals("1") || !playerOccupation.equals("2") || !playerOccupation.equals("3") ) { //return error
            return error; }
            return playerOccupation;
    }
}