/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.exceptions.GameControlException;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Actor;
import byui.cit260.oregontrail.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class ChooseActorNameView extends View{

    public ChooseActorNameView() {
        super("\n ----Choose your Actor Name -----"
                + "\n Press \"Q\" to back menu or enter a value to continue.\n");
    }

    @Override
    public boolean doAction(String value) {
        String names[] = new String[5];
        try {
            console.println("What is the name of your 1º actor? ");
            names[0] = keyboard.readLine();
            console.println("What is the name of your 2º actor? ");
            names[1] = keyboard.readLine();
            console.println("What is the name of your 3º actor? ");
            names[2] = keyboard.readLine();
            console.println("What is the name of your 4º actor? ");
            names[3] = keyboard.readLine();
            console.println("What is the name of your 5º actor? ");
            names[4] = keyboard.readLine();
            
            Actor[] actors = OregonTrail.getCurrentGame().getPlayer().getActor();
            actors = GameControl.setActorsName(names);
            
            console.println("Names setted succesfully");
            
        } catch (IOException | GameControlException ex) {
            ErrorView.display(this.getClass().getCanonicalName(), "\nSome error happened in the input or output process.");
            return false;
        } 

        return true;
    }
    
}
