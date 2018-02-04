/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Player;



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
       //made by AMon
        Player amon = new Player("Amon"); //it is a instance of a class.
        System.out.println(amon.toString()); //ToString().
        
           
        //made by lucia
        Player lucia = new Player ("Lucia");// it is a instance of a class
        Game one = new Game(lucia);
        lucia.setName("Elias"); //setter method
        
        System.out.println(lucia.toString());//calling ToString()
        System.out.println(one.toString());
        
        InventoryItem food = new InventoryItem("Milk");// It is a instance of a class
        System.out.println(food.toString());

    }
    
}
