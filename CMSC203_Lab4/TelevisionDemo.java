
import java.util.Scanner;

/** 
* This class tests the Television class
*/
public class TelevisionDemo
	{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		//declare variables
		int station; //the user�s channel choice
		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		//turn the power on
		bigScreen.power();
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + "-inch " +
				bigScreen.getManufacturer() + " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		//display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println(); //for a blank line
		
		Television portable = new Television("Sharp", 19);
		portable.power();
		System.out.println("A " + portable.getScreenSize() + "-inch " +
				portable.getManufacturer() + " has been turned on.");
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		portable.setChannel(station);
		portable.decreaseVolume();
		portable.decreaseVolume();
		System.out.println("Channel: " + portable.getChannel() +
				", Volume: " + portable.getVolume());
		
//		6. Use calls to the mutator methods to change the channel to the user�s preference and decrease the volume by two.
//		7. Use calls to the accessor methods to print the changed state of the portable.
//		8. Compile and debug this class.
//		9. Run TelevisionDemo again.
//		10. The output for task #5 will appear after the output from above, since we added onto the bottom of the program. The output for task #5 is shown below.

		}
	}