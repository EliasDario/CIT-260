/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.exceptions.MapControlException;
import byui.cit260.oregontrail.control.MapControl;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.RegularSceneType;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class MoveActorView extends View{

    public MoveActorView() {
        super("\n--Move your Actors--"
                + "\n Press \"Q\" to back menu or enter a value to continue: ");
    }

    @Override
    public boolean doAction(String value) {
        if (doAction(getInputs()) == true){
            return true;
        } else{
            return false;
        }
    }
    
    private String[] getInputs(){
        String[] inputs = new String[2];
        console.println("Enter a row value: ");
        String input1 = getInput();
        inputs[0] = input1;
        
        console.println("Enter a column value: ");
        String input2 = getInput();
        inputs[1] = input2;
        
        return inputs;
        
    }
    
    private boolean doAction(String[] inputs){
        String row = inputs[0];
        String col = inputs[1];
        
        int intRow = 0;
        int intCol = 0;
        
        try{
            intRow = Integer.parseInt(row);
            intCol = Integer.parseInt(col);
        }
        catch (NumberFormatException ex){
            ErrorView.display(this.getClass().getCanonicalName(), "You must enter only numbers");
            return false;
        }
        
        Player player = OregonTrail.getPlayer();
        Location newLocation;
        try{
            newLocation = MapControl.moveActor(player, intRow, intCol);
        }
        catch (MapControlException ex){
            ErrorView.display(this.getClass().getCanonicalName(), "Error to move actor.");
            return false;
        }
        if (newLocation.getRegularSceneType() == null){
            ErrorView.display(this.getClass().getCanonicalName(), "This place not exist yet.\n"
                    + "Try Row:1, Column:1, or "
                    + "Row:2, Column:2, or "
                    + "Row:3, Column:3.");
            return false;
        }else{
            console.println("You arrived in " + newLocation.getRegularSceneType().getDescription()+ "!");
            return true;
        }
        
    }
}
