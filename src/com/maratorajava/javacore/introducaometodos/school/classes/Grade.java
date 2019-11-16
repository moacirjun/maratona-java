package com.maratorajava.javacore.introducaometodos.school.classes;

import java.util.Date;

public class Grade {
    public double value;
    public Date date;

    public Grade(double value) {
        this.value = value;
        this.date = new Date();
    }
}
