package com.maratorajava.javacore.heranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome:  " + this.nome);
        System.out.println("CPF:   " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereco: " + this.endereco.getEnderecoCocatenado());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
