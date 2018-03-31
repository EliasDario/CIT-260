/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author lucia
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
    public View(){
    }
    public View(String message){
        this.displayMessage = message;
 
    } 
    @Override
    public void display(){
        String value;
        boolean done = false;
        do{
            //prompt for and get players name
            this.console.println(this.displayMessage);
            value = this.getInput();
            if (value.toUpperCase().equals("Q"))//user wants to quit
                return;
            done = this.doAction(value);
        }while (!done); // exit the view when done == true
    }

    @Override
    public String getInput(){

        boolean valid = false;
        String value = null;

        //While a valid name has not been retrieved
        while(!valid) {

            //prompt for the player's name
            //this.console.println("\n" + this.displayMessage);

            try {
                //get the value entered from the kerboyd
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                System.out.println("Some problem happened to read the value");
            }
            value = value.trim();

            if (value.length() < 1){ //blank value entered
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;//return the name
    }
   
}
