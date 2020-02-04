package com.maratorajava.javacore.LclassesAbstratas.classes;

public class ProgramadorPJ extends Funcionario {
    private double totalVendas;

    public ProgramadorPJ() {
    }

    public ProgramadorPJ(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public ProgramadorPJ(String nome, String clt, double salarioBruto, double totalVendas) {
        super(nome, clt, salarioBruto);
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalarioLiquido() {
        if (this.salarioBruto == 0) {
            this.salarioLiquido = 0;
            return;
        }

        this.salarioLiquido = this.salarioBruto + this.totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
