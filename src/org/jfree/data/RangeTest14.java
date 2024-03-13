package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest14 {

	@Test
    public void testScaleUp() {
        Range base = new Range(2.0, 4.0);
        double factor = 2.0;
        Range expected = new Range(4.0, 8.0);
        Range result = Range.scale(base, factor);
        assertEquals("Scaling up should double both bounds of the range", expected, result);
    }

    @Test
    public void testScaleDown() {
        Range base = new Range(2.0, 4.0);
        double factor = 0.5;
        Range expected = new Range(1.0, 2.0);
        Range result = Range.scale(base, factor);
        assertEquals("Scaling down should halve both bounds of the range", expected, result);
    }

    @Test
    public void testScaleByZero() {
        Range base = new Range(1.0, 5.0);
        double factor = 0.0;
        Range expected = new Range(0.0, 0.0);
        Range result = Range.scale(base, factor);
        assertEquals("Scaling by zero should result in a range from 0 to 0", expected, result);
    }

    @Test
    public void testScaleByNegative() {
        Range base = new Range(1.0, 3.0);
        double factor = -1.0;
        assertThrows("Scaling by a negative factor should throw IllegalArgumentException",
            IllegalArgumentException.class,
            () -> Range.scale(base, factor));
    }

    @Test
    public void testScaleRangeIncludingZero() {
        Range base = new Range(-2.0, 2.0);
        double factor = 2.0;
        Range expected = new Range(-4.0, 4.0);
        Range result = Range.scale(base, factor);
        assertEquals("Scaling a range that includes zero should work correctly", expected, result);
    }

    @Test
    public void testScaleVerySmallRange() {
        Range base = new Range(1E-5, 1E-4);
        double factor = 10.0;
        Range expected = new Range(1E-4, 1E-3);
        Range result = Range.scale(base, factor);
        assertEquals("Scaling a very small range should work correctly", expected, result);
    }

    @Test
    public void testScaleVeryLargeRange() {
        Range base = new Range(1E5, 1E6);
        double factor = 0.1;
        Range expected = new Range(1E4, 1E5);
        Range result = Range.scale(base, factor);
        assertEquals("Scaling a very large range should work correctly", expected, result);
    }

}
