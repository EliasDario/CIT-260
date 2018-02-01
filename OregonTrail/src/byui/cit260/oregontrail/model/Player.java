/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Amon Bernardo
 */
public class Player implements Serializable{
    
    //Player attributes
    private String name;
    private String occupation;
    
    //Name functions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Occupation functions
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
  
}
