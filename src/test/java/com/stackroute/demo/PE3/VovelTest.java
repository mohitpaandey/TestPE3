package com.stackroute.demo.PE3;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VovelTest {
private static Vovel value;
	
	@BeforeClass
    public static void  setup() {
         value = new Vovel();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }
    @Test
    public void toGetVovel() {
    	String[] str= {"nd","ntd","Stts","Grmny","gypt","czchslvk"};
    	assertEquals(new String []{"nd","ntd","Stts","Grmny","gypt","czchslvk"},value.getVovel(str));
    }
    
    @Test
    public void toGetVovel1() {
    	String[] str= {"nd","ntd","Stts","Grmny","gypt","czchslvk"};
    	assertEquals(new String []{"nd","ntd","Stts","Grmny","gypt","czchslvk"},value.getVovel(str));
    }
    
}
