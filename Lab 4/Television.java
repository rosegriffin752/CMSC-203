/** 
* The purpose of this class is to model a television
* Rose Griffin 2/25/20
*/

public class Television {
	
	private String MANUFACTURER;	//Represents the TV's manufacturer
	private int SCREEN_SIZE;	    //Represents the TV's screen size in inches
	private int channel, volume;	//Represents the channel the TV is on, and how loud the volume is.
	private boolean powerOn;	    //Represents whether or not the TV is on.
	
	/**
	 *  Constructor initializes manufacturer and screen size.
	 *  Sets powerOn, volume, and channel to false, 20, and 2
	 *  respectively by default.
	 * 
	 * @param MANUFACTURER	The TV's manufacturer
	 * @param SCREEN_SIZE	Represents the TV's screen size in inches
	 * 
	 */
	public Television(String MANUFACTURER, int SCREEN_SIZE) {
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		powerOn = false;
		volume = 20;
		channel = 2;
	}

	/** 
	 *  Gets the volume
	 * 
	 * @return	Volume of the TV
	 * 
	 */
	public int getVolume() {
		return volume;
	}
	
	/** 
	 *  Gets the channel
	 * 
	 * @return	channel the TV is currently on
	 * 
	 */
	public int getChannel() {
		return channel;
	}
	
	/** 
	 *  Gets the name of the TV's manufacturer
	 * 
	 * @return	name of the manufacturer
	 * 
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/** 
	 *  Gets the size of the screen
	 * 
	 * @return	size of the screen in inches
	 * 
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/** 
	 * Changes the channel
	 * 
	 * @param channel	new TV channel
	 * 
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/** 
	 * Reverses the power of the TV.
	 * If the power is on, it will be turned off. If it is on, it will be turned off.
	 * 
	 */
	public void power() {
		powerOn = !powerOn;
	}
	
	/** 
	 * Increases the volume by one
	 * 
	 */
	public void increaseVolume() {
		volume+=1;
	}
	
	/** 
	 * Decreases the volume by one
	 * 
	 */
	public void decreaseVolume() {
		volume-=1;
	}
}
