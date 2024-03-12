package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest12 {

	@Test
    public void testShiftPositiveValueWithPositiveDelta() {
        double result = Range.shiftWithNoZeroCrossing(5.0, 3.0);
        assertEquals("Shifting a positive value with a positive delta should work correctly", 8.0, result, 0.0);
    }

    @Test
    public void testShiftNegativeValueWithNegativeDelta() {
        double result = Range.shiftWithNoZeroCrossing(-5.0, -3.0);
        assertEquals("Shifting a negative value with a negative delta should work correctly", -8.0, result, 0.0);
    }

    @Test
    public void testShiftPositiveValueWithNegativeDelta() {
        double result = Range.shiftWithNoZeroCrossing(5.0, -10.0);
        assertEquals("Shifting a positive value with a negative delta large enough to cross zero should clamp to zero", 0.0, result, 0.0);
    }

    @Test
    public void testShiftNegativeValueWithPositiveDelta() {
        double result = Range.shiftWithNoZeroCrossing(-5.0, 10.0);
        assertEquals("Shifting a negative value with a positive delta large enough to cross zero should clamp to zero", 0.0, result, 0.0);
    }

    @Test
    public void testShiftValueAtZeroWithPositiveDelta() {
        double result = Range.shiftWithNoZeroCrossing(0.0, 5.0);
        assertEquals("Shifting a value at zero with a positive delta should work correctly", 5.0, result, 0.0);
    }

    @Test
    public void testShiftValueAtZeroWithNegativeDelta() {
        double result = Range.shiftWithNoZeroCrossing(0.0, -5.0);
        assertEquals("Shifting a value at zero with a negative delta should work correctly", -5.0, result, 0.0);
    }

    @Test
    public void testShiftVerySmallPositiveValueWithNegativeDelta() {
        double result = Range.shiftWithNoZeroCrossing(1e-10, -1e-9);
        assertEquals("Shifting a very small positive value with a negative delta should clamp to zero", 0.0, result, 0.0);
    }

    @Test
    public void testShiftVerySmallNegativeValueWithPositiveDelta() {
        double result = Range.shiftWithNoZeroCrossing(-1e-10, 1e-9);
        assertEquals("Shifting a very small negative value with a positive delta should clamp to zero", 0.0, result, 0.0);
    }

}
