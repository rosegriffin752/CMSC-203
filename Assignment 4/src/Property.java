/**
 * Creates property objects
 * @author Rose
 *
 */
public class Property {
	
	private String city, owner, propertyName;
	private double rentAmount;      
	private Plot plot;
	
	/**
	 * No argument constructor that creates a property object with default values
	 */
	public Property() {
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot();
	}
   /**
    * Creates a new property object using the values of another property object
    * @param p     another property object
    */
	public Property(Property p) {
		this.city = p.getCity();
		this.owner = p.getOwner();
		this.propertyName = p.getPropertyName();
		this.rentAmount = p.getRentAmount();
		this.plot = p.getPlot();
	}
	
	/**
	 * Creates a property object with propertyName, city, rentAmount, owner, and a default plot
	 * @param propertyName     The name of the property
	 * @param city     The city in which the property is located in
	 * @param rentAmount     The property's rent
	 * @param owner     The owner of the property
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot();
	}
	
	/**
	 * Creates a property object with propertyName, city, rentAmount, owner, and with a plot object with the values of
	 * x, y, width, and depth
	 * 
	 * @param propertyName     The name of the property
	 * @param city     The city in which the property is located in
	 * @param rentAmount     The property's rent
	 * @param owner     The owner of the property
	 * @param x     The upper left x value of the plot
	 * @param y     The upper left y value of the plot
	 * @param width     The Width of the plot
	 * @param depth     The depth of the plot
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Gets the property name
	 * @return the name of the property
	 */
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * Changes the property name to a new value
	 * @param propertyName      new property name
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * Gets the city
	 * @return the name of the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Changes the city to a new one
	 * @param city     new city name
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Changes the x, y, width, and depth of the plot
	 * @param x     The upper left x value of the plot
	 * @param y     The upper left y value of the plot
	 * @param width     The Width of the plot
	 * @param depth     The depth of the plot
	 * @return the new plot
	 */
	public Plot setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		return plot;
	}
	
	/**
	 * Gets the rent
	 * @return the rent of the property
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * Changes the rent of the property
	 * @param rentAmount     new rent
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**Gets the name of the owner
	 * 
	 * @return the name of the owner of the property
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * changes the owner of the property
	 * @param owner     the new owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * Gets the plot
	 * @return the plot in which the property is on
	 */
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 * Overrides toString in class java.lang.Object and displays all the information of the property
	 */
	public String toString() {
		return "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to: " + owner + "\nRent Amount: " + rentAmount;
	}
}
