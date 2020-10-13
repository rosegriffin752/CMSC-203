
public class ManagementCompany {
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Plot plot;
	
	private static int index = 0;
	
	public ManagementCompany() {
		mgmFeePer = 0;
		name = "";
		properties = new Property[MAX_PROPERTY];
		taxID = "";
		plot = new Plot();
	}
	
	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot();
	}
	
	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(x, y, width, depth);
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.getName();
		this.taxID = otherCompany.getTaxID();
		this.mgmFeePer = otherCompany.getMgmFeePer();
		properties = new Property[MAX_PROPERTY];
		//plot = new Plot(x, y, width, depth);
	}
	
	public int addProperty(Property p) {
		Property property = new Property(p);
		if (index >= MAX_PROPERTY) {
			return -1;
		} else if (property == null) {
			return -2;
		} else if (!(property.getPlot()).encompasses(plot)) {
			return -3;
		} else if ((property.getPlot()).overlaps(plot)) {
			return -4;
		} else {
			properties[index] = property;
			index++;
			return index;
		}
		//return -1 if the array is full ,
		//-2 if the Property object is null
		//-3 if if management company does not encompass the property plot
		//-4 if property plot overlaps ANY of properties in array
		//otherwise return the index of the array where the property was added.
	}
	
	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner);
		if (index >= MAX_PROPERTY) {
			return -1;
		} else if (property == null) {
			return -2;
		} else if (!(property.getPlot()).encompasses(plot)) {
			return -3;
		} else if ((property.getPlot()).overlaps(plot)) {
			return -4;
		} else {
			properties[index] = property;
			index++;
			return index;
		}
		//return -1 if the array is full ,
		//-2 if the Property object is null
		//-3 if if management company does not encompass the property plot
		//-4 if property plot overlaps ANY of properties in array
		//otherwise return the index of the array where the property was added.
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		if (index >= MAX_PROPERTY) {
			return -1;
		} else if (property == null) {
			return -2;
		} else if (!(property.getPlot()).encompasses(plot)) {
			return -3;
		} else if ((property.getPlot()).overlaps(plot)) {
			return -4;
		} else {
			properties[index] = property;
			index++;
			return index;
		}
		//return -1 if the array is full ,
		//-2 if the Property object is null
		//-3 if if management company does not encompass the property plot
		//-4 if property plot overlaps ANY of properties in array
		//otherwise return the index of the array where the property was added.
	}
	
//return -1 if the array is full ,
//-2 if the Property object is null
//-3 if if management company does not encompass the property plot
//-4 if property plot overlaps ANY of properties in array
//otherwise return the index of the array where the property was added.

	public String getName() {
		return name;
	}
	
	public String getTaxID() {
		return taxID;
	}
	
	public double getMgmFeePer() {
		return mgmFeePer;
	}
	public String displayPropertyAtIndex(int i) {
		return properties[i]+"";
	}
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public double maxRentProp() {
		double max = properties[0].getRentAmount();
		for (int i = 0; i < index; i++) {
			if (properties[i].getRentAmount() > max)
				max = properties[i].getRentAmount();
		}
		return max;
	}
	
	public int maxRentPropertyIndex() {
		double max = maxRentProp();
		int i = 0;
		for (int j = 0; j < index; j++) {
			if (properties[j].getRentAmount() == max)
				i = j;
		}
		return i;
	}
	
	public String toString() {
		String temp = "";
		for (int i = 0; i < index; i++) {
			temp += "\nProperty Name: " + properties[i].getPropertyName()
					+ "\nLocated in " + properties[i].getCity()
					+ "\nBelonging to: " + properties[i].getOwner()
					+ "\nRent Amount: " + properties[i].getRentAmount();
		}
		return temp;
	}
	public double totalRent() {
		double sum = 0;
		for (int i = 0; i <index; i++) {
			sum+= properties[i].getRentAmount();
		}
		return sum;
	}

}
