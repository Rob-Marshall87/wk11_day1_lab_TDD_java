import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract(){
        assertEquals(8, calculator.subtract( 11, 3));
    }

    @Test
    public void testMultipy(){
        assertEquals(35, calculator.multiply(7, 5));
    }

    @Test
    public void testDivide(){
        assertEquals(5, calculator.divide(10,2));
    }
}
