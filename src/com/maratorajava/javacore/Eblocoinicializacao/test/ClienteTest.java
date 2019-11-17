package com.maratorajava.javacore.Eblocoinicializacao.test;

import com.maratorajava.javacore.Eblocoinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        System.out.println("Crinado o Objeto");
        Cliente c = new Cliente();

        for(int parcela : c.getParcelas()) {
            System.out.print(parcela+" ");
        }
    }
}
