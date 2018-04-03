/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.RegularSceneType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amon Bernardo
 */
class ReportMenuView extends View{

    public ReportMenuView() {
        super("--Report Menu view--\n"
            + "L - Location Report\n"
            + "I - Inventory Item report");
    }

    private String[] getInputsLocation(){
        
        String[] inputs = new String[1];
        console.println("Type the game path; ");
        String input1 = getInput();
        inputs[0] = input1;
        return inputs;        
    }
    
    @Override
    public boolean doAction(String value) {
        switch (value.toUpperCase()){
            case "L":
        {
            try {
                locationReport();
            } catch (IOException | ClassNotFoundException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
                
            }
            return true;
        }
            
            case "I":
                inventoryItemReport();
                return true;
            case "Q":
                 return true;
            default:
                System.out.println("Type a valid value.");
                return false;
        }
    }

    private void locationReport() throws FileNotFoundException, IOException, ClassNotFoundException {
        String filePath = getInputsLocation()[0];
        try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream(filePath))){
            Game game = (Game) inp.readObject();
            Location[][] locations = game.getMap().getLocations();
            
            for (int row = 0; row < locations.length; row++){
                for (int col = 0; col < locations[row].length; col++){
                    Location location = locations[row][col];
                    if (location != null){
                        RegularSceneType scene = new RegularSceneType();
                        scene = location.getRegularSceneType();
                        console.println(scene.getDescription());
                    }
                    else {break;}
                    
                }
            }
            
        }
    }

    private void inventoryItemReport() {
        System.out.println(this.getClass().getName() + " inventoryItemReport method called");
    }
}
