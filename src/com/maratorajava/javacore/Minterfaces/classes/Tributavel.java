package com.maratorajava.javacore.Minterfaces.classes;

/**
 * Iterfaces serve como contrato entre classes do sistema. Ela define que métodos uma classe terá, mas não a sua regra
 * de negócio
 */
public interface Tributavel {
    double TAXAIMPOSTO = 0.02;
    void calculaTaxas();
}
