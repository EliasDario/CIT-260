/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author Elías
 */
public class Wagon  implements Serializable{
   private  String fund;
   private String item;
   private double price; 
   private double travelday;
   private Actor[] actor = new Actor[5];

    public Wagon(String fund, String item, double price, double travelday) {
        this.fund = fund;
        this.item = item;
        this.price = price;
        this.travelDay = travelDay;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTravelday() {
        return travelday;
    }

    public void setTravelday(double travelday) {
        this.travelday = travelday;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.fund);
        hash = 79 * hash + Objects.hashCode(this.item);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.travelday) ^ (Double.doubleToLongBits(this.travelday) >>> 32));
        hash = 79 * hash + Arrays.deepHashCode(this.actor);
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
        final Wagon other = (Wagon) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelday) != Double.doubleToLongBits(other.travelday)) {
            return false;
        }
        if (!Objects.equals(this.fund, other.fund)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "fund=" + fund + ", item=" + item + ", price=" + price + ", travelday=" + travelday + ", actor=" + actor + '}';
    }
    
    
   
}
