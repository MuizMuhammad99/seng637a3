package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest11 {

	@Test
    public void testShiftAllowingZeroCrossingPositiveDelta() {
        Range base = new Range(-5.0, 5.0);
        double delta = 3.0;
        Range result = Range.shift(base, delta, true);
        assertEquals("Shifting with a positive delta allowing zero crossing should work correctly", new Range(-2.0, 8.0), result);
    }

    @Test
    public void testShiftAllowingZeroCrossingNegativeDelta() {
        Range base = new Range(-5.0, 5.0);
        double delta = -3.0;
        Range result = Range.shift(base, delta, true);
        assertEquals("Shifting with a negative delta allowing zero crossing should work correctly", new Range(-8.0, 2.0), result);
    }

    @Test
    public void testShiftDisallowingZeroCrossingPositiveDelta() {
        Range base = new Range(-5.0, -1.0);
        double delta = 3.0;
        Range result = Range.shift(base, delta, false);
        assertEquals("Shifting with a positive delta disallowing zero crossing should stop at zero", new Range(0.0, 0.0), result);
    }

    @Test
    public void testShiftDisallowingZeroCrossingNegativeDelta() {
        Range base = new Range(1.0, 5.0);
        double delta = -3.0;
        Range result = Range.shift(base, delta, false);
        assertEquals("Shifting with a negative delta disallowing zero crossing should stop at zero", new Range(0.0, 0.0), result);
    }

    @Test
    public void testShiftWithVeryLargeDeltaAllowingZeroCrossing() {
        Range base = new Range(1.0, 5.0);
        double delta = 1.0E10;
        Range result = Range.shift(base, delta, true);
        assertEquals("Shifting by a very large delta allowing zero crossing should work correctly", new Range(1.0E10 + 1.0, 1.0E10 + 5.0), result);
    }

    @Test
    public void testShiftWithVerySmallDeltaAllowingZeroCrossing() {
        Range base = new Range(1.0, 5.0);
        double delta = -1.0E-10;
        Range result = Range.shift(base, delta, true);
        assertEquals("Shifting by a very small delta allowing zero crossing should work correctly", new Range(1.0 - 1.0E-10, 5.0 - 1.0E-10), result);
    }

    @Test
    public void testShiftCrossingZeroDisallowed() {
        Range base = new Range(-2.0, 2.0);
        double delta = 5.0;
        Range result = Range.shift(base, delta, false);
        assertEquals("Shifting a range across zero when disallowed should result in the range being pinned to zero", new Range(0.0, 0.0), result);
    }

}
