package com.maratorajava.javacore.sobrecargaconstrutores.classes;

public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    Estudante() {}

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, String matricula) {
        this(nome);
        this.matricula = matricula;
    }

    public Estudante(String nome, String matricula, double[] notas) {
        this(nome, matricula);
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.dataMatricula);

        if (this.notas == null) {
            System.out.println("Estudante sem notas cadastradas!");
            return;
        }

        System.out.print("Notas: ");
        for (double nota : this.notas) {
            System.out.print(nota + " ");
            System.out.println("");
        }
    }
}
