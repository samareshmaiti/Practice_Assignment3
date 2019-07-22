package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumbers;

    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        //arrange
        this.consecutiveNumbers = new ConsecutiveNumbers();
    }

       /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){

        consecutiveNumbers= null;
    }

    /* this function will show output whether the given date is correct
     */
    @Test
    public void checkNon() {
        //boolean expected = false;

        String  actualResult = consecutiveNumbers.getConcesutiveNumbers("98,96,95,94,93,92,90");

        assertEquals("98,96,95,94,93,92,90 non consecutive numbers",actualResult);
    }

    @Test
    public void checkConsOne() {
       // boolean expected = true;
       String actualResult = consecutiveNumbers.getConcesutiveNumbers("54,53,52,51,50,49,48");

        assertEquals("54,53,52,51,50,49,48 are consecutive numbers",actualResult);
    }

    @Test
    public void checknonConsTwo() {
        //boolean expected = false;
       String actualResult = consecutiveNumbers.getConcesutiveNumbers("1,2,3,4,5,6,6");

       assertEquals("1,2,3,4,5,6,6 non consecutive numbers",actualResult);
    }

}