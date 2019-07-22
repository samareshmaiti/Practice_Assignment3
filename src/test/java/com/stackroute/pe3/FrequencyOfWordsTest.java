package com.stackroute.pe3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {
    FrequencyOfWords frequencyOfWords;
    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setup() {

        this.frequencyOfWords = new FrequencyOfWords();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown()
    {

        this.frequencyOfWords=null;
    }


    @Test
    public void givenProperInputShouldReturnPositiveOutput() throws FileNotFoundException {
       Map<String, Integer> actualResult=this.frequencyOfWords.countEachWords("/home/cgi/Desktop/test.txt");
        Assert.assertEquals("{in=1, maiti=1, samaresh=1, is=1, bengalore.=1}",actualResult);

    }
    @Test
    public void givenWrongPathShouldReturnError() throws FileNotFoundException {
        Map<String, Integer> actualResult=this.frequencyOfWords.countEachWords("/cgi/Desktop/est.txt");
        Assert.assertEquals("FileNotFoundException",actualResult);

    }
    @Test
    public void givenEmptyInputReturnError() throws FileNotFoundException {
        Map<String, Integer> actualResult=this.frequencyOfWords.countEachWords("");
        assertNotEquals("FileNotFoundException",actualResult);

    }
}