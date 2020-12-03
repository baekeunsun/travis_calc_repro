package kr.ac.gnu.anse.calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalcTest {
	
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(30, c.add(10, 20));
	}
}
