
public class Property {
	
	private String city, owner, propertyName;
	private double rentAmount;      
	private Plot plot;
	
	public Property() {
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot();
	}
   
	public Property(Property p) {
		this.city = p.getCity();
		this.owner = p.getOwner();
		this.propertyName = p.getPropertyName();
		this.rentAmount = p.getRentAmount();
		this.plot = p.getPlot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot(x, y, width, depth);
//		plot.setX(x);
//		plot.setY(y);
//		plot.setWidth(width);
//		plot.setDepth(depth);
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		return plot;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public String toString() {
		return "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to: " + owner + "\nRent Amount: " + rentAmount;
	}
}
