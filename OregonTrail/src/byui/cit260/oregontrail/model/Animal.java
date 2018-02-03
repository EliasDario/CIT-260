/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amon Bernardo
 */
public class Animal implements Serializable{

    private String name;
    private int pound;
    private RegularSceneType regularSceneType;

    Animal(String name, int pound) {
        this.name = name;
        this.pound = pound;
    }

    public String getName() {
        return name;
    }

    public int getPound() {
        return pound;
    }

    public RegularSceneType getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(RegularSceneType regularSceneType) {
        this.regularSceneType = regularSceneType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.pound;
        hash = 71 * hash + Objects.hashCode(this.regularSceneType);
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
        final Animal other = (Animal) obj;
        if (this.pound != other.pound) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.regularSceneType, other.regularSceneType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", pound=" + pound + ", regularSceneType=" + regularSceneType + '}';
    }
}