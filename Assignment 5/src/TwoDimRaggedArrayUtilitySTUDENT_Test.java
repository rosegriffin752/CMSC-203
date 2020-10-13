

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{436,346,54},{253,32},{355,5,75}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(1556,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(194.5,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(285,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,1),.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(129,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,2),.001);	
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(436, TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT),.001);	
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		double[][] array = null;
		try {
			
			inputFile = new File("Test1.txt");
			PrintWriter inFile = new PrintWriter(inputFile);
			inFile.print("436 346 54\n" + "253 32\n" + "355 5 75");
			inFile.close();
			
			array = TwoDimRaggedArrayUtility.readFile(inputFile);
			
			assertEquals(436, array[0][0],.001);
			assertEquals(346, array[0][1],.001);
			assertEquals(54, array[0][2],.001);
			assertEquals(253, array[1][0],.001);
			assertEquals(32, array[1][1],.001);
			assertEquals(355, array[2][0],.001);
			assertEquals(5, array[2][1],.001);
			assertEquals(75, array[2][2],.001);

		} catch (FileNotFoundException e) {
			fail("File not found");
		}
	}

}