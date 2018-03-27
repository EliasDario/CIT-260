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
    private String wagonHealth;
    private ArrayList<Game> game = new ArrayList<Game>();
    private Actor[] actor;
    
    public Player() {
        
    }

    public String getWagonHealth() {
        return wagonHealth;
    }

    public void setWagonHealth(String wagonHealth) {
        this.wagonHealth = wagonHealth;
    }

//Doing it in the constructor, the object instance require the name and occupation.
    public Player(String name) {
        this.name = name;
    }
    
//Name functions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 //List of game object functions
    public ArrayList<Game> getGames() {
        return game;
    }

    public ArrayList<Game> getGame() {
        return game;
    }


    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }
    
    
// Override Object properties by functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.game);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", games=" + game + '}';
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
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return true;
    }


  
}
