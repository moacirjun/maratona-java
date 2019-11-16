package com.maratorajava.javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario (String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: "+this.salario);
        imprimeReciboSalario();
    }

    public void imprimeReciboSalario() {
        System.out.println("Eu "+super.nome+" Recebi R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
