package com.maratorajava.javacore.Isobrescrita.test;

import com.maratorajava.javacore.Isobrescrita.classes.Pessoa;

public class SobrescitaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Charlinho, o menino que só queria estudar");
        pessoa.setIdade(23);

        System.out.println(pessoa);
    }
}
