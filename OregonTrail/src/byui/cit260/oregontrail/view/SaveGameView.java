/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.exceptions.GameControlException;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import java.io.IOException;
import oregontrail.OregonTrail;

/**
 *
 * @author lucia
 */
public class SaveGameView extends View {
 
    public SaveGameView() {
        super("---Save Game View---\n"
                + "Type \'Q\' to quit menu or any other letter to continue\n");
    }
    private String[] getInputs(){
        String[] inputs = new String[1];
        System.out.println("\nSave Your Game if you do not want to lose your progress.\n" +
                            "Where do you want to save your game? \n");
        String input1 = this.getInput();
        inputs[0] = input1;
        return inputs;
    }
    
    @Override
    public boolean doAction(String value) {
        String filePath = getInputs()[0];
        Game game = OregonTrail.getCurrentGame();
        try{
            GameControl.saveGame(game, filePath);
        }
        catch (GameControlException e){
            ErrorView.display("\n" + this.getClass().getName(), e.getMessage());
            return false;
        } 
        catch (IOException ex){
            ErrorView.display("\n" + this.getClass().getName(), ex.getMessage());
            return false;
        }
        System.out.println("\nSuccess to save the game!");
        return true;
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
    
}
