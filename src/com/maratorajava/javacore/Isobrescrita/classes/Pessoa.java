package com.maratorajava.javacore.Isobrescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    /**
     * Regras para sobrescrita
     * 1 - Precisa ter um modificar de acesso igual ou menos restrito que o método original
     * 2 - Precisa ter o mesmo retorno, ou no casso de classes retornar a mesma ou uma classe mais genérica (Poliformismo)
     * 3 - Precisa ter a mesma quantidade e tipagem de parâmetros
     */
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
