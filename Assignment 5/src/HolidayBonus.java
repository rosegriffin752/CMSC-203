/**
 * Calculates the holiday bonus for each shop in the district
 * 
 * @author Rose Griffin
 *
 */
public class HolidayBonus {
	
	/**
	 * Calculates holiday bonus for each shop in the district
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param high The amount of bonus a shop receives for making the most sales in a category
	 * @param low The amount of bonus a shop receives for making the least sales in a category
	 * @param other The default amount of bonus a shop receives per category
	 * @return An array that holds the amount of bonus each shop receives, which each index representing the corresponding shop
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus = new double[data.length];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (col < data.length && TwoDimRaggedArrayUtility.getHighestInColumn(data, col) == data[row][col])
					bonus[row] += high;
				else if (col < data.length && getLowestInColumn(data, col) == data[row][col])
					bonus[row] += low;
				else if (col < data.length && data[row][col] > 0)
					bonus[row] += other;
			}
		}
		return bonus;
	}
	
	/**
	 * Calculates the total holiday bonus of all shops by adding each bonus
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param high The amount of bonus a shop receives for making the most sales in a category
	 * @param low The amount of bonus a shop receives for making the least sales in a category
	 * @param other The default amount of bonus a shop receives per category
	 * @return The sum of the bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double total = 0;
		double[] bonus = calculateHolidayBonus(data, high, low, other);
		for (int i = 0; i < bonus.length; i++) {
			total += bonus[i];
		}
		return total;
	}
	
	/**
	 * Calculates the lowest value in the designated column, disregarding negative numbers
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param col Designated column to check
	 * @return The lowest number in the array, disregarding negatives
	 */
	public static double getLowestInColumn(double[][] data, int col){
		double min = Double.MAX_VALUE;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] < min && data[row][col] > 0)
				min = data[row][col];
		}
		return min;
	}
	
}
