package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileReadTest {
    FileRead fileRead;

    /* @Before annotation is used on a method containing Java
     code to run before each test case. i.e it runs before each test execution.
     In the setup method ,object of class is declared
     */
    @Before
    public void setUp() {
        //arrange
        this.fileRead = new FileRead();
    }
      /*  @After annotation is used on a method containing java code to run after each test case.
   These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        fileRead= null;
    }


    /* this function will check the file input if it is not valid then raise a message wrong file and then
     test case will pass
     */
    @Test
    public void givenInvalidFileShouldReturnError() throws IOException, FileNotFoundException {
        //act
        String fileLocation="/home/cgi/Desktop/tes.txt";
        String actualResult=this.fileRead.getFileContent(fileLocation);
        //assert
        assertNotEquals("wrong file",actualResult);
    }
   /* this function will check the file input if it is valid then read file content and sent it back if both the
    data are same then match the file content.
     */

    @Test
    public void givenFileShouldReturnContentOfFiles() throws IOException,FileNotFoundException {
        //act
        String fileLocation="/home/cgi/Desktop/test.txt";
        String actualResult=this.fileRead.getFileContent(fileLocation);
        String fileContent="samaresh maiti is in bengalore.";
        //assert
        assertNotEquals(fileContent,actualResult);
    }

    @Test
    public void givenFileShouldReturnError() throws IOException,FileNotFoundException {
        //act
        String fileLocation="";
        String actualResult=this.fileRead.getFileContent(fileLocation);
        //assert
        assertEquals("file empty",actualResult);
    }



}