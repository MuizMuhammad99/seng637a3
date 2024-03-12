package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest13 {

	@Test
    public void testValueWithinRange() {
        Range range = new Range(1.0, 10.0);
        double value = 5.0;
        assertEquals("Value within range should be returned as is", 5.0, range.constrain(value), 0.0);
    }

    @Test
    public void testValueBelowRange() {
        Range range = new Range(1.0, 10.0);
        double value = -5.0;
        assertEquals("Value below range should return the lower bound", 1.0, range.constrain(value), 0.0);
    }

    @Test
    public void testValueAboveRange() {
        Range range = new Range(1.0, 10.0);
        double value = 15.0;
        assertEquals("Value above range should return the upper bound", 10.0, range.constrain(value), 0.0);
    }

    @Test
    public void testValueExactlyAtLowerBound() {
        Range range = new Range(1.0, 10.0);
        double value = 1.0;
        assertEquals("Value at the lower bound should be returned as is", 1.0, range.constrain(value), 0.0);
    }

    @Test
    public void testValueExactlyAtUpperBound() {
        Range range = new Range(1.0, 10.0);
        double value = 10.0;
        assertEquals("Value at the upper bound should be returned as is", 10.0, range.constrain(value), 0.0);
    }

    @Test
    public void testNegativeRangeValueWithinRange() {
        Range range = new Range(-10.0, -1.0);
        double value = -5.0;
        assertEquals("Value within a negative range should be returned as is", -5.0, range.constrain(value), 0.0);
    }

    @Test
    public void testNegativeRangeValueBelowRange() {
        Range range = new Range(-10.0, -1.0);
        double value = -15.0;
        assertEquals("Value below a negative range should return the lower bound", -10.0, range.constrain(value), 0.0);
    }

    @Test
    public void testNegativeRangeValueAboveRange() {
        Range range = new Range(-10.0, -1.0);
        double value = 0.0;
        assertEquals("Value above a negative range should return the upper bound", -1.0, range.constrain(value), 0.0);
    }

    @Test
    public void testZeroInRange() {
        Range range = new Range(-10.0, 10.0);
        double value = 0.0;
        assertEquals("Zero within range should be returned as is", 0.0, range.constrain(value), 0.0);
    }

}
