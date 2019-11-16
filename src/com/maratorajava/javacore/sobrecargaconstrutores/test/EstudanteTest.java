package com.maratorajava.javacore.sobrecargaconstrutores.test;

import com.maratorajava.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante moa = new Estudante("moacir", "ABC-1234", new double[]{9,7,4}, "11/11/2010");

        moa.imprime();
    }
}
