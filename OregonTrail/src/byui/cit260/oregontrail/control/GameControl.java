/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import buyi.cit260.oregontrail.exceptions.GameControlException;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.ActorType;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.ItemType;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.RegularSceneType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import oregontrail.OregonTrail;

/**
 *
 * @author Elías
 */
public class GameControl {
    
    public static int gamePunctuation (String occupation, int actorQty, int actorHealthy, int fund) throws GameControlException{       
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
                    else {throw new GameControlException("The actor funds must be between 0 and 999");}
                }
                else {throw new GameControlException("The actor healthy status must be between 0 and 5");}
            }
            else {throw new GameControlException("The actor quantity must be between 0 and 5.");}
        }
        else {
            throw new GameControlException("The actor occupation must be \"banker\" or \"farmer\" or \"carpenter\"");
        }
        throw new GameControlException("Some error occured");  
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

    public static void createNewGame(Player player) throws GameControlException{
        if (player == null){
            throw new GameControlException("Player wasn't created, revise the input.");
        }
        int noOfRows = 3;
        int noOfColumns = 3;
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
        InventoryItem[] items = new InventoryItem[5];
        items = createItems();
        game.setInventoryItem(items);
        //Map
        Map map = new Map();
        map = MapControl.createMap(noOfRows, noOfColumns);
        if (map == null){
            throw new GameControlException("The map wasn't created, revise the input.");
        }
        game.setMap(map);

    }
    
    public static void saveGame(Game game, String filePath) throws GameControlException, IOException{
        if (game == null){
            throw new GameControlException("ERROR: game is null");
        }
        else if (filePath == null || filePath.length() < 1){
            throw new GameControlException("ERROR: path is null or less than 1.");
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){
            out.writeObject(game);
        }
    }

    private static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[5];
        
        //oxen
        InventoryItem oxen = new InventoryItem();
        oxen.setGame(OregonTrail.getCurrentGame());
        oxen.setInventoryType("Oxen");
        items[ItemType.oxe.ordinal()] = oxen;
        
        //food
        InventoryItem food = new InventoryItem();
        food.setGame(OregonTrail.getCurrentGame());
        food.setInventoryType("Oxen");
        items[ItemType.food.ordinal()] = food;
        
        //clothing
        InventoryItem clothing = new InventoryItem();
        oxen.setGame(OregonTrail.getCurrentGame());
        oxen.setInventoryType("clothing");
        items[ItemType.clothing.ordinal()] = clothing;
        
        //ammunition
        InventoryItem ammunition = new InventoryItem();
        oxen.setGame(OregonTrail.getCurrentGame());
        oxen.setInventoryType("ammunition");
        items[ItemType.ammunition.ordinal()] = ammunition;
        
        //spareParts
        InventoryItem spareParts = new InventoryItem();
        oxen.setGame(OregonTrail.getCurrentGame());
        oxen.setInventoryType("spareParts");
        items[ItemType.spareParts.ordinal()] = spareParts;
        
        //returning items
        return items;

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

    public static Game getGame(String filePath) throws GameControlException, IOException, ClassNotFoundException{
        if (filePath == null || filePath.length() < 1){
            throw new GameControlException();
        }
        try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream(filePath)))
        {
            Game game = (Game) inp.readObject();
            OregonTrail.setCurrentGame(game);
            
            OregonTrail.setPlayer(game.getPlayer());
            return game;
        }

        
    }
    
}
