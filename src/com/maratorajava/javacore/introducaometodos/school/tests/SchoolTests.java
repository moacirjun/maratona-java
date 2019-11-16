package com.maratorajava.javacore.introducaometodos.school.tests;

import com.maratorajava.javacore.introducaometodos.school.classes.Grade;
import com.maratorajava.javacore.introducaometodos.school.classes.GradeCalculator;
import com.maratorajava.javacore.introducaometodos.school.classes.Student;

public class SchoolTests {
    public static void main(String[] args) {
        Grade grade1 = new Grade(8);
        Grade grade2 = new Grade(2);
        Grade grade3 = new Grade(7);
        Student student = new Student();

        student.name = "Moacir";
        student.lastName = "Carvalho";
        student.age = 23;
        student.grades = new Grade[]{grade1, grade2, grade3};

        System.out.println(GradeCalculator.calculateStudentAverage(student));
    }
}
