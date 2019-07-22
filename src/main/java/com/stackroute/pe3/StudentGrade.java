package com.stackroute.pe3;

public class StudentGrade {
    public String getGrades(int numberOfStudent, int[] gradesOfStudent) {
        int lengthOfGrades=gradesOfStudent.length;

        for(int i=0;i<lengthOfGrades;i++){
            if (gradesOfStudent[i] < 0 || gradesOfStudent[i]>100) {
                return "grades are out of range";
            }
        }
        if (numberOfStudent < 0) {
            return "no of student should not be less than zero";
        } else {
            return "datas are properly given";
        }

    }
}
