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
    private int health;
    private int Life;

    public Actor() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLife() {
        return Life;
    }

    public void setLife(int Life) {
        this.Life = Life;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.health;
        hash = 71 * hash + this.Life;
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", health=" + health + ", Life=" + Life + '}';
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
        if (this.health != other.health) {
            return false;
        }
        if (this.Life != other.Life) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
