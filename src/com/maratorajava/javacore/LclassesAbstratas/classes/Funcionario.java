package com.maratorajava.javacore.LclassesAbstratas.classes;

public abstract class Funcionario {
    protected String nome;
    protected String clt;
    protected double salarioBruto;
    protected double salarioLiquido;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salarioBruto) {
        this.nome = nome;
        this.clt = clt;
        this.salarioBruto = salarioBruto;
    }

    public abstract void calculaSalarioLiquido();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }
}
