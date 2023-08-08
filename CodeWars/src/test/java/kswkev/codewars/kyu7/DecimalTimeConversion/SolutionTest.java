package kswkev.codewars.kyu7.DecimalTimeConversion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(0.02,DTC.toIndustrial(1), -2);
        assertEquals(0.03,DTC.toIndustrial(2), -2);
        assertEquals(1.75,DTC.toIndustrial(105), -2);
        assertEquals(0.05,DTC.toIndustrial("0:03"), -2);
        assertEquals(0.07,DTC.toIndustrial("0:04"), -2);
        assertEquals(1.75,DTC.toIndustrial("1:45"), -2);
        assertEquals("1:45",DTC.toNormal(1.75));
        assertEquals("0:20",DTC.toNormal(0.33));

        assertEquals(9.93,DTC.toIndustrial(596),-2);
    }


    @Test
    public  void basicStringTests() {
        assertEquals(0.05,DTC.toIndustrial("0:03"), -2);
        assertEquals(0.07,DTC.toIndustrial("0:04"), -2);
        assertEquals(1.75,DTC.toIndustrial("1:45"), -2);
    }
    @Test
    public void additionalStringTests() {

        assertEquals(1.00,DTC.toIndustrial("1:00"), -2);
        assertEquals(8.00,DTC.toIndustrial("08:00"), -2);
        assertEquals(12.00,DTC.toIndustrial("12:00"), 2);

        assertEquals(0.50,DTC.toIndustrial("0:30"), -2);
        assertEquals(0.25,DTC.toIndustrial("0:15"), -2);
        assertEquals(0.10,DTC.toIndustrial("0:06"), -2);

        assertEquals(1.50,DTC.toIndustrial("1:30"), -2);
        assertEquals(8.25,DTC.toIndustrial("8:15"), -2);
        assertEquals(12.10,DTC.toIndustrial("12:06"), -2);
    }

    @Test
    public void basicNumberTests() {
        assertEquals(0.02,DTC.toIndustrial(1), -2);
        assertEquals(0.03,DTC.toIndustrial(2), -2);
        assertEquals(1.75,DTC.toIndustrial(105), -2);
    }

    @Test
    public void additionalNumberTests() {
        assertEquals(11.98,DTC.toIndustrial(719), -2);
    }
}

