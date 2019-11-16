package com.maratorajava.javacore.introducaometodos.test;

import com.maratorajava.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor moacir = new Professor();

        moacir.cpf = "022.434.322-00";
        moacir.nome = "Moacir Lima Jr";
        moacir.matricula = "ABC-2122";
        moacir.rg = "2520490-4";

        moacir.imprimeInfoprofessor();
    }
}
