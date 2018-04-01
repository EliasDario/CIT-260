/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author lucia
 */
public class SaveGameView extends View {
 
    public SaveGameView() {
        super("Save Your Game if you do not want to lose your progress.\n"
            + "S - Save Game "
            + "Q - Quit ");
    }
    @Override
    public boolean doAction(String value) {
        switch(value.toUpperCase()){
            case "C":
                this.saveGame();
                return true;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "You must choose an option.");
                return false;
        }
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
    
}
