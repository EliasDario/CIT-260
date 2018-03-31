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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Amon Bernardo
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = new Game();
    private static Player player = new Player();
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try{
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
            
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
        }catch (Exception e){
            System.out.println("Some error occured: " + e.getMessage());
        }
        finally{
            try {
                if (inFile != null)
                    inFile.close();
                if (outFile != null)
                    outFile.close();
                if (logFile != null)
                    logFile.close();
            } catch (IOException ex) {
                
                System.out.println("Error to close the input or output");
                return;
            }
        }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        OregonTrail.inFile = inFile;
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
