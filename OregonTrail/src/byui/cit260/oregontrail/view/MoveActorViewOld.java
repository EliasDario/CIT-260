///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.oregontrail.view;
//
//import buyi.cit260.oregontrail.exceptions.MapControlException;
//import byui.cit260.oregontrail.control.MapControl;
//import byui.cit260.oregontrail.model.Location;
//import byui.cit260.oregontrail.model.Player;
//import java.io.IOException;
//import oregontrail.OregonTrail;
//
///**
// *
// * @author Amon Bernardo
// */
//public class MoveActorView extends View {
//    
//    public MoveActorView(){
//        super ("\n--Move your Actors--\n Press \"Q\" to back menu or to continue press any letter or number.");
//    }    
//
//    @Override
//    public boolean doAction(String value) {
//        try {
//            boolean action = doActions(getInputs());
//            if (action == true){
//                return true;
//            }else{
//                return false;
//            }
//            
//        } catch (IOException ex) {
//            console.println("Some problem in input happened" + ex.getMessage());
//            return false;
//        }
//
//    }
//    
//    public boolean doActions(String[] inputs){
//        int row;
//        int column;
//        try{
//            row = Integer.parseInt(inputs[0]);
//            column = Integer.parseInt(inputs[1]);
//            console.println("row: " + row + " column: " + column);
//        }
//        catch (NumberFormatException e){
//            console.println("You need type only numbers.");
//            return false;
//        }
//        Player player = OregonTrail.getPlayer();
//        Location newLocation;
//        try{
//            newLocation = MapControl.moveActor(player, row, column);
//        } catch (MapControlException ex) {
//            console.println("\nerror passed with the exception " + ex.getMessage());
//            return false;
//        }
//        if (newLocation.getRegularSceneType() == null){
//            console.println("get desc is null");
//        }else{
//        console.println("You arrived in " + newLocation.getRegularSceneType().getDescription() + "!");
//        }
//        return true;
////actor = get the Actor in the player object
//    }
//
//    private String[] getInputs() throws IOException {
//        
//        String[] inputs = new String[2];
//        console.println("Type the row to be moved: ");
//        inputs[0] = keyboard.readLine();
//        console.println("Enter the Column to be moved: ");
//        inputs[1] = keyboard.readLine();
//        
//        return inputs;
//
//    }
//    
//}
