import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m; 
	Property p1, p2, p3, p4, p5, p6;

	@Before
	public void setUp() throws Exception {
		//student create a management company
		m = new ManagementCompany("Company1", "111111111",6);
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Sunset", "Wheaton", 2000, "Johnathan Smith",1,1,3,2);
		p2 = new Property ("Sunrise", "Silver Spring", 3020.3, "Ronald McDonald",2,3,2,2);
		p3 = new Property ("Verdant Creek", "Rockville", 3500.8, "Paul Sunday",6,2,4,4);
		
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		p1 = p2 = p3 = p4 = p5 = p6 = null;
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property("Willow Creek", "Rockville", 3203, "Ronald McDonald");
		
		//student should add property with 8 args
		p5 = new Property ("Donutland", "Gaithersburg", 2045.5, "Paula Smith",6,5,1,1);
		
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		p6 = new Property ("Cider Mill Apartments", "Gaithersburg", 1000, "Kiera Sunday",7,1,1,1);
		
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);  //exceeds the size of the array and can not be added, add property should return -1
		
		System.out.println(m);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),3500.8,0);	
	}

	@Test
	public void testTotalRent() {
		assertEquals(m.totalRent(),8521.1,0);
	}
}