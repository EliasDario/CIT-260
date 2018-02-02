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
   private Double price; 
   private Double travelday;

    public Wagon(String fund, String item, Double price, Double travelday) {
        this.fund = fund;
        this.item = item;
        this.price = price;
        this.travelday = travelday;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTravelday() {
        return travelday;
    }

    public void setTravelday(Double travelday) {
        this.travelday = travelday;
    }
   
}
