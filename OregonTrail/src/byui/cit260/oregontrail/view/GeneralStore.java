/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import buyi.cit260.oregontrail.control.ShopControl;
import byui.cit260.oregontrail.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Amon Bernardo
 */
public class GeneralStore extends View{

    public GeneralStore() {
        super("***** The Oregon Trail – Matt’s General Store *****\n" +
                "* Choose an item to add to your order: *\n" +
                "* Item Name          Price    Quantity   Total *\n" +
                "* 1. Oxen             $22       0         $0 *\n" +
                "* 2. Food (1 pound)   $05       0         $0 *\n" +
                "* 3. Clothing         $20       0         $0 *\n" +
                "* 4. Ammunition       $01       0         $0 *\n" +
                "* 5. Spare Parts      $04       0         $0 *\n" +
                "*       Total Bill                        $0 *\n" +
                "*       Total Funds                      $800 *\n" +
                "*       Funds Remaining                  $800 *\n" +
                "*-----Type G to sum the items prices          *\n" +
                "*-----What is your choice (‘Q’ to Continue)? *\n" +
                "********************************************");
    }
    @Override
    public boolean doAction(String value) {
       
        Item oxen = new Item(22, "Increse the wagon speed", "Oxen");
        Item food = new Item(05, "improve the wagon health, and is very necessary", "Food");
        Item clothing = new Item(20, "improve the wagon health", "Clothing");
        Item ammunition = new Item(01, "It is necessary to hunter animals", "ammunition");
        Item spareParts = new Item (04, "It's helpful to fix some problems in the wagon", "Spare Parts");
        switch (value){
            
            case "1":
                System.out.println("\n You choosed a Oxen.");
                return true;
            case "2":
                System.out.println("\n You choosed a Food(1 pound).");
                return true;
            case "3":
                System.out.println("\n You choosed a clothing.");
                return true;
            case "4":
                System.out.println("\n You choosed a Ammunition.");
                return true;
            case "5":
                System.out.println("\n You choosed a Spare Parts.");
                return true;
            case "g":
            case "G":
                ArrayList<Item> items = new ArrayList<Item>();
                items.add(oxen);
                items.add(food);
                items.add(clothing);
                items.add(ammunition);
                items.add(spareParts);
                
                System.out.println("\n The total price of all items is " + ShopControl.itemTotalPrice(items)+"\n");
                return true;
            default:
                System.out.println("\n You choosed a wrong choice. Please, type again.");
                return false;
        }
    }
}
