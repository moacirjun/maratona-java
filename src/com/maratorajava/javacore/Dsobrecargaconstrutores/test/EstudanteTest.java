package com.maratorajava.javacore.Dsobrecargaconstrutores.test;

import com.maratorajava.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante moa = new Estudante("moacir", "ABC-1234", new double[]{9,7,4}, "11/11/2010");
        Estudante charlinho = new Estudante("Charlinho Menezes", "ABC-1235", new double[]{1,2,1.5});
        Estudante goku = new Estudante("goku", "ABC-1236");
        Estudante alfonso = new Estudante("alfonso");

        moa.imprime();
        charlinho.imprime();
        goku.imprime();
        alfonso.imprime();
    }
}
