import javax.swing.JOptionPane;
import java.util.Random;

/**  	CMSC203 Assignment 2 Spring 2020 
 * Allows a customer to shop for children's toys and calculates their total cost.
 * 
 * @author Rose Griffin
 */

public class Birthday {

	public static void main(String[] args) {
		
		Toy t1;
		Random r = new Random();
		String name, ageStr, toyChoice, ans = "yes", addToGift;
		int age;
		double totalCost = 0;
		
		//Display welcome message and print program title to console
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company \nto choose gifts for young children");
		System.out.println("Birthday Gifts");
		
		
		do {	//Loops until the user is finished ordering gifts
			do {	//Loops until the user picks a valid toy, age appropriate toy, or decides to continue with a non age appropriate toy
				
				name = JOptionPane.showInputDialog("Enter the name of the child");
				ageStr = JOptionPane.showInputDialog("How old is the child?");
				toyChoice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				age = Integer.parseInt(ageStr);
				t1 = new Toy(toyChoice, age);
				
				//Validates toy choice
				if (t1.ageOK()) {
					JOptionPane.showMessageDialog(null, "Good choice!");
					ans = "";
				} else if (t1.getToy().equals("")) {
					JOptionPane.showMessageDialog(null, "Invalid choice");
				} else {
					ans = JOptionPane.showInputDialog("Toy is not age appropriate\nDo you want to buy a different toy? Yes or no");
				}
			} while (ans.equals("yes"));
			
			//Prompts if the user wants to add a card and/or balloon and adds it to the cost
			addToGift = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			t1.addCard(addToGift);
			addToGift = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
			t1.addBalloon(addToGift);
			
			//Displays child's name, toy choice, age, and order cost
			JOptionPane.showMessageDialog(null, "The gift for " + name + t1.toString());
			
			//Prompts if the user wants to add another gift to their order
			ans = JOptionPane.showInputDialog("Do you want another toy? Yes or No").toLowerCase();
			
			//Calculates the total cost of all gifts ordered
			totalCost += t1.getCost();
			
		} while (ans.equals("yes"));
		
		//Displays total cost and order number
		JOptionPane.showMessageDialog(null, "Your total cost is $" + totalCost + "\nOrder number is " + r.nextInt(100000) + "\nProgrammer: Rose Griffin");
	}

}
