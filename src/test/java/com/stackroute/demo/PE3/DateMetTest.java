package com.stackroute.demo.PE3;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DateMetTest {

private static DateMet value;
	
	@BeforeClass
    public static void  setup() {
         value = new DateMet();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }
    @Test
    public void testDate() {
    	assertEquals(new String[] {"Mon 13/08/2018,Sun 19/08/2018"},value.getDate(dya));
    }
    @Test
    public void testDate1() {
    	assertNotNull(value.getDate());
    }
}
