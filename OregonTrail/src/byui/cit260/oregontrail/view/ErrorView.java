/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author Amon Bernardo
 */
public class ErrorView {
    private static PrintWriter logFile = OregonTrail.getOutFile();
    private static PrintWriter log = OregonTrail.getLogFile();
    
    public static void display(String className, String errorMessage){
        logFile.println(""
                + "\n--- ERROR --------------------------------------"
                + "\n" + errorMessage
                + "\n------------------------------------------------");
        
        log.printf("%n%n%S", className + " - " + errorMessage);
    }
}
