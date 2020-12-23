import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {
    @Test
    public void sumTest(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        assertEquals(6, calculator.sum(4,2));
    }
    @Test
    public void multiplyTest(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        assertEquals(8, calculator.prod(4,2));
    }
}
