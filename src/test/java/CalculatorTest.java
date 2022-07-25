import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    void sub() {
        assertEquals(5, calculator.sub(6,1));
    }

    @Test
    void mul() {
        assertEquals(25, calculator.mul(5, 5));
    }

    @Test
    void div() {
        assertEquals(6, calculator.div(30,5));
    }

    @Test
    void modulo() {
        assertEquals(7, calculator.modulo(23, 8));
    }
}
