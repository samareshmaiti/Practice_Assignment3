package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionPrintingTest {
    ExceptionPrinting exceptionPrinting;


    public void setUp()
    {
        this.exceptionPrinting =new ExceptionPrinting();
    }
    public void tearDown()
    {
        this.exceptionPrinting =null;
    }

    @Test(expected=NullPointerException.class)
    public void givenInputShouldReturnNullPointerException() {
        String actualResult=this.exceptionPrinting.catchException(10,0,3);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(expectedResult,actualResult);
    }

    @Test(expected=Exception.class)
    public void givenInputShouldReturnNegativeArraySizeException() {
        String actualResult=this.exceptionPrinting.catchException(0,-4,3);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(expectedResult,actualResult);
    }
    @Test(expected=Exception.class)
    public void givenInputShouldReturnNegativeArrayIndexOutOfBoundException() {
        String actualResult=this.exceptionPrinting.catchException(3,5,7);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(expectedResult,actualResult);
    }
}