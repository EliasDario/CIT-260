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
public class Game implements Serializable{
    private double totalTime;
    private Player player;
    private Actor[] actor;
    private Map map;
    private InventoryItem[] inventoryItem = new InventoryItem[5];

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.player);
        hash = 31 * hash + Arrays.deepHashCode(this.actor);
        hash = 31 * hash + Objects.hashCode(this.map);
        hash = 31 * hash + Arrays.deepHashCode(this.inventoryItem);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

    public InventoryItem[] getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem[] inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    
    public Game(){}
    
    public Game(Player player) {
        this.totalTime = totalTime;
        this.player = player;
        this.actor = actor;
        this.map = map;
    }
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
   
}
