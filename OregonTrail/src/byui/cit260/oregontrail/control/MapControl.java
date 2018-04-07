/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import buyi.cit260.oregontrail.exceptions.MapControlException;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.RegularSceneType;
import byui.cit260.oregontrail.model.RegularSceneTypeEnum;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class MapControl {
    
        public static Map createMap(int noOfRows, 
                                    int noOfColumns) {
        if (noOfRows < 0 || noOfColumns < 0){
            return null;
        }

        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);

        Location[][] locations = createLocations(noOfRows, noOfRows);
        map.setLocations(locations);
        
        RegularSceneType[] scenes;
        scenes = createScenes();
        
        assignScenesToLocations(scenes, locations);
        return map;
    }
    private static Location[][] createLocations(int rows, int columns){
        if (rows < 1 || columns <1){
            return null;
        }
        
        Location[][] locations = new Location[rows][columns];
        
        for (int row = 0; row < locations.length; row++){
            for (int col = 0; col < locations[row].length; col++){
                Location location = new Location();
                location.setRow(row);
                location.setColumn(col);
                location.setVisited(false);
                locations[row][col] = location;
            }
        }
        return locations;
    }
    
    
    private static RegularSceneType[] createScenes(){
        RegularSceneType[] scenes = new RegularSceneType[3];
        
        //scene1
        RegularSceneType scene1 = new RegularSceneType();
        scene1.setDescription("Idaho");
        scenes[RegularSceneTypeEnum.Idaho.ordinal()] = scene1;
        //scene2
        RegularSceneType scene2 = new RegularSceneType();
        scene2.setDescription("Oregon");
        scenes[RegularSceneTypeEnum.Oregon.ordinal()] = scene2;
        //scene3
        RegularSceneType scene3 = new RegularSceneType();
        scene3.setDescription("Washton");
        scenes[RegularSceneTypeEnum.Washton.ordinal()] = scene3;
        return scenes;
        
    }

    private static void assignScenesToLocations(RegularSceneType[] scenes, Location[][] locations){
        locations[0][0].setRegularSceneType(scenes[RegularSceneTypeEnum.Idaho.ordinal()]);
        locations[1][1].setRegularSceneType(scenes[RegularSceneTypeEnum.Oregon.ordinal()]);
        locations[2][2].setRegularSceneType(scenes[RegularSceneTypeEnum.Washton.ordinal()]);
    }
    
    public static Location moveActor(Player player, int newRow, int newColumn) throws MapControlException{
        
        if (player == null){
            throw new MapControlException();
        }
        Game game = OregonTrail.getCurrentGame();
        game.setPlayer(player);
        Map map = game.getMap();
        
        Location[][] locations = map.getLocations();
        if (newRow < 1 || newRow > map.getRowCount() 
                || newColumn < 1 || newColumn > map.getColumnCount()){
            throw new MapControlException();
        }
        int currentRow = player.getCurrentRow();
        int currentColumn = player.getCurrentColumn();
        Location oldLocation = locations[currentRow][currentColumn];
        
        Location newLocation = locations[newRow][newColumn];
        
        oldLocation.setPlayer(null);
        newLocation.setPlayer(player);
        player.setCurrentRow(currentRow);
        player.setCurrentColumn(currentColumn);
        
        return newLocation;
    }
}    

//ons = get the locations in the map
//if (newRow < 1 OR newRow > noOfRows in map OR
//newColumn < 1 OR newColumn > noOfColumns in map) then
//throw MapControlException
//endIf
//currentRow = get the row from the actor
//currentColumn = get the column from the actor
//oldLocation = get the location from the locations
//array at the current row and column
//newLocation = get the location at the new row and column
//set actor in the oldLocation to null
//set actor in the newLocation to the actor
//set row in actor to newRow
//set column in actor to newColumn
//return newLocation        if actor is null then
//throw MapControlException
//endIf
//game = get the currentGame in the main class
//map = get the map in the game object
//locations = get the locations in the map
//if (newRow < 1 OR newRow > noOfRows in map OR
//newColumn < 1 OR newColumn > noOfColumns in map) then
//throw MapControlException
//endIf
//currentRow = get the row from the actor
//currentColumn = get the column from the actor
//oldLocation = get the location from the locations
//array at the current row and column
//newLocation = get the location at the new row and column
//set actor in the oldLocation to null
//set actor in the newLocation to the actor
//set row in actor to newRow
//set column in actor to newColumn
//return newLocation
    
//}catch (Exception e){
//            System.out.println("Some error occured: " + e.getMessage());
//        }
