package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest8 {

	@Test
    public void testExpandToIncludeWithNullRange() {
        Range result = Range.expandToInclude(null, 5.0);
        assertNotNull("Resulting range should not be null", result);
        assertEquals("New range lower bound should match the value", 5.0, result.getLowerBound(), 0.0);
        assertEquals("New range upper bound should match the value", 5.0, result.getUpperBound(), 0.0);
    }

    @Test
    public void testExpandToIncludeWithValueInsideRange() {
        Range existingRange = new Range(1.0, 10.0);
        Range result = Range.expandToInclude(existingRange, 5.0);
        assertEquals("Range should not change if value is inside", existingRange, result);
    }

    @Test
    public void testExpandToIncludeWithValueBelowRange() {
        Range existingRange = new Range(1.0, 10.0);
        Range result = Range.expandToInclude(existingRange, -5.0);
        assertEquals("New range lower bound should match the new value", -5.0, result.getLowerBound(), 0.0);
        assertEquals("New range upper bound should remain unchanged", 10.0, result.getUpperBound(), 0.0);
    }

    @Test
    public void testExpandToIncludeWithValueAboveRange() {
        Range existingRange = new Range(1.0, 10.0);
        Range result = Range.expandToInclude(existingRange, 15.0);
        assertEquals("New range upper bound should match the new value", 15.0, result.getUpperBound(), 0.0);
        assertEquals("New range lower bound should remain unchanged", 1.0, result.getLowerBound(), 0.0);
    }

    @Test
    public void testExpandToIncludeWithValueAtLowerBound() {
        Range existingRange = new Range(1.0, 10.0);
        Range result = Range.expandToInclude(existingRange, 1.0);
        assertEquals("Range should not change if value is at the lower bound", existingRange, result);
    }

    @Test
    public void testExpandToIncludeWithValueAtUpperBound() {
        Range existingRange = new Range(1.0, 10.0);
        Range result = Range.expandToInclude(existingRange, 10.0);
        assertEquals("Range should not change if value is at the upper bound", existingRange, result);
    }

}
