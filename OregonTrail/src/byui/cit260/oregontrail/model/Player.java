/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
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
    private int currentRow = 0;
    private int currentColumn = 0;
    
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

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.wagonHealth);
        hash = 59 * hash + Objects.hashCode(this.game);
        hash = 59 * hash + Arrays.deepHashCode(this.actor);
        hash = 59 * hash + this.currentRow;
        hash = 59 * hash + this.currentColumn;
        return hash;
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
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.wagonHealth, other.wagonHealth)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", wagonHealth=" + wagonHealth + ", game=" + game + ", actor=" + actor + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }


  
}
