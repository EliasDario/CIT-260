/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author lucia
 */
public class ChooseMonthToStartView extends View {
    public ChooseMonthToStartView () {
    super("\nCHOOSE A MONTH TO BEGIN YOUR JOURNEY:\n" +
            "1 - March\n" +
            "2 - April\n" +
            "3 - May\n" +
            "4 - June\n" +
            "5 - July\n" +
            "6 - When should I live?");
    }

    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
        switch (value) {
            case "1": 
                System.out.println("***message describing March***");
                break;
                
            case "2": 
                System.out.println("***message describing April***");
                break;
                
            case "3": 
                System.out.println("***message describing May***");
                break;
                
            case "4": 
                System.out.println("***message describing June***");
                break;
                
            case "5": 
                System.out.println("***message describing July***");
                break;
                
            case "6":
                System.out.println("***Message about how the months affects the Journey***\n");
                System.out.println("Press \"C\"to continue");
                break;
            case "C":
                return true;
                
            default : System.out.println("\nInvalid choice, choose a valid option please\n");
                  break;
        }
        return false;
    }
}

