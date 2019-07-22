package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade studentGrade;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
I   n the setup method ,object of class is declared
    */
    @Before
    public void setUp()  {
        //arrange
        this.studentGrade = new StudentGrade();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {

        studentGrade = null;
    }


    /* this function will input of negative number of studnts and 4 grades of students and should return
    error message
     */
    @Test
    public void givenInputShouldReturnNumberMustBePositive() {
        int[] grades={20,30,40,50};
        String actualresult = studentGrade.getGrades(-4,grades);
        assertEquals("no of student should not be less than zero", actualresult);
    }
    /* this function will input 4 grades of students and should return successful message that value is in range
     */
    @Test
    public void givenInputShouldReturnProperMessage() {
        int[] grades={10,20,30,40,50,60,70};
        String actualresult = studentGrade.getGrades(7,grades);
        assertEquals("datas are properly given", actualresult);
    }
    /* this function will input 4 grades of students and should return error message that value should be in range
     */
    @Test
    public void givenInputShouldReturnOutOfRange() {
        int[] grades={100,130,40,-200,40,60,250};
        String actualresult = studentGrade.getGrades(7,grades);
        assertEquals("grades are out of range", actualresult);
    }
    /* this function will take input of number of students and 4 grades of students and should return
   same output as input
    */
    @Test
    public void givenProperInputShouldReturnPositiveOutput() {
        int[] grades={20,30,40,50};
        String actualresult = studentGrade.getGrades(4,grades);
        assertEquals("datas are properly given", actualresult);
    }


}