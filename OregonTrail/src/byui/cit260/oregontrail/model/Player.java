/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Amon Bernardo
 */
public class Player implements Serializable{
    
    //Player attributes
    private String name;
    private String occupation;
    private ArrayList<Game> games = new ArrayList<Game>();
    
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

 //List of game object functions
    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
// Override Object properties by functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.occupation);
        return hash;
    
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", occupation=" + occupation + '}';
    }
 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.occupation, other.occupation)) {
            return false;
        }
        return true;
    }
  
}
