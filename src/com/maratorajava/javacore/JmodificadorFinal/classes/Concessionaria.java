package com.maratorajava.javacore.JmodificadorFinal.classes;

public class Concessionaria {
    private String nome;
    private String pais;

    public Concessionaria(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
