package towerpack;

import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class towermain {


private static int plocation;
private static String pname;
private static HashMap<String, Boolean> pBackpack;
private static boolean endGame;

public towermain() {
	
	pname = JOptionPane.showInputDialog(null, "What is your name?");
	JOptionPane.showMessageDialog(null, "Welcome " + pname + " to the Tower Of Terror!");
	plocation = 1;
	pBackpack = initializeBackpack();
	endGame = false;
}

public void play() {
	
	while (endGame == false) {
		int choice;
		
		clocationmessage();
		choice = clocationquestion();
		flooractions(choice);
	}
	backpackcontents();
}

private static void backpackcontents() {
	
	String Backpack = null;
	
	for(String key: pBackpack.keySet()) {
		if(pBackpack.get(key) == true) {
			if(Backpack == null) {
				Backpack = key;
			}
			else {
				Backpack = Backpack + " | " + key;
			}
		}
	}
	JOptionPane.showMessageDialog(null, pname + ", You found: " + Backpack,null,JOptionPane.INFORMATION_MESSAGE);
}

private static HashMap<String, Boolean> initializeBackpack() {
	
	HashMap<String, Boolean> iBackpack = new HashMap<String, Boolean>();
	
	String[] Items = new String[7];
	Items[0] = "Attic Key";
	Items[1] = "Front Door Key";
	Items[2] = "Soul Food";
	Items[3] = "Cursed Hope Diamond";
	Items[4] = "Intricate Oil Lamp";
	Items[5] = "Soap";
	Items[6] = "Limited Edition Gundam";
			
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

private static Object[] elevatorchoices() {
	
	Object[] floors = new Object[10];
	for(int x = 0; x < 10; x++) {
		floors[x] = receivefloor(x);
	}
	return floors;
}

private static void flooractions(int choice) {
	
	switch(plocation) {
	case 0: 
		//case for basement
		if(choice == 0) {
			if(pBackpack.get("Attic Key") == false) {
				pBackpack.put("Attic Key", true);
				JOptionPane.showMessageDialog(null,"You found the key!");				
			}
			else {
				JOptionPane.showMessageDialog(null, "The Chest has already ben searched.");
			}
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null,"You see a dead body, inform Logan Paul");
		}
		else if(choice == 2) {
			plocation = 10;
		}
			break;
	case 1:	
		//case for front door
		if(choice == 0) {
			if(pBackpack.get("Front Door Key") == true) {
				JOptionPane.showMessageDialog(null,"Congratulations, you have opened the front door and escaped! Game Over!");
				endGame = true;
			}
			else {
				JOptionPane.showMessageDialog(null,"The front door is locked...");
			}
		// Key needed to open front door
			
		}
		else if(choice == 1) {
			plocation = 10;
		}
			break;
	case 2: 
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "They light up by themselves and death shadows appear.");
		}
		else if(choice == 1) {
			plocation = 10;
		}
			break;
	case 3:
		//case for kitchen
		if(choice == 0) {
			if(pBackpack.get("Soul Food") == false) {
				pBackpack.put("Soul Food", true);
			JOptionPane.showMessageDialog(null, "You find some delicious soul food.");			
			}
			else {
				JOptionPane.showMessageDialog(null, "You already searched this");
			}
		}
		else if(choice == 1) {
			JOptionPane.showMessageDialog(null, "Glasses and dishes start flying around the room!");
		}
		else if(choice == 2) {
			plocation = 10;
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
			plocation = 10;
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
			plocation = 10;
		}
			break;
	case 6:
		//case for Master Bedroom
		if(choice == 0) {
			if(pBackpack.get("Cursed Hope Diamond") == false) {
				pBackpack.put("Cursed Hope Diamond", true);
				JOptionPane.showMessageDialog(null, "You find a cursed Hope Diamond! Maybe GameStop will give you 3 dollars for it.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You already searched this");
			}
		}
		else if(choice == 1) {
			if(pBackpack.get("Intricate Oil Lamp") == false) {
				pBackpack.put("Intricate Oil Lamp", true);
				JOptionPane.showMessageDialog(null, "You rub the lamp and a genie pops out. He begins to sing 'Ocean Man'.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You already searched this");
			}
		}
		else if(choice == 2) {
			plocation = 10;
		}
			break;
	case 7:
		//case for bathroom
		if(choice == 0) {
			JOptionPane.showMessageDialog(null, "You see a bloody face looking back at you.");
		}
		else if(choice == 1) {
			if(pBackpack.get("Soap") == false) {
				pBackpack.put("Soap", true);
				JOptionPane.showMessageDialog(null, "You hear someone drop the soap in the shower, but there is no one there...");
			}
			else {
				JOptionPane.showMessageDialog(null, "You already searched this");
			}
		}
		else if(choice == 2) {
			plocation = 10;
		}
			break;
	case 8:
		//case for playroom
		if(choice == 0) {
			if(pBackpack.get("Limited Edition Gundam") == false) {
			JOptionPane.showMessageDialog(null, "You find a limited edition Gundam!");
			}
			else {
				JOptionPane.showMessageDialog(null, "You already searched this");
			}
		}
		else if(choice == 1) {
			plocation = 10;
		}
			break;
	case 9:
		//case for attic
		if(choice == 0) {
		//key for front door
			if(pBackpack.get("Front Door Key") == false) {
				pBackpack.put("Front Door Key",true);
				JOptionPane.showMessageDialog(null, "You found another key.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You already searched this");
			}
		}
		else if(choice == 1) {
			plocation = 10;
		}
			break;
	case 10:
		if(choice == 9) {
			if(pBackpack.get("Attic Key") == false) {
				JOptionPane.showMessageDialog(null, "The attic door is locked. Please try a different floor.");
				plocation = 10;
				break;
			}
		}
		plocation = choice;
		break;
	}
}

private static int optionsquestion(Object[] options) {
	
	int n = JOptionPane.showOptionDialog(null,
		    pname + ", What would you like to do?",
		    "Choose",
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,options[options.length - 1]);
	return n;
}

private static int clocationquestion() {
	
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
		choice = optionsquestion(options);
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
	
	choice = optionsquestion(roptions);
	return choice;
}

private static ImageIcon picture() {
	
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
    
    return floorpicture[plocation];
	
}

private static void clocationmessage () {
	JOptionPane.showMessageDialog(null, pname + ", You are now in " + receivefloor(plocation) + ".",null,JOptionPane.INFORMATION_MESSAGE,picture());
}

}



