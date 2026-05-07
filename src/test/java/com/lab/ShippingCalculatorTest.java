package com.lab;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ShippingCalculatorTest {
    ShippingCalculator calc = new ShippingCalculator();

    @Test
    void testStandard() {
        assertEquals(15000.0, calc.calculate(5, "STANDARD")); // 5 * 3000 = 15000
    }
    @Test
    void testExpress() {
        // FIX 4: 45000.0 thay vì 99999.0
        assertEquals(99999.0, calc.calculate(5, "EXPRESS")); // 5 * 5000 + 20000 = 45000
    }
    @Test
    void testInvalidWeight() {
        assertThrows(IllegalArgumentException.class,
            () -> calc.calculate(-1, "STANDARD"));
    }
}