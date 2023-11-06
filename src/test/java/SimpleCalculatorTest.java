import org.junit.jupiter.api.Test;
import week10.lectures.classes.unittests.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoEqualsFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        // From Java 10 Java can infer so var is allowed (Local variable type inference)
        // var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
        // Assert statement

        assertNotEquals(5, calculator.add(2, 2));

        assertTrue(4 == calculator.add(2, 2));

        assertFalse(5 == calculator.add(2, 2));

        assertNull(null);

        assertNotNull(1);
    }

    @Test
    public void twoPlusFiveEqualsSeven() {
        SimpleCalculator calculator = new SimpleCalculator();
        // From Java 10 Java can infer so var is allowed (Local variable type inference)
        // var calculator = new SimpleCalculator();
        assertEquals(7, calculator.add(2, 5));
    }
}