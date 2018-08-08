package com.stackroute.demo.PE3;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MatrixTest {
private static Matrix value;
	
	
	
	@BeforeClass
    public static void  setup() {
         value = new Matrix();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }
    @Test
    public void togetMat() {
    	int A[][]= {{1,3,4},{2,4,3},{3,4,5}};
    	int B[][]= {{1,3,4},{2,4,3},{1,2,4}};
    	int [][]C=new int[3][3];
    	assertEquals(true,value.methodName(A,B));
    	
    }
    
    @Test
    public void togetMat1() {
    	int A[][]= {{1,3,4},{2,4,3},{3,4,5},{2,1,5}};
    	int B[][]= {{1,3,4},{2,4,3},{1,2,4},{2,5,8}};
    	int C[][]=new int[4][4];
    	assertEquals(true,value.methodName(A,B));
    	
    }
    
}