public class Plot {
	private int x, y, width, depth;
	
	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	public Plot(Plot p) {
		x = p.getX();
		y = p.getY();
		width = p.getWidth();
		depth = p.getDepth();
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	//Determines if plots overlap
	public boolean overlaps (Plot p) {
		return false;
	}
	
	//takes a Plot instance and determines if the current plot contains it.
	//Note that the determination should be inclusive, in other words, if an edge lies on the edge of the current plot, this is acceptable.
	public boolean encompasses (Plot p) {
		return true;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}

}
