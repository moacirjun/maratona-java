package com.maratorajava.javacore.Bintroducaometodos.test;

import com.maratorajava.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();

        aluno1.setNome("Moacir o bonito!");
        aluno1.setIdade(21);
        aluno1.setNota(new double[]{10, 2.5, 5.5, 8, 2, 3, 5, 8, 9, 9, 9});

        aluno1.imprimeDados();
    }
}
