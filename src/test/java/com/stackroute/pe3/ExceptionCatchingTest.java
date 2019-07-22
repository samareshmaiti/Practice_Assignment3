package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionCatchingTest {
    ExceptionCatching exceptionCatching;


    public void setUp()
    {
        this.exceptionCatching=new ExceptionCatching();
    }
    public void tearDown()
    {
        this.exceptionCatching=null;
    }

    @Test(expected=NullPointerException.class)
    public void givenInputShouldReturnNullPointerException() {
        String actualResult=this.exceptionCatching.catchException(10,0,3);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(expectedResult,actualResult);
    }

    @Test(expected=Exception.class)
    public void givenInputShouldReturnNegativeArraySizeException() {
        String actualResult=this.exceptionCatching.catchException(0,-4,3);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(expectedResult,actualResult);
    }
    @Test(expected=Exception.class)
    public void givenInputShouldReturnNegativeArrayIndexOutOfBoundException() {
        String actualResult=this.exceptionCatching.catchException(3,5,7);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(expectedResult,actualResult);
    }
}