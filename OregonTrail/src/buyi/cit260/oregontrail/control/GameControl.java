/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.ActorType;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import java.util.ArrayList;
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

    public static int createNewGame(Player player) {
        if (player == null){
            return -1;
        }
        int noOfRows = 0;
        int noOfColumns = 0;
        //Game
        Game game = new Game();
        game.setPlayer(player);
        OregonTrail.setCurrentGame(game);
        //Actor
        Actor actors[] = new Actor[5];
        actors = createActors();
        game.setActor(actors);
        player.setActor(actors);
        //items
        ArrayList<InventoryItem> items = new ArrayList<InventoryItem>();
        items = createItems();
        game.setInventoryItem(items);
        //Map
        Map map = new Map();
        map = createMap(noOfRows, noOfColumns);
        if (map == null){
            return -1;
        }
        game.setMap(map);
        return 1; // indicates success 
    }

    public static void saveGame() {
        System.out.println("\nsaveGame() called.\n");
    }

    private static ArrayList<InventoryItem> createItems() {
        System.out.println("CreateItem Mehtod called.");
        ArrayList<InventoryItem> someItem = new ArrayList<>();
        return someItem;
    }

    private static Map createMap(int noOfRows, int noOfColumns) {
        System.out.println("Create Map created");
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
        return map;
    }

    private static Actor[] createActors() {
        Actor[] actors = new Actor[5];
        
        //Actor1
        Actor actor1 = new Actor();
        actor1.setName("Amon");
        actor1.setOcuppation("Farmar");
        actors[ActorType.Amon.ordinal()] = actor1;
        //Actor2
        Actor actor2 = new Actor();
        actor2.setName("Lucia");
        actor2.setOcuppation("Farmar");
        actors[ActorType.Lucia.ordinal()] = actor2;
        //Actor3
        Actor actor3 = new Actor();
        actor3.setName("Joseph");
        actor3.setOcuppation("Farmar");
        actors[ActorType.Joseph.ordinal()] = actor3;
        //Actor4
        Actor actor4 = new Actor();
        actor4.setName("Nefi");
        actor4.setOcuppation("Farmar");
        actors[ActorType.Nephi.ordinal()] = actor4;
        //Actor5
        Actor actor5 = new Actor();
        actor5.setName("Moroni");
        actor5.setOcuppation("Farmar");
        actors[ActorType.Moroni.ordinal()] = actor5;
        
        return actors;
    }
    
}
