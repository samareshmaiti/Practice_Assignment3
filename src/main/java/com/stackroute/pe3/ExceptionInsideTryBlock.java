package com.stackroute.pe3;

import java.io.FileNotFoundException;

public class ExceptionInsideTryBlock {

        ExceptionInsideTryBlock(String msg) {
            msg = "this is bound to execute";
            System.out.println(msg);
        }

        public static void main(String[] args) throws Exception {
            try {
                int a=10;
                int b=0;
                int c=a/b;

                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                throw new Exception("exception thrown");


            }
             finally {

                System.out.println("I am here to show finally block excuted");
            }

        }
    }

