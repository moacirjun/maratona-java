package com.maratorajava.javacore.Fmodificadorestatico.test;

import com.maratorajava.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelcidadeLimite(120);
        System.out.println(Carro.getVelcidadeLimite());

        Carro c1 = new Carro("Fusca", 120);
        Carro c2 = new Carro("Palio", 280);
        Carro c3 = new Carro("Sandero", 230);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("===========================");

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
