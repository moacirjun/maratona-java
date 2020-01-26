package com.maratorajava.javacore.JmodificadorFinal.classes;

//Classse com o modificador final não pode ser extendida
public final class Palio extends Carro {
    public static final Concessionaria CONCESSIONARIA;

    static {
        CONCESSIONARIA = new Concessionaria("Fiat", "Itália");
    }

    public Palio(String cor, String placa) {
        super(cor, placa);
    }

    //Não se pode sobrescrever método da super classe com modificador final
//    public void printPlaca() {
//        System.out.println("Placa: " + getPlaca());
//    }

    @Override
    public String toString() {
        return super.toString() + " " + CONCESSIONARIA;
    }
}
