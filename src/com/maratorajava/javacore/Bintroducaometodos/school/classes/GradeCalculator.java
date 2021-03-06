package com.maratorajava.javacore.Bintroducaometodos.school.classes;

public class GradeCalculator {
    public static float calculateStudentAverage(Student student) {
        Grade[] studentGrades = student.grades;

        if (studentGrades == null) {
            return 0;
        }

        float total = 0;
        int countGrades = studentGrades.length;

        for(Grade grade : studentGrades) {
            total += grade.value;
        }

        return total / countGrades;
    }
}
