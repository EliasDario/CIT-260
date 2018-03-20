/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
import buyi.cit260.oregontrail.control.ShopControl;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.view.GeneralStore;
import byui.cit260.oregontrail.view.QuitMenuView;
import byui.cit260.oregontrail.view.SimulateGamePointView;
import byui.cit260.oregontrail.view.StartProgramView;
import java.util.ArrayList;
/**
 *
 * @author Amon Bernardo
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
//        SimulateGamePointView simulateGamePoint = new SimulateGamePointView();
//        simulateGamePoint.displaySimulateGamePoint();
//        GeneralStore generalStore = new GeneralStore();
//        generalStore.display();        
//
//        ArrayList<Item> itemTest = new ArrayList<Item>();
//        Item testItem1 = new Item(100);
//
//        System.out.println ("Result: " + ShopControl.itemTotalPrice(itemTest));
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }
    
    
}
