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
import byui.cit260.oregontrail.view.QuitMenuView;
import byui.cit260.oregontrail.view.SimulateGamePointView;
import byui.cit260.oregontrail.view.StartProgramView;






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
