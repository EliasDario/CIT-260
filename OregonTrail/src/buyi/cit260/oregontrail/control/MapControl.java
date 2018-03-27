/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.RegularSceneType;
import byui.cit260.oregontrail.model.RegularSceneTypeEnum;

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
        map.setRowCount(noOfColumns);
        map.setColumnCount(noOfColumns);
        
        Location[][] locations = createLocations(noOfRows, noOfRows);
        map.setLocations(locations);
        
        RegularSceneType[] scenes = new RegularSceneType[3];
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
        scene1.setDescription(RegularSceneTypeEnum.Idaho.name());
        scenes[RegularSceneTypeEnum.Idaho.ordinal()] = scene1;
        //scene2
        RegularSceneType scene2 = new RegularSceneType();
        scene2.setDescription(RegularSceneTypeEnum.Oregon.name());
        scenes[RegularSceneTypeEnum.Oregon.ordinal()] = scene2;
        //scene3
        RegularSceneType scene3 = new RegularSceneType();
        scene1.setDescription(RegularSceneTypeEnum.Washton.name());
        scenes[RegularSceneTypeEnum.Washton.ordinal()] = scene3;
        
        return scenes;
        
    }

    private static void assignScenesToLocations(RegularSceneType[] scenes, 
                                                Location[][] locations){
        locations[0][0].setRegularSceneType(scenes[RegularSceneTypeEnum.Idaho.ordinal()]);
        locations[0][1].setRegularSceneType(scenes[RegularSceneTypeEnum.Oregon.ordinal()]);
        locations[0][2].setRegularSceneType(scenes[RegularSceneTypeEnum.Washton.ordinal()]);
        
    }
}
