package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] data) {

        int count = 0;
        StudentReport report = new StudentReport();

        for (Student student : data) {
            try {
                report.validate(student);
            } catch (NullMarksArrayException e) {
                count++;
            } catch (NullNameException e) {

            } catch (NullStudentObjectException e) {

            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] data) {

        int count = 0;
        StudentReport report = new StudentReport();

        for (Student student : data) {
            try {
                report.validate(student);
            } catch (NullNameException e) {
                count++;
            } catch (NullMarksArrayException e) {

            } catch (NullStudentObjectException e) {

            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] data) {

        int count = 0;
        StudentReport report = new StudentReport();

        for (Student student : data) {
            try {
                report.validate(student);
            } catch (NullStudentObjectException e) {
                count++;
            } catch (NullNameException e) {

            } catch (NullMarksArrayException e) {

            }
        }

        return count;
    }
}