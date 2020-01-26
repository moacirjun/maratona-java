package com.maratorajava.javacore.JmodificadorFinal.classes;

public class Carro {
    public static final double VELOCIDADE_MAXIMA = 250;
    private String cor;
    private String placa;

    public Carro(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    //Métodos com o modificador final não podem ser sobrescritos (mas você pode fazer sobrecarga)
    protected final void printPlaca() {
        System.out.println(placa);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
