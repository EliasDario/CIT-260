/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author Amon Bernardo
 */
public class GeneralStore extends View{

    public GeneralStore() {
        super("***** The Oregon Trail – Matt’s General Store *****\n" +
                "* Choose an item to add to your order: *\n" +
                "* Item Name          Price    Quantity   Total *\n" +
                "* 1. Oxen             $XX       0         $0 *\n" +
                "* 2. Food (1 pound)   $XX       0         $0 *\n" +
                "* 3. Clothing         $XX       0         $0 *\n" +
                "* 4. Ammunition       $XX       0         $0 *\n" +
                "* 5. Spare Parts      $XX       0         $0 *\n" +
                "*       Total Bill                        $0 *\n" +
                "*       Total Funds                      $800 *\n" +
                "*       Funds Remaining                  $800 *\n" +
                "*-----What is your choice (‘Q’ to Continue)? *\n" +
                "********************************************");
    }
    @Override
    public boolean doAction(String value) {
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
            default:
                System.out.println("\n You choosed a wrong choice. Please, type again.");
                return false;
        }
    }
}
