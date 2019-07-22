package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoveTest {
    VowelRemove vowelRemove;


    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
*/
    @Before
    public void setUp() {
        this.vowelRemove = new VowelRemove();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.vowelRemove = null;
    }

    @Test
    public void givenStringArrayShouldReturnOutputAfterRemovingVowels() {
        String[] country = {"India", "UnitedStates", "Germany", "Egypt", "czechoslovakia"};
        String[] expectedResult = {"Ind", "UntdStts", "Grmny", "Egypt", "czchslvk"};
        String[] actualResult = this.vowelRemove.removeVowel(country);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringArrayShouldReturnErrorMessage() {
        String[] country = {"India", "UnitedStates", "Germany", "Egypt", "czechoslovakia"};
        String[] expected = {"Ind", "Unitd stts", "Gerrmny", "Egypt", "czchslvk"};
        String[] actualResult = this.vowelRemove.removeVowel(country);
        assertNotEquals(expected, actualResult);

    }
    @Test
    public void givenNullStringArrayShouldReturnErrorMessage() {
        String[] country = null;
        String[] expected = null;
        String[] actualResult = this.vowelRemove.removeVowel(country);
        assertNotNull("null",actualResult);
        //assertNotNull(vowelRemove.removeVowel(actual));
    }

}