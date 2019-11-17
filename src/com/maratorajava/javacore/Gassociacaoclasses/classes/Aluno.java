package com.maratorajava.javacore.Gassociacaoclasses.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    public void imrimeDados() {
        System.out.println("------------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);

        //Verifica se tem seminário
        if(this.seminario == null) {
            System.out.println("Aluno não cadastrado em seminários");
            return;
        }

        System.out.println("Seminário: "+this.seminario.getTitulo());
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

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
}
