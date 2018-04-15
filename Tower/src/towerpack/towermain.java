/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerpack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class towermain {


    
    
private static String name; //Player name.
private static String location0 = "Front Door";//First location selected from door.
private static String toFrontDoor = "FrontDoor";
private static boolean elevator;
private static int location;


private static String receivefloor(int loc) {
	
	String[] floor = new String[11];
	floor[0] = "Basement";
    floor[1] = "Front Door";
    floor[2] = "Dining Room";
    floor[3] = "Kitchen";
    floor[4] = "Bedroom 1";
    floor[5] = "Bedroom 2";
    floor[6] = "Master Bedroom";
    floor[7] = "Bathroom";
    floor[8] = "Playroom";
    floor[9] = "Attic";
    floor[10] = "Elevator";
    
    return floor[loc];
	
}

public static ImageIcon picture(int x) {
	
	ImageIcon[] floorpicture = new ImageIcon[11];
	
	//Images initialized here.
    floorpicture[9] = new ImageIcon("Attic.jpg");
    floorpicture[4] = new ImageIcon("Bedroom1.jpg");
    floorpicture[5] = new ImageIcon("Bedroom2.jpg");
    floorpicture[7] = new ImageIcon("Bathroom.png");
    floorpicture[6] = new ImageIcon("MasterBedroom.jpg");
    floorpicture[0] = new ImageIcon("Basement.jpg");
    floorpicture[8] = new ImageIcon("Playroom.jpg");
    floorpicture[2] = new ImageIcon("DiningRoom.jpg");
    floorpicture[3] = new ImageIcon("Kitchen.jpg");
    floorpicture[1] = new ImageIcon("FrontDoor.jpg");
    floorpicture[10] = new ImageIcon("Elevator.jpg");
    
    return floorpicture[x];
	
}

public static void intro() {
	
	location = 1;
	
	  //Asking for user's name and welcoming the user.
    name = JOptionPane.showInputDialog(null, "What is your name?");
    JOptionPane.showMessageDialog(null, "Welcome " + name + " to the Tower Of Terror!");
	
}

public static void currentlocation() {
	
	switch (location) {
	
	case 0: 
	
	}
	
}

public static void clocationmessage ( ) {
	
	JOptionPane.showMessageDialog(null, "You are now in " + receivefloor(location) + ".",null,JOptionPane.INFORMATION_MESSAGE,picture(location));
	
}


public static void startWalking()
{
    // Create Arrays for the floors and Items in the backpack.
    
    String item[] = new String[5];
    
    item[0] = "Basment Key";
    item[1] = "Attic Key";
    
    String leave[] = new String[2];
    
    leave[0] = "Leave";
    leave[1] = "Elevator";
    boolean gameOn = true;

    
    while (gameOn) {
    
        int move1 = JOptionPane.showOptionDialog(null, name + " you are now in the Front Door.\nWould you like to leave or go into the elevator? ",null, 
                JOptionPane.WARNING_MESSAGE,0,null,leave,null);
        
                System.out.println(move1);
        
        if(move1 == 1){ 
        elevator = true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The door is locked you need the key to escape.");
        }
    while (elevator == true) {
        
        
            if(true){
                JOptionPane.showMessageDialog(null, "You are now in the Elevator.",null,JOptionPane.INFORMATION_MESSAGE,vator);
//                move1 = JOptionPane.showInputDialog(null, name + " Which floor would you like to take the elevator to??\nBasement?\nDining Room?\nKitchen?\nBedroom1?\nBedroom2?\nMaster Bedroom?\nBathroom?\nAttic\nFront Door?");
                 System.out.println(move1);
                 move1 = JOptionPane.showOptionDialog(null, "Where Could you like to go?", "Floors",
                 JOptionPane.WARNING_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, floor," ");
                 
            } 
            elevator = false;
    
//    while(location0.equals(floor[1]))
//    {
//
//           
//                    
//                    
//                    
//                  
//    }
   }
  } 
 }
}



