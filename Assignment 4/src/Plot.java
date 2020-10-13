/**
 * Creates a plot object in which properties are placed on 
 * @author Rose
 *
 */
public class Plot {
	private int x, y, width, depth;
	
	/**
	 * No argument constructor that creates a plot with default values
	 */
	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	/**
	 * Creates a new plot object using the values from another plot
	 * @param p     another plot object
	 */
	public Plot(Plot p) {
		x = p.getX();
		y = p.getY();
		width = p.getWidth();
		depth = p.getDepth();
	}
	
	/**
	 * Creates a plot object with x, y, width, and depth values.
	 * @param x     The upper left x value of the plot
	 * @param y     The upper left y value of the plot
	 * @param width     The Width of the plot
	 * @param depth     The depth of the plot
	 */
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Compares to plots to see if they overlap
	 * @param p     other plot
	 * @return true if plot overlaps p, return false if otherwise
	 */
	public boolean overlaps (Plot p) {
		return (p.getX() + p.getWidth() > x && p.getX() < x + width) && (p.getY() + p.getDepth() > y && p.getY() < y + depth);
	}
	
	/**
	 * Compares to plots to see if they encompass one another
	 * @param p     other plot
	 * @return true if plot encompasses p, return false if otherwise
	 */
	public boolean encompasses(Plot p) {
		return (p.getX() >= x && p.getX() + p.getWidth() <= x+width) && (p.getY() >= y && p.getY() + p.getDepth() <= y + depth);
	}
	
	/**
	 * Changes the value of x
	 * @param x     the new x value
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Gets x
	 * @return the value of x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Changes the value of y
	 * @param y     the new y value
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Gets y
	 * @return the value of y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Changes the value of width
	 * @param width     The new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Gets the width
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Changes the value of depth
	 * @param depth     The new depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/**
	 * Gets the depth
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 * Overrides toString in class java.lang.Object and displays all the information of the plot
	 */
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}

}
