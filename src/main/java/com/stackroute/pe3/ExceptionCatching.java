package com.stackroute.pe3;

public class ExceptionCatching {
    public String catchException(int result,int arraySize,int negativeSize) throws
                NullPointerException,NegativeArraySizeException,ArrayIndexOutOfBoundsException {
           String result1="";
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
                   throw new NullPointerException();


                } catch(NegativeArraySizeException e) {
                    throw new NegativeArraySizeException();


                } catch(ArrayIndexOutOfBoundsException e) {
                    throw new ArrayIndexOutOfBoundsException();


                }
            finally {
                    System.out.println("Catch block number \t" +i+ "\t is executed");
                }
           return null;
        }
    }

