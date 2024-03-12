package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jmock.Mockery;
import org.jmock.Expectations;

public class DataUtilitiesTest2 {

	private Mockery mockingContext;
	private Values2D values;
	
	@Before
	public void setUp() throws Exception {
		mockingContext = new Mockery();
	    values = mockingContext.mock(Values2D.class);
	}
    
	@Test
    public void calculateRowTotalForTwoValidCols() {
        mockingContext.checking(new Expectations() {{
            oneOf(values).getColumnCount();
            will(returnValue(3)); // assuming there are three columns
            oneOf(values).getValue(0, 0);
            will(returnValue(5.0));
            oneOf(values).getValue(0, 1);
            will(returnValue(3.0));
            oneOf(values).getValue(0, 2);
            will(returnValue(2.0));
        }});

        // exercise
        int[] validCols = {0, 2};
        double result = DataUtilities.calculateRowTotal(values, 0, validCols);

        // verify
        assertEquals(7.0, result, .000000001d);

        // tear-down: NONE in this test method
	}
	
	@Test
    public void calculateRowTotalForEmptyRowWithValidCols() {
        mockingContext.checking(new Expectations() {{
            oneOf(values).getColumnCount();
            will(returnValue(0)); // assuming there are no columns
            
        }});

        // exercise
        int[] validCols = {};
        double result = DataUtilities.calculateRowTotal(values, 0, validCols);

        // verify
        assertEquals(0.0, result, .000000001d);

        // tear-down: NONE in this test method
	}
	
	@Test
    public void calculateRowTotalForSingleValueWithValidCols() {
        mockingContext.checking(new Expectations() {{
            oneOf(values).getColumnCount();
            will(returnValue(1)); // assuming there is only one column
            oneOf(values).getValue(0,0);
            will(returnValue(5.0));
        }});

        // exercise
        int[] validCols = {0};
        double result = DataUtilities.calculateRowTotal(values, 0, validCols);

        // verify
        assertEquals(5.0, result, .000000001d);

        // tear-down: NONE in this test method
	}
	
	@Test(expected = NullPointerException.class)
    public void calculateRowTotalInvalidDataWithValidCols() {
        int[] validCols = {0, 1};
        DataUtilities.calculateRowTotal(null, 0, validCols);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateRowTotalInvalidValidCols() {
        mockingContext.checking(new Expectations() {{
            oneOf(values).getColumnCount();
            will(returnValue(3));
        }});

        int[] invalidCols = {0, 3}; // 3 is an invalid column index
        DataUtilities.calculateRowTotal(values, 0, invalidCols);
    }
	
	@Test
    public void calculateRowTotalWithMixedValuesAndValidCols() {
        mockingContext.checking(new Expectations() {{
            oneOf(values).getColumnCount();
            will(returnValue(4)); // assuming there are four columns
            oneOf(values).getValue(0,0);
            will(returnValue(5.0));
            oneOf(values).getValue(0,1);
            will(returnValue(-3.0));
            oneOf(values).getValue(0,2);
            will(returnValue(10.0));
            oneOf(values).getValue(0,3);
            will(returnValue(2.0));
        }});

        // exercise
        int[] validCols = {0, 2, 3};
        double result = DataUtilities.calculateRowTotal(values, 0, validCols);

        // verify
        assertEquals(17.0, result, .000000001d);

        // tear-down: NONE in this test method
	}
	
	@After
	public void tearDown() throws Exception {
		mockingContext.assertIsSatisfied();
	}
}
