package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student data)
            throws NullStudentObjectException, NullNameException, NullMarksArrayException {

        if (data == null) {
            throw new NullStudentObjectException();
        }

        if (data.getName() == null) {
            throw new NullNameException();
        }

        if (data.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student data) {

        int[] marks = data.getMarks();

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        int average = total / marks.length;

        if (average >= 80) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}