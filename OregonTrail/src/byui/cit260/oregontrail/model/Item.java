/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author Amon Bernardo
 */
public class Item {
    private int price;
    private String description;
    private String type;
    
    
    public Item (){
    }
    public Item(int price, String description, String type){
        this.price = price;
        this.description  = description;
        this.type = type;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
