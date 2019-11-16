package com.maratorajava.javacore.introducaometodos.school.classes;

public class GradeCalculator {
    public static float calculateStudentAverage(Student student) {
        Grade[] studentGrades = student.grades;

        if (studentGrades == null) {
            return 0;
        }

        int total = 0;
        int countGrades = studentGrades.length;

        for(Grade grade : studentGrades) {
            total += grade.value;
        }

        return total / countGrades;
    }
}
