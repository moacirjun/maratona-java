package com.maratorajava.javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] nota;

    //Get & Set
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public void setNota (double[] nota) {
        this.nota = nota;
    }

    public String getNome () {
        return this.nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public double[] getNota () {
        return this.nota;
    }

    public void imprimeDados() {
        System.out.println("-------------------");
        System.out.println("Nome:   "+this.nome);
        System.out.println("Idade:  "+this.idade);

        //Verifica se o aluno tem notas
        if (this.nota == null) {
            System.out.println("Este aluno não possue notas cadastradas!");
            return;
        }

        //mostra todas as notas
        System.out.print("Notas: (");
        for (int numNota = 0; numNota < this.nota.length; numNota++) {
            System.out.print(this.nota[numNota]);

            if (numNota < this.nota.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(")");
            }
        }

        if (verificaAprovacao()) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }

    public boolean verificaAprovacao () {
        //Verifica se o aluno tem notas
        if (this.nota == null) {
            return false;
        }

        double somaNotas = 0;

        //Soma todas as notas do array
        for (double num : this.nota) {
            somaNotas += num;
        }

        //divide a soma de notas pela quantidade de notas (média)
        return somaNotas / this.nota.length >= 6;
    }
}
