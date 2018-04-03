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
class ReportMenuView extends View{

    public ReportMenuView() {
        super("--Report Menu view--\n"
            + "L - Location Report\n"
            + "I - Inventory Item report");
    }
    
    @Override
    public boolean doAction(String value) {
        switch (value.toUpperCase()){
            case "L":
                locationReport();
                return true;
            case "I":
                inventoryItemReport();
                return true;
            case "Q":
                 return true;
            default:
                System.out.println("Type a valid value.");
                return false;
        }
    }

    private void locationReport() {
        System.out.println(this.getClass().getName() + " locationReport method called");
    }

    private void inventoryItemReport() {
        System.out.println(this.getClass().getName() + " inventoryItemReport method called");
    }
    
}
