package towerpack;

import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class towermain {


public towermain(String pname, int plocation, HashMap<String, Boolean> pBackpack) {
	
	pname = initializename();
	plocation = 1;
	pBackpack = initializeBackpack();
	
}

public static HashMap<String, Boolean> initializeBackpack() {
	
	HashMap<String, Boolean> iBackpack = new HashMap<String, Boolean>();
	
	String[] Items = new String[10];
	
	for(int x = 0; x < Items.length; x++) {
		iBackpack.put(Items[x], false);
	}
	
	return iBackpack;
	
}

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

public static void backback() {
	
	
	
}

public static Object[] elevatorchoices() {
	
	Object[] floors = new String[10];
	for(int x = 0; x <= 10; x++) {
		floors[x] = receivefloor(x);
	}
	return floors;
	
}

public static void flooractions(int choice, int plocation) {
	
	switch(plocation) {
	case 0: 
		//case for basement
		if(choice == 0) {
			JOptionPane.showMessageDialog(null,"You found the key!");
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null,"You see a dead body, inform Logan Paul");
		}
		else if(choice == 2) {
			
		}
			break;
	case 1:	
		//case for front door
		if(choice == 0) {
		// Key needed to open front door
			
		}
		else if(choice == 1) {
		//go back to elevator
			
		}
			break;
	case 2: 
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "They light up by themselves and death shadows appear.");
		}
		else if(choice == 1) {
		//back to elevator
			JOptionPane.showMessageDialog(null, "");
		}
			break;
	case 3:
		//case for kitchen
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You find some delicious soul food.");
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "Glasses and dishes start flying around the room!");
		}
		else if(choice == 2) {
		// go back to elevator
			
		}
			break;
	case 4: 
		//case for bedroom 1
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "The chair begins to rock on its own!");
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "You see a child outside on a swing.");
		}
		else if(choice == 2) {
		//back to elevator
			
		}
			break;
	case 5:
		//case for bedroom 2
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "The dolls start having a frat party, and no, you are not cool enough to be invited.");
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "A ghost flies out and goes right through you. You might have to go to therapy for that.");
		}
		else if(choice == 2) {
		// back to elevator
			
		}
			break;
	case 6:
		//case for Master Bedroom
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You find a cursed Hope Diamond! Maybe GameStop will give you 3 dollars for it.");
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "You rub the lamp and a genie pops out. He begins to sing 'Ocean Man'.");
		}
		else if(choice == 2) {
		// go back to elevator
			
		}
			break;
	case 7:
		//case for bathroom
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You see a bloody face looking back at you.");
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "You hear someone drop the soap in the shower, but there is no one there...");
		}
		else if(choice == 2) {
		//go back to elevator
			
		}
			break;
	case 8:
		//case for playroom
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You find a limited edition Gundam!");
		}
		else if(choice == 1) {
		//back to elevator
		}
			break;
	case 9:
		//case for attic
		if(choice == 0) {
		//key for front door
			JOptionPane.showMessageDialog(null, "You found another key.");
		}
		else if(choice == 1) {
		//go back to elevator
			
		}
	}
}

public static int optionsquestion(Object[] options, int plocation) {
	
	int n = JOptionPane.showOptionDialog(null,
		    "What would you like to do?",
		    "Choose",
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,options[options.length - 1]);
			return n;
	
}

public static int clocationquestion(int plocation) {
	
	Object[] options = new Object[4];
	int choice;
	int numoptions = 0;
	options[3] = "Go back to Elevator";
	
	switch (plocation) {
	case 0: 
		options[0] = "Explore Chest";
		options[1] = "Explore Boiler Room";
		break;
	case 1: 
		options[0] = "Try to open Front Door";
		break;
	case 2: 
		options[0] = "Explore Candelabra";
		break;
	case 3: 
		options[0] = "Explore Refrigerator";
		options[1] = "Explore Cabinet";
		break;
	case 4: 
		options[0] = "Explore Rocking Chair";
		options[1] = "Explore Window";
		break;
	case 5:
		options[0] = "Explore Doll House";
		options[1] = "Explore Dresser";
		break;
	case 6: 
		options[0] = "Explore Jewelry Box";
		options[1] = "Explore Intricate Oil Lamp";
		break;
	case 7:
		options[0] = "Explore Mirror";
		options[1] = "Explore Shower";
		break;
	case 8:
		options[0] = "Explore Toy Box";
		break;
	case 9:
		options[0] = "Explore Chest";
		break;
	case 10:
		options = elevatorchoices();
		choice = optionsquestion(options, plocation);
		return choice;
	}
	
	for(int x = 0; x < options.length; x++) {
		if(options[x] != null) {
			numoptions++;
		}
	}
	
	Object[] roptions = new Object[numoptions];
	for(int x = 0; x < roptions.length; x++) {
		if(options[x] != null) {
			roptions[x] = options[x];
		}
	}
	
	if(roptions[numoptions - 1] != options[3]) {
		roptions[numoptions - 1] = options[3];
	}
	
	choice = optionsquestion(roptions, plocation);
	return choice;
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

public static String initializename() {
	
	  //Asking for user's name and welcoming the user.
    String pname = JOptionPane.showInputDialog(null, "What is your name?");
    JOptionPane.showMessageDialog(null, "Welcome " + pname + " to the Tower Of Terror!");
    return pname;
	
}

public static void currentlocation(int x, int plocation) {
	
	switch (plocation) {
	
	case 0: if()
	
	}
	
}

public static void clocationmessage (int plocation) {
	
	JOptionPane.showMessageDialog(null, "You are now in " + receivefloor(plocation) + ".",null,JOptionPane.INFORMATION_MESSAGE,picture(location));
	
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



