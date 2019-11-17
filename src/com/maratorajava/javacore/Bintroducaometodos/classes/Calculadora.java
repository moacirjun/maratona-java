package com.maratorajava.javacore.Bintroducaometodos.classes;

public class Calculadora {

    //Soma dois números inteiros passados como argumentos
    public int somaDoisInteiros (int vNum1, int vNum2) {
        return vNum1+vNum2;
    }

    //Soma dois números passados como argumentos
    public double somaDoisNumeros (double vNum1, double vNum2) {
        return vNum1+vNum2;
    }

    //Printa a soma de dois números inteiros passados como argumentos
    public void mostraSomaDoisInteiros (int vNum1, int vNum2) {
        System.out.println(vNum1+vNum2);
    }

    //Printa a subtração de dois números inteiros passados como argumentos
    public void mostraSubDoisInteiros (int vNum1, int vNum2) {
        System.out.println(vNum1-vNum2);
    }

    //Printa a multiplicação de dois números inteiros passados como argumentos
    public void mostraMultDoisInteiros (int vNum1, int vNum2) {
        System.out.println(vNum1*vNum2);
    }

    public void mostraSomaInteiros (int... numeros) {
        int soma = 0;

        for (int num : numeros) {soma += num;}

        System.out.println(soma);
    }
}
