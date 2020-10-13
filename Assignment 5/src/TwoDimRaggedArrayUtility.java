import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Utility class that creates and handles a two dimensional ragged array
 * that represents the sales numbers of different shops in a district
 * 
 * @author Rose Griffin
 * 
 */
public class TwoDimRaggedArrayUtility {
	/**
	 * Creates a 2d ragged array that holds all the sales for each shop by reading from a file. A temporary String array of the maximum
	 * row size is used to take all the values from the file, while a double 2d array takes all the values from the string array and
	 * converts them into doubles
	 * The maximum row and column size for the array is 10
	 * 
	 * @param file file to be read that contains sale values for each shop
	 * @return A 2d ragged array that contains all the sale values for each shop in the district
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file) throws FileNotFoundException {
		String[][] temp = new String[10][];
		double[][] data;
		Scanner scanner = new Scanner(file);
		
		int row = 0;
		while(scanner.hasNextLine()) {
			String[] tempRow = scanner.nextLine().split(" ");
			temp[row] = new String[tempRow.length];
			for (int col = 0; col < tempRow.length; col++) {
				temp[row][col] = tempRow[col];
			}
			row++;
		}
		scanner.close();
		
		data = new double[row][];
		for (int r = 0; r < data.length; r++) {
			data[r] = new double[temp[r].length];
			for (int c = 0; c < temp[r].length; c++) {
				data[r][c] = Double.parseDouble(temp[r][c]);
			}
		}

		return data;
	}
	
	/**
	 * Transfers data from a 2d array onto a file
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param outputFile File that contains all the values of the 2d array
	 * @throws FileNotFoundException
	 */
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
			PrintWriter output = new PrintWriter(outputFile);
			for(int row = 0; row < data.length; row++) {
				for (int col = 0; col < data[row].length; col++) {
					output.print(data[row][col] + " ");
				}
				output.println();
			}
			output.close();
		 }
	
	/**
	 * Calculates the sum of all the values in the array and returns it
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @return the sum of each value in the array
	 */
	public static double getTotal(double[][] data) {
		 double total = 0;
		 for (int row = 0; row < data.length; row++) {
			 for (int col = 0; col < data[row].length; col++) {
				 total += data[row][col];
			 }
		 }
		 return total;
	 }

	/**
	 * Calculates the average of the array buy counting the number of terms in it and dividing the
	 * sum by the total
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @return the average of the array
	 */
	public static double getAverage(double[][] data) {
		 double totalTerms = 0;
		 for (int row = 0; row < data.length; row++) {
			 for (int col = 0; col < data[row].length; col++) {
				 totalTerms++;
			 }
		 }
		 return getTotal(data)/totalTerms;
	 }
	 
	/**
	 * Calculates the sum of a designated row
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param row designated row to check
	 * @return the sum of a designated row
	 */
	 public static double getRowTotal(double[][] data, int row) {
		 double total = 0;
		 for (int col = 0; col < data[row].length; col++) {
			 total += data[row][col];
		 }
		 return total;
	 }
	 
	/**
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param col designated column to check
	 * @return the sum of a designated column
	 */
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length)
				total+= data[row][col];
		}
		return total;
	}
	
	/**
	 * Finds the highest term in a designated row
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param row designated row to check
	 * @return highest term in the row
	 */
	public static double getHighestInRow(double[][] data, int row) {
		double max = Double.MIN_VALUE;
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] > max)
				max = data[row][col];
		}
		return max;
	}
	
	/**
	 * Finds the index of the highest term in a designated row
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param row designated row to check
	 * @return index of highest term in a row
	 */
	public static int getHighestInRowIndex(double[][] data, int row) {
		double max = getHighestInRow(data, row);
		int index = 0;
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] == max)
				index = col;
		}
		return index;
	}
	
	/**
	 * Finds the lowest term in a designated row
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param row designated row to check
	 * @return the lowest term in the row
	 */
	public static double getLowestInRow(double[][] data, int row) {
		double min = Double.MAX_VALUE;
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] < min)
				min = data[row][col];
		}
		return min;
	}
	
	/**
	 * Finds the index of the lowest term in a designated row
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param row designated row to check
	 * @return index of the lowest term in the row
	 */
	public static int getLowestInRowIndex(double[][] data, int row) {
		double min = getLowestInRow(data, row);
		int index = 0;
		for (int col = 0; col < data[row].length; col++) {
			if (data[row][col] == min)
				index = col;
		}
		return index;
	}
	
	/**
	 * Finds the highest term in a designated column
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param col designated column to check
	 * @return highest term in the column
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		double max = Double.MIN_VALUE;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] > max)
				max = data[row][col];
		}
		return max;
	}

	/**
	 * Finds the index of the highest term in a designated column
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param col designated column to check
	 * @return the index of the highest term in the column
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double max = getHighestInColumn(data, col);
		int index = 0;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] == max) {
				index = row;
			}
		}
		return index;
	}
	
	/**
	 * Finds the lowest term in a designated column
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param col designated column to check
	 * @return the lowest term in the column
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		double min = Double.MAX_VALUE;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] < min)
				min = data[row][col];
		}
		return min;
	}
	
	/**
	 * Finds the index of the lowest term in a designated column
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @param col designated column to check
	 * @return the index of the lowest term
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double min = getLowestInColumn(data, col);
		int index = 0;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length && data[row][col] == min) {
				index = row;
			}
		}
		return index;
	}
	
	/**
	 * Finds the highest value in an entire 2d array
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @return the highest value in the array
	 */
	public static double getHighestInArray(double[][] data) {
		double max = Double.MIN_VALUE;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (col < data[row].length && data[row][col] > max)
					max = data[row][col];
			}
		}
		return max;
	}
	
	/**
	 * Finds the lowest value in an entire 2d array
	 * 
	 * @param data Ragged 2d array that holds all the sales data for each shop
	 * @return the lowest value in the array
	 */
	public static double getLowestInArray(double[][] data) {
		double min = Double.MAX_VALUE;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (col < data[row].length && data[row][col] < min)
					min = data[row][col];
			}
		}
		return min;
	}
}
