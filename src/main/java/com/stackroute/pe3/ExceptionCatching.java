package com.stackroute.pe3;

public class ExceptionCatching {


        public static void main(String args[]) {
            int result = 10;
            int arraySize = 3;
            int negativeSize = -1;
            int[] array = null;

            for(int i = 0; i<3 ; ++i)
                try {
                    switch(i) {
                        case 0:
                            result = array[0];
                            break;
                        case 1:
                            array = new int[negativeSize];
                            break;
                        case 2:
                            array = new int[arraySize];
                            result = array[arraySize];
                            break;
                    }
                } catch(NullPointerException e) {
                    System.out.println("Exception caught" +e);


                } catch(NegativeArraySizeException e) {
                    System.out.println("Exception caught" +e);


                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception caught"+e);


                }
            finally {
                    System.out.println("Catch block number \t" +i+ "\t is executed");
                }
        }
    }

