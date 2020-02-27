import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook a, b;
	@BeforeEach
	void setUp() throws Exception {
		a = new GradeBook(5);
		b = new GradeBook(5);
		
		a.addScore(50.0);
		a.addScore(28.5);
		
		b.addScore(50);
		b.addScore(78);
		b.addScore(0);
		b.addScore(73.9);
		b.addScore(96);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		a = b = null;
	}

	@Test
	void testAddScore() {
		
		assertTrue(a.toString().equals("50.0 28.5 "));
		assertTrue(b.toString().equals("50.0 78.0 0.0 73.9 96.0 "));
		
		assertEquals(2, a.getScoreSize());
		assertEquals(5, b.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(78.5, a.sum());
		assertEquals(297.9, b.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(28.5, a.minimum());
		assertEquals(0.0, b.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(50.0, a.finalScore());
		assertEquals(297.9, b.finalScore());
	}

}
