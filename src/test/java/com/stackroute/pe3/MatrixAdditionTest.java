package com.stackroute.pe3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;

    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        //arrange
        this.matrixAddition = new MatrixAddition();
    }

       /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown(){

        matrixAddition= null;
    }

    /* this function will show output whether the given number of rows and columns of two matrix are equal
     */

    @Test
    public void givenProperInputShouldReturnPositiveResult() {
        int[][] expected = {{10,10,10}, {10, 10,10}};
        int a1[][] = {{1,2,3}, {4,5,6}};
        int a2[][] = {{9,8,7},{6,5,4}};
        int[][] actual = matrixAddition.findSum(2, 3, a1, a2);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void givenImproperInputShouldReturnNegativeResult() {
        int[][] expected = {{10,10,10}, {10, 10,10}};
        int a1[][] = {{1,2,3}, {4,5}};
        int a2[][] = {{9,8,7},{6,5}};
        int[][] actual = matrixAddition.findSum(2, 3, a1, a2);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void givenEmptyInputShouldReturnError() {
        int[][] expected = null;
        int a1[][] = null;
        int a2[][] = null;
        int[][] actual = matrixAddition.findSum(0, 0, a1, a2);

        assertNotEquals(null, actual);
    }

}