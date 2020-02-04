package com.maratorajava.javacore.LclassesAbstratas.classes;

public class Programador extends Funcionario {
    public Programador() {
    }

    public Programador(String nome, String clt, double salarioBruto) {
        super(nome, clt, salarioBruto);
    }

    @Override
    public void calculaSalarioLiquido() {
        if (this.salarioBruto == 0) {
            this.salarioLiquido = 0;
            return;
        }

        this.salarioLiquido = this.salarioBruto * 0.8;
    }
}
