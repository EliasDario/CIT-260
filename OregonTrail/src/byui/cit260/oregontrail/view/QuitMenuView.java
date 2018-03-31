/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Amon Bernardo
 */
public class QuitMenuView {
    public QuitMenuView(){}
    public void displayQuitMenu(){
        boolean endOfView = false;
        do{
            String[] input = new String[1];
            input[0] = inputQuitMenu();
            if (input[0] == "C"){
                return;
            }
            endOfView = doActionQuitMenu(input);
        }while (endOfView != true);
        return;
    }

    private String inputQuitMenu() {
        String[] input = new String[1];
        System.out.println("********** The Oregon Trail **********\n" +
            "* 1. Save and Quit *\n" +
            "* 2. Quit *\n" +
            "* \"C\" to Continue *\n" +
            "*---------- What is your choice? *\n" +
            "***********************************");
        boolean valid = false;
        while (valid == false){
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            userInput = userInput.trim();
            if (userInput.length() < 1){
                System.out.println("blank value.\n"
                        + " Please, choose one option above");
                continue;
            }
            input[0] = userInput;
            valid = true;
        }
        return input[0];
    }

    private boolean doActionQuitMenu(String[] input) {
        String[] menuItem = new String[1];
        menuItem[0] = input[0];
        menuItem[0] = menuItem[0].toUpperCase();
        switch (menuItem[0]){
            case "1": GameControl.saveGame();
                return true;
            case "2": 
                System.out.println("\nCheck back often!\n");
                System.exit(0);
            case "C":
                return true;
            default: 
                ErrorView.display(this.getClass().getName(), "\nInvalid value. "
                        + "\nPlease, choose one option above.\n");
                return false;
        }
    }

}
