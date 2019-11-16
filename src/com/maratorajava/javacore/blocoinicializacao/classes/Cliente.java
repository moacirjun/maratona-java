package com.maratorajava.javacore.blocoinicializacao.classes;

public class Cliente {
    private int[] parcelas;
    {
        System.out.println("Dentro do Bloco de inicialzação");
        parcelas = new int[100];

        for (int i = 1; i <= 100; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
        System.out.println("Dentro do Construtor");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
