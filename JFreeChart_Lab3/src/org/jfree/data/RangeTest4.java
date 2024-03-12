package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest4 {

	@Test
    public void toStringWithPositiveRange() {
        Range range = new Range(1.0, 10.0);
        assertEquals("ToString with positive range failed", "Range[1.0,10.0]", range.toString());
    }

    @Test
    public void toStringWithNegativeRange() {
        Range range = new Range(-10.0, -1.0);
        assertEquals("ToString with negative range failed", "Range[-10.0,-1.0]", range.toString());
    }

    @Test
    public void toStringWithMixedRange() {
        Range range = new Range(-5.0, 5.0);
        assertEquals("ToString with mixed range failed", "Range[-5.0,5.0]", range.toString());
    }

    @Test
    public void toStringWithZeroBoundaries() {
        Range range = new Range(0.0, 0.0);
        assertEquals("ToString with zero boundaries failed", "Range[0.0,0.0]", range.toString());
    }

    @Test
    public void toStringWithVeryLargeRange() {
        Range range = new Range(1.0E30, 1.0E31);
        assertEquals("ToString with very large range failed", "Range[1.0E30,1.0E31]", range.toString());
    }

    @Test
    public void toStringWithVerySmallRange() {
        Range range = new Range(-1.0E-30, 1.0E-30);
        assertEquals("ToString with very small range failed", "Range[-1.0E-30,1.0E-30]", range.toString());
    }

    @Test
    public void toStringWithHighPrecisionRange() {
        Range range = new Range(0.1234567890123456, 0.9876543210987654);
        assertEquals("ToString with high precision range failed", "Range[0.1234567890123456,0.9876543210987654]", range.toString());
    }

}
