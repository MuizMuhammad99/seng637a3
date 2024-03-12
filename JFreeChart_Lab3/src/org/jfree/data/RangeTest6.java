package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest6 {

	@Test
    public void testCentralValueWithPositiveRange() {
        Range range = new Range(1.0, 9.0);
        assertEquals("The central value of a positive range should be correct", 5.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithNegativeRange() {
        Range range = new Range(-9.0, -1.0);
        assertEquals("The central value of a negative range should be correct", -5.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithZeroIncluded() {
        Range range = new Range(-5.0, 5.0);
        assertEquals("The central value of a range including zero should be correct", 0.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithZeroWidthRange() {
        Range range = new Range(5.0, 5.0);
        assertEquals("The central value of a zero-width range should be equal to its bounds", 5.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithVeryLargeRange() {
        Range range = new Range(1.0E30, 1.0E32);
        assertEquals("The central value of a very large range should be correctly calculated", 5.05E30, range.getCentralValue(), 0.000000001E30);
    }

    @Test
    public void testCentralValueWithVerySmallRange() {
        Range range = new Range(-1.0E-30, 1.0E-30);
        assertEquals("The central value of a very small range should be correctly calculated", 0.0, range.getCentralValue(), 0.000000001E-30);
    }

}
