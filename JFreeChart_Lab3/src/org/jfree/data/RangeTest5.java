package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest5 {

	@Test
    public void testBothRangesNull() {
        assertNull("Combining two null ranges should return null", 
            Range.combineIgnoringNaN(null, null));
    }

    @Test
    public void testFirstRangeNullSecondRangeValid() {
        Range range2 = new Range(1.0, 5.0);
        Range result = Range.combineIgnoringNaN(null, range2);
        assertNotNull("Result should not be null when second range is valid", result);
        assertEquals("Result should be equal to the second range", range2, result);
    }

    @Test
    public void testFirstRangeValidSecondRangeNull() {
        Range range1 = new Range(2.0, 6.0);
        Range result = Range.combineIgnoringNaN(range1, null);
        assertNotNull("Result should not be null when first range is valid", result);
        assertEquals("Result should be equal to the first range", range1, result);
    }

    @Test
    public void testBothRangesValid() {
        Range range1 = new Range(1.0, 3.0);
        Range range2 = new Range(2.0, 4.0);
        Range expected = new Range(1.0, 4.0);
        Range result = Range.combineIgnoringNaN(range1, range2);
        assertEquals("Combining two valid ranges should return the correct range", expected, result);
    }

    @Test
    public void testFirstRangeContainsNaNSecondRangeValid() {
        Range range1 = new Range(Double.NaN, Double.NaN);
        Range range2 = new Range(1.0, 5.0);
        Range result = Range.combineIgnoringNaN(range1, range2);
        assertEquals("Second valid range should be returned when first range contains NaN", range2, result);
    }

    @Test
    public void testFirstRangeValidSecondRangeContainsNaN() {
        Range range1 = new Range(2.0, 6.0);
        Range range2 = new Range(Double.NaN, Double.NaN);
        Range result = Range.combineIgnoringNaN(range1, range2);
        assertEquals("First valid range should be returned when second range contains NaN", range1, result);
    }

    @Test
    public void testBothRangesContainNaN() {
        Range range1 = new Range(Double.NaN, Double.NaN);
        Range range2 = new Range(Double.NaN, Double.NaN);
        assertNull("Combining two ranges that both contain NaN should return null", 
            Range.combineIgnoringNaN(range1, range2));
    }

}
