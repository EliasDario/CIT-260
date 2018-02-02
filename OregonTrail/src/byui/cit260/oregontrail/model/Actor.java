/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.util.Objects;

/**
 *
 * @author lucia
 */
public class Actor {
    
    private String name;
    private String healthStatus = "Health"; //Here will show if the actor are sick, heatlh, etc.
    private String ocuppation; // I think that is better to put occupation here than in Player.
    //private Point point; //Future class.
    private int Life;

    public Actor(String name, String ocuppation) {
        this.name = name;
        this.ocuppation = ocuppation;
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

    public int getLife() {
        return Life;
    }

    public void setLife(int Life) {
        this.Life = Life;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.healthStatus);
        hash = 43 * hash + Objects.hashCode(this.ocuppation);
//        hash = 43 * hash + Objects.hashCode(this.point);
        hash = 43 * hash + this.Life;
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
        if (this.Life != other.Life) {
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
        return "Actor{" + "name=" + name + ", healthStatus=" + healthStatus + ", ocuppation=" + ocuppation + /*", point=" + point +*/ ", Life=" + Life + '}';
    }
    
    
    
    
    
}