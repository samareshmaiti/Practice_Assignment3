package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileFinderTest {
    FileFinder fileFinder;

    /* @Before annotation is used on a method containing Java
     code to run before each test case. i.e it runs before each test execution.
     In the setup method ,object of class is declared
     */
    @Before
    public void setUp() {
        //arrange
        this.fileFinder = new FileFinder();
    }
      /*  @After annotation is used on a method containing java code to run after each test case.
   These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        fileFinder= null;
    }


    /* this function will check the file input if it is not valid then raise a message wrong file and then
     test case will pass
     */
    @Test
    public void givenValidInputFileShouldReturnPositiveOutput() throws  FileNotFoundException {
        //act
        String fileLocation="/home/cgi/Desktop/";
        String actualResult=this.fileFinder.getFileName(fileLocation);
        //assert
        assertEquals("test.txt",actualResult);
    }
   /* this function will check the file input if it is valid then read file content and sent it back if both the
    data are same then match the file content.
     */

    @Test
    public void givenFileShouldReturnNameOfTextFile() throws FileNotFoundException {
        //act
        String fileLocation="/home/cgi/Music/";
        String actualResult=this.fileFinder.getFileName(fileLocation);

        //assert
        assertEquals("new 3.txt",actualResult);
    }

    @Test
    public void givenFileShouldReturnError() throws FileNotFoundException {
        //act
        String fileLocation="";
        String actualResult=this.fileFinder.getFileName(fileLocation);
        //assert
        assertNotEquals("file empty",actualResult);
    }

}