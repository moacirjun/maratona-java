package com.maratorajava.javacore.Fmodificadorestatico.test;

import com.maratorajava.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        System.out.println("Crinado o Objeto");
        Cliente c = new Cliente();

        for(int parcela : Cliente.getParcelas()) {
            System.out.print(parcela+" ");
        }
    }
}
