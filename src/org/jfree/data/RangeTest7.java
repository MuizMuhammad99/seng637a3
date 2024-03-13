package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest7 {

	@Test
    public void testNonOverlappingRanges() {
        Range baseRange = new Range(1.0, 5.0);
        Range otherRange = new Range(6.0, 10.0);
        assertFalse("Non-overlapping ranges should not intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testPartiallyOverlappingRanges() {
        Range baseRange = new Range(1.0, 5.0);
        Range otherRange = new Range(4.0, 8.0);
        assertTrue("Partially overlapping ranges should intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testFullyOverlappingRanges() {
        Range baseRange = new Range(1.0, 5.0);
        Range otherRange = new Range(2.0, 4.0);
        assertTrue("Fully overlapping ranges should intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testTouchingAtUpperBound() {
        Range baseRange = new Range(1.0, 5.0);
        Range otherRange = new Range(5.0, 10.0);
        assertTrue("Ranges touching at the upper bound should intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testTouchingAtLowerBound() {
        Range baseRange = new Range(5.0, 10.0);
        Range otherRange = new Range(1.0, 5.0);
        assertTrue("Ranges touching at the lower bound should intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testSameRanges() {
        Range baseRange = new Range(1.0, 5.0);
        Range otherRange = new Range(1.0, 5.0);
        assertTrue("Identical ranges should intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testNonOverlappingWithNegativeRanges() {
        Range baseRange = new Range(-10.0, -5.0);
        Range otherRange = new Range(-4.0, 0.0);
        assertFalse("Non-overlapping ranges with negatives should not intersect", baseRange.intersects(otherRange));
    }

    @Test
    public void testOverlappingWithNegativeRanges() {
        Range baseRange = new Range(-10.0, -5.0);
        Range otherRange = new Range(-6.0, -3.0);
        assertTrue("Overlapping ranges with negatives should intersect", baseRange.intersects(otherRange));
    }

}
