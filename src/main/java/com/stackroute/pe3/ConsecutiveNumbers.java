package com.stackroute.pe3;

public class ConsecutiveNumbers {
    String result = " ";
    public String getConcesutiveNumbers (String inputString){
            String[] arrayofNumbers = inputString.trim().split(",");
            for (int i = 0; i < arrayofNumbers.length - 1; i++) {
                int diff = Integer.parseInt(arrayofNumbers[i + 1]) - Integer.parseInt(arrayofNumbers[i]);

                if (diff == 1 || diff == -1) {
                    result =inputString+" are consecutive numbers";
                } else {
                    result =inputString+" non consecutive numbers";
                    break;
                }
            }
            return result;
        }
    }

