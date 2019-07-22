package com.stackroute.pe3;

import java.io.FileNotFoundException;

public class ExceptionInsideTryBlock {
    public String exceptionFound(int a,int b) throws Exception,ArithmeticException {
            try {

                int c=a/b;

                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                throw new ArithmeticException();


            }
             finally {

                System.out.println("I am here to show finally block excuted");
            }


        }

    }

