/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerpack;
import towerpack.towermain;
import java.util.HashMap;

/**
 *
 * @author Dani
 */
public class TowerTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
    	HashMap<String, Boolean> init = new HashMap<String, Boolean>();
    	towermain Player = new towermain("", 0, init,false);
    	Player.play();
    
    }
    
}