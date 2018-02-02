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
public class Wagon  implements Serializable{
   private  String fund;
   private String item;
   private double price; 
   private double travelDay;

    public Wagon(String fund, String item, double price, double travelDay) {
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

    public double getTravelDay() {
        return travelDay;
    }

    public void setTravelday(double travelDay) {
        this.travelDay = travelDay;
    }
   
}
