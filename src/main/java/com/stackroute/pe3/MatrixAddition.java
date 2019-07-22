package com.stackroute.pe3;

import java.util.InputMismatchException;

public class MatrixAddition {
    public int[][] findSum(int rows, int colums, int a1[][], int a2[][]) {
        int sum[][] = new int[rows][colums];
        try {

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < colums; j++) {
                    sum[i][j] = a1[i][j] + a2[i][j];
                }
            }


        }
        catch(InputMismatchException e)
        {

        }
        return sum;
    }
}
