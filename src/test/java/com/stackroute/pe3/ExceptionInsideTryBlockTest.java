package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionInsideTryBlockTest {
    ExceptionInsideTryBlock exceptionInsideTryBlock;

    @Before
    public void setUp()
    {
        this.exceptionInsideTryBlock=new ExceptionInsideTryBlock();
    }
    @After
    public  void tearDown()
    {
        exceptionInsideTryBlock=null;
    }

    @Test(expected=ArithmeticException.class)
    public void givenInputShouldReturnException() throws Exception
    {
        String actualResult=this.exceptionInsideTryBlock.exceptionFound(5,0);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(actualResult,expectedResult);
    }

    @Test(expected=ArithmeticException.class)
    public void givenInputShouldNotReturnException() throws Exception
    {
        String actualResult=this.exceptionInsideTryBlock.exceptionFound(5,5);
        Class<Exception> expectedResult=Exception.class;
        assertEquals(actualResult,expectedResult);
    }

}