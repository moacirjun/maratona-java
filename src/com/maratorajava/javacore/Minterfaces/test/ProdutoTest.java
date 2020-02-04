package com.maratorajava.javacore.Minterfaces.test;

import com.maratorajava.javacore.Minterfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto copoTeste = new Produto("COPOMOB123-123", 50, 20);
        copoTeste.calculaFrete();
        copoTeste.calculaTaxas();

        System.out.println(copoTeste);
    }
}
