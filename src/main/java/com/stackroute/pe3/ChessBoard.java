package com.stackroute.pe3;

public class ChessBoard {
    public String[][] display(int rows, int columns) throws AssertionError{
        {
            String resultArray[][] = new String[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (((i + j) % 2) == 0) {
                        resultArray[i][j] = "WW";
                    } else {
                        resultArray[i][j] = "BB";
                    }

                }


            }

            return resultArray;
        }
    }
}
