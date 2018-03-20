/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author lucia
 */
public class Actor implements Serializable{
    
    private String name;
    private String healthStatus = "Health"; //Here will show if the actor are sick, heatlh, etc.
    private String ocuppation; // I think that is better to put occupation here than in Player.
    //private Point point; //Future class.
    private int life;
    private Player player;
    private Game game;
    private ArrayList<Wagon> wagon = new ArrayList<Wagon>();
    private Location location;

    public Actor(){}
    public Actor(String name, String ocuppation) {
        this.name = name;
        this.ocuppation = ocuppation;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<Wagon> getWagon() {
        return wagon;
    }

    public void setWagon(ArrayList<Wagon> wagon) {
        this.wagon = wagon;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getOcuppation() {
        return ocuppation;
    }

    public void setOcuppation(String ocuppation) {
        this.ocuppation = ocuppation;
    }

    /*public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }*/

    public int getlife() {
        return life;
    }

    public void setlife(int life) {
        this.life = life;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.healthStatus);
        hash = 43 * hash + Objects.hashCode(this.ocuppation);
//        hash = 43 * hash + Objects.hashCode(this.point);
        hash = 43 * hash + this.life;
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
        final Actor other = (Actor) obj;
        if (this.life != other.life) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.healthStatus, other.healthStatus)) {
            return false;
        }
        if (!Objects.equals(this.ocuppation, other.ocuppation)) {
            return false;
        }
        /*if (!Objects.equals(this.point, other.point)) {
            return false;
        }*/
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", healthStatus=" + healthStatus + ", ocuppation=" + ocuppation + /*", point=" + point +*/ ", life=" + life + '}';
    }
    
    
    
    
    
}
