package com.stackroute.pe3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {
    FirstAndLastDayOfWeek firstAndLastDayOfWeek;



    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        //arrange
        this.firstAndLastDayOfWeek = new FirstAndLastDayOfWeek();
    }

       /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){

        firstAndLastDayOfWeek= null;
    }

    /* this function will show output whether the given date is correct
     */

    @Test
    public void givenAProperDateShouldReturnFirstAndLastDateofWeek() throws Exception {
        //act
        String actualResult = this.firstAndLastDayOfWeek.getDate("16/07/2019");
        //assert

        assertEquals("Sun 28/07/2019 Mon 22/07/2019",actualResult);



    }
    @Test
    public void givenWrongInputShouldReturnError() throws Exception {
        //act
        String actualResult = this.firstAndLastDayOfWeek.getDate("0/0/70");
        //assert

        assertNotEquals("Enter non empty input",actualResult);



    }

}