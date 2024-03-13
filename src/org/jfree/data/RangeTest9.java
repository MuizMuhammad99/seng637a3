package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest9 {

	@Test
    public void testExpandTypicalRange() {
        Range original = new Range(10, 20);
        Range expanded = Range.expand(original, 0.1, 0.1); // 10% expansion on both sides
        assertEquals("Expanded range lower bound is incorrect", 9, expanded.getLowerBound(), 0.0000001d);
        assertEquals("Expanded range upper bound is incorrect", 21, expanded.getUpperBound(), 0.0000001d);
    }

    @Test
    public void testExpandZeroMargins() {
        Range original = new Range(5, 15);
        Range expanded = Range.expand(original, 0.0, 0.0); // No expansion
        assertEquals("Range should not change when expanded by zero margins", original, expanded);
    }

    @Test
    public void testExpandNegativeMargins() {
        Range original = new Range(10, 20);
        Range contracted = Range.expand(original, -0.1, -0.1); // 10% contraction
        assertEquals("Contracted range lower bound is incorrect", 11, contracted.getLowerBound(), 0.0000001d);
        assertEquals("Contracted range upper bound is incorrect", 19, contracted.getUpperBound(), 0.0000001d);
    }

    @Test
    public void testExpandWithLargeMargins() {
        Range original = new Range(0, 100);
        Range expanded = Range.expand(original, 1.0, 1.0); // 100% expansion on both sides
        assertEquals("Expanded range lower bound with large margins is incorrect", -100, expanded.getLowerBound(), 0.0000001d);
        assertEquals("Expanded range upper bound with large margins is incorrect", 200, expanded.getUpperBound(), 0.0000001d);
    }

    @Test
    public void testExpandSinglePoint() {
        Range original = new Range(50, 50); // Single point
        Range expanded = Range.expand(original, 0.5, 0.5); // 50% expansion, which should have effect
        assertEquals("Expanded range of a single point should correctly adjust lower bound", 25, expanded.getLowerBound(), 0.0000001d);
        assertEquals("Expanded range of a single point should correctly adjust upper bound", 75, expanded.getUpperBound(), 0.0000001d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpandNullRange() {
        Range.expand(null, 0.1, 0.1); // Should throw IllegalArgumentException
    }

}
