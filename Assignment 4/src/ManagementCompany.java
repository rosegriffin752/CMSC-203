/**
 * Creates the Management company that holds in properties
 * @author Rose Griffin
 *
 */
public class ManagementCompany {
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
	private int index = 0; //Holds the index of the properties array
	
	/**
	 * No argument constructor that creates a management company with default values
	 */
	public ManagementCompany() {
		mgmFeePer = 0;
		name = "";
		properties = new Property[MAX_PROPERTY];
		taxID = "";
		plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
	}
	
	/**
	 * Creates a ManagementCompany object with name, taxID, mgmFeePer, and a default plot
	 * 
	 * @param name     The name of the management company
	 * @param taxID     The taxID of the management company
	 * @param mgmFeePer     The management fee percentage
	 */
	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
	}
	
	/**
	 * Creates a ManagementCompany object with the following parameters
	 * 
	 * @param name     The name of the management company
	 * @param taxID     The taxID of the management company
	 * @param mgmFeePer     The management fee percentage
	 * @param x     The upper left x value of the plot
	 * @param y     The upper left y value of the plot
	 * @param width     The Width of the plot
	 * @param depth     The depth of the plot
	 */
	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Creates a copy of another ManagementCompany object
	 * @param otherCompany     The other ManagementCompany object
	 */
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.getName();
		this.taxID = otherCompany.getTaxID();
		this.mgmFeePer = otherCompany.getMgmFeePer();
		properties = new Property[MAX_PROPERTY];
		plot = otherCompany.plot;
	}
	
	/**
	 * Adds a property to the management company using a copy of another property
	 * 
	 * @param p The other property object
	 * @return -1 if the array is full
	 *         -2 if the Property object is null
	 *         -3 if management company does not encompass the property plot
	 *         -4 if property plot overlaps ANY of properties in array
	 *          or index of the array where the property was added, if the above statements are false
	 * 
	 */
	public int addProperty(Property p) {
		if(index >= MAX_PROPERTY) {
			return -1;
		} else if (p == null) {
			return -2;
		} else if (!plot.encompasses(p.getPlot())) {
			return -3;
		} else if (!plot.overlaps(p.getPlot())) {
			return -4;
		} else {
			properties[index] = p;
			index++;
			return index-1;
		}
	}
	
	/**
	 * Adds a property to the management company using name, city, rent, owner, and a default plot.
	 * 
	 * @param name     The name of the property
	 * @param city     The city of the property
	 * @param rent     The property's rent
	 * @param owner     The name of the owner of the property
	 * @return -1 if the array is full
	 *         -2 if the Property object is null
	 *         -3 if management company does not encompass the property plot
	 *         -4 if property plot overlaps ANY of properties in array
	 *          or index of the array where the property was added, if the above statements are false
	 * 
	 * 
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner);
		if(index >= MAX_PROPERTY) {
			return -1;
		} else if (!plot.encompasses(property.getPlot())) {
			return -3;
		} else if (!plot.overlaps(property.getPlot())) {
			return -4;
		} else {
			properties[index] = property;
			index++;

			return index-1;
		}
	}
	
	/**
     * Adds a property to the management company using name, city, rent, owner, and with a plot object with the values of x, y, width
	 * and depth
	 * 
	 * @param name     The name of the property
	 * @param city     The city of the property
	 * @param rent     The property's rent
	 * @param owner     The name of the owner of the property
	 * @param x     The upper left x value of the plot
	 * @param y     The upper left y value of the plot
	 * @param width     The Width of the plot
	 * @param depth     The depth of the plot
	 * @return -1 if the array is full
	 *         -2 if the Property object is null
	 *         -3 if management company does not encompass the property plot
	 *         -4 if property plot overlaps ANY of properties in array
	 *          or index of the array where the property was added, if the above statements are false
	 * 
	 * 
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		if(index >= MAX_PROPERTY) {
			return -1;
		} else if (!plot.encompasses(property.getPlot())) {
			return -3;
		} else if (!plot.overlaps(property.getPlot())) {
			return -4;
		} else {
			properties[index] = property;
			index++;
			
			return index-1;
		}
	}
	
	/**
	 * Gets the name of the management company
	 * @return The name of the management company
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the plot of the management company
	 * @return The plot object of the management company
	 */
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 * Gets the TaxID of the management company
	 * @return The TaxID of the management company
	 */
	public String getTaxID() {
		return taxID;
	}
	
	/**
	 * Gets management fee percentage of the management company
	 * @return the management fee percentage
	 */
	public double getMgmFeePer() {
		return mgmFeePer;
	}
	
	/**
	 * Gets the string of a property in the properties array at index i
	 * 
	 * @param i     an index in the properties array
	 * @return     The string of properties at index i
	 */
	public String displayPropertyAtIndex(int i) {
		return properties[i]+"";
	}
	
	/**
	 * Gets the maximum amount of properties allowed for the management company
	 * @return the maximum amount of properties
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	/**
	 * Finds the largest rent in the properties array
	 * @return maximum rent of the properties array
	 */
	public double maxRentProp() {
		double max = properties[0].getRentAmount();
		for (int i = 0; i < index; i++) {
			if (properties[i].getRentAmount() > max)
				max = properties[i].getRentAmount();
		}
		return max;
	}
	
	/**
	 * Uses the maxRentProp() to find the index of the property with the highest rent
	 * @return the index of the properties array that has the highest rent
	 */
	public int maxRentPropertyIndex() {
		double max = maxRentProp();
		int i = 0;
		for (int j = 0; j < index; j++) {
			if (properties[j].getRentAmount() == max)
				i = j;
		}
		return i;
	}
	
	/**
	 * Overrides toString in class java.lang.Object and displays all the information of all the properties in the management object
	 */
	public String toString() {
		String temp = "List of the properties for " + name + ", taxID: " + taxID + "\n______________________________________________________\n";
		for (int i = 0; i < index; i++) {
			temp += "\nProperty Name: " + properties[i].getPropertyName()
					+ "\nLocated in " + properties[i].getCity()
					+ "\nBelonging to: " + properties[i].getOwner()
					+ "\nRent Amount: " + properties[i].getRentAmount();
		}
		temp+= "\n______________________________________________________\n\ntotal management Fee: " + totalRent() * mgmFeePer / 100;
		return temp;
	}
	public double totalRent() {
		double sum = 0;
		for (int i = 0; i < index; i++) {
			sum+= properties[i].getRentAmount();
		}
		return sum;
	}

}
