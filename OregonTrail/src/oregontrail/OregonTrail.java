/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.InventoryItem;




/**
 *
 * @author Amon Bernardo
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // -----------* made by Amon *---------------
       
        Player amon = new Player("Amon"); //it is a instance of Player class.
        Actor warrior = new Actor ("Amon", "Warrior");//instance of Actor class.
        Map mordor = new Map();//instance of Map class.
        
        mordor.setDescription("Mordor is a place where live Sauron."); //setter method for the map object.
        warrior.setName("Anakin"); //setter method for the Actor object.        
        amon.setName("Amon Silva"); //setter method for the Player object.
        
        System.out.println(amon.toString()); //ToString() for Player.
        System.out.println(warrior.toString()); //ToString() for Actor.
        System.out.println(mordor.toString()); //ToString() for Map.
   
        // -----------* made by lucia *---------------
        Player lucia = new Player ("Lucia");// it is a instance of a class
        Game one = new Game(lucia);
        lucia.setName("Elias"); //setter method
        
        System.out.println(lucia.toString());//calling ToString()
        System.out.println(one.toString());
        
        InventoryItem food = new InventoryItem();
        food.setInventoryType("Milk");// setter method fo the InventoryItem object
        System.out.println(food.toString());

    }
    
}
