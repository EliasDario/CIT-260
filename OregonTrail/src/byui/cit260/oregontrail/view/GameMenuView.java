/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.MapControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.RegularSceneTypeEnum;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class GameMenuView extends View{

    public GameMenuView() {
        super("V - View map\n"
            + "I - View list of items\n"
            + "M - Move person to new location\n"
            + "H - Help\n"
            + "S - Save the game\n"
            + "Q - Quit\n\n"
            + "Choose some option above: ");
    }

    @Override
    public boolean doAction(String value) {
        switch(value.toUpperCase()){
            case "V":
                this.displayMap();
                return true;
            case "I":
                this.viewInventory();
                return true;
            case "M":
                this.movePerson();
                return true;
            case "S":
                this.saveGame();
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "You must enter a value.");
                return false;
        }
    }

    private void displayMap() {
        Game game = OregonTrail.getCurrentGame();
        
        Location[][] locations = MapControl.createMap(3, 3).getLocations();
        System.out.println("Mapa of Oregon Trail Game");
        for (int i = 0; i < locations[0].length; i++){
            System.out.print(" | " + i + " ");
            
        }
            System.out.print(" |");
        for (int row = 0; row < locations.length; row++){
            System.out.println("\n---------------------------------------\n");
            System.out.print(row);
            
            for(int col = 0; col < locations[row].length; col++){
                System.out.print("|");
                Location location = locations[row][col];
                if (location.getVisited() == true){
                    String mapSymbol = RegularSceneTypeEnum.Idaho.name();
                    System.out.print(" " + mapSymbol + " ");
                }
                else {
                    System.out.print(" ?? ");
                }
            }
            System.out.print("|");
        }
        System.out.println("\n---------------------------------------\n");
    }

    private void viewInventory() {
        System.out.println("viewInventory");
    }

    private void movePerson() {
        System.out.println("movePerson");
    }
    
    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
    
}
