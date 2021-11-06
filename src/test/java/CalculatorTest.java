import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int a = 1;
        int b = 2;
        double result = calculator.add(a,b);
        Assertions.assertEquals(3, result);
    }

    @Test
    void subtract() {
        int a=4;
        int b=3;

        Assertions.assertEquals(1, calculator.subtract(a,b));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(4,calculator.multiply(2,2));
        Assertions.assertEquals(6,calculator.multiply(2,3));
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }
}