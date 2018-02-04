/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Elías
 */

public class ResourceScene extends RegularSceneType implements Serializable {
    private int amount;
    private ArrayList<InventoryItem> inventoryItem = new ArrayList<InventoryItem>();
    public ResourceScene(String description, double travelDay, String river, String mountain, String weather, String month) {
        super(description, travelDay, river, mountain, weather, month);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ArrayList<InventoryItem> getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(ArrayList<InventoryItem> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.amount;
        hash = 67 * hash + Objects.hashCode(this.inventoryItem);
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "amount=" + amount + ", inventoryItem=" + inventoryItem + '}';
    }
    
}
