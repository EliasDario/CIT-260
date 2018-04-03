/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.exceptions.GameControlException;
import byui.cit260.oregontrail.control.GameControl;
import java.io.IOException;

/**
 *
 * @author Amon Bernardo
 */
public class StartSavedGameView extends View {

    public StartSavedGameView() {
        super("---Start saved Game View---\n"
                + "Type \'Q\' to quit menu or any other letter to continue\n");
    }

    private String[] getInputs(){
        String[] inputs = new String[1];
        System.out.println("Type game path: ");
        String input1 = getInput();
        inputs[0] = input1;
        
        return inputs;        
    }
    
    @Override
    public boolean doAction(String inputs) {
        String filePath = getInputs()[0];
        try{
            GameControl.getGame(filePath);
        }
        catch (GameControlException | IOException | ClassNotFoundException ex ){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();

    return true;
    }
    
}
