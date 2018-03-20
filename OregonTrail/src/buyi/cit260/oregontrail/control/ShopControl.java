/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Elías
 */
public class ShopControl {
    public static int itemTotalPrice (ArrayList<Item> items){ 
        int totalPrice = -1;
        if (items != null){
            totalPrice = 0;
            for (Item item : items){
                
                totalPrice += item.getPrice();
            }
        }
        
        return totalPrice;
    }
}
