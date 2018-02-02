/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
/**
 *
 * @author Elías
 */
public class Animal implements Serializable {
private String name;
private double pound;

    public Animal(String name, double pound) {
        this.name = name;
        this.pound = pound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPound() {
        return pound;
    }

    public void setPound(double pound) {
        this.pound = pound;
    }

}
