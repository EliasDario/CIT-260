/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

import buyi.cit260.oregontrail.exceptions.MapControlException;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class MoveActorControl {
    public static Location moveActor(Actor actor, int row, int column) throws MapControlException{
        if (actor == null){
            throw new MapControlException();
        }
        Game game = OregonTrail.getCurrentGame();
        Map map = game.getMap();
        Location locations = map.getLocation();
        if (row < 1 || row > map.getRowCount()
                || column < 1 || column > map.getColumnCount()){
            throw new MapControlException();
        }
        int currentRow = actor.getLocation().getRow();
        int currentColumn = actor.getLocation().getColumn();
        Location oldLocation = 

// currentRow = get the row from the actor
// currentColumn = get the column from the actor
// oldLocation = get the location from the locations
// array at the current row and column
// newLocation = get the location at the new row and column
// set actor in the oldLocation to null
// set actor in the newLocation to the actor
// set row in actor to newRow
// set column in actor to newColumn
// return newLocation 
    }
}
