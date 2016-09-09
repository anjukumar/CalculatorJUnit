import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void additonTest() {
		Calculator c = new Calculator();
		double result =c.addition(2,4);
		assertTrue(result == 6);
	}
	@Test
	public void subtractionTest() {
		Calculator c = new Calculator();
		double result =c.subtraction(4,2);
		assertTrue(result == 2);
	}
	@Test
	public void multiplyTest() {
		Calculator c = new Calculator();
		double result =c.multiplication(2,4);
		assertTrue(result == 8);
	}
	@Test
	public void divisionTest() {
		Calculator c = new Calculator();
		double result =c.division(4,2);
		assertTrue(result == 2);
	}
	
	@Test
	public void divisionbyzeroTest() {
		Calculator c = new Calculator();
		double result =c.division(0,0);
		assertTrue(result == 0);
	}

}
