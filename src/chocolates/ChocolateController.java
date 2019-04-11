package chocolates;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehta
 */
public class ChocolateController {
    public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
                
                System.out.println("Filling up the Boiler!");
		boiler.fill();
                
                System.out.println("Chocolate is getting Boiled!");
		boiler.boil();
                
                System.out.println("Chocolate is Drained!");
		boiler.drain();
                
                //Apply the factory pattern for the WhiteChocolate and 
                //Dark chocolate only.
                
                //For factory pattern - create a "ChocolateFactory" class
                //Note that - don't create a super class for both types of chocolate
                WhiteChocolate w1=new WhiteChocolate(0.70);
                System.out.println("White Chocolate created!");
                
                DarkChocolate d1=new DarkChocolate(0.25);
                System.out.println("Dark Chocolate created!");

		
	}
}
