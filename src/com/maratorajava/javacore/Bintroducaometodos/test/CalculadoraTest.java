package com.maratorajava.javacore.Bintroducaometodos.test;

import com.maratorajava.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        //Nova instância
        Calculadora calc = new Calculadora();

        //Chama os métodos da classe Calculadora
        calc.mostraSomaDoisInteiros(2,4);
        calc.mostraSubDoisInteiros(2,4);
        calc.mostraMultDoisInteiros(2,4);
        calc.mostraSomaInteiros(1,2,3,4,5,6,7);

        //chama as funções da classe Calculadora
        System.out.println(calc.somaDoisInteiros(2,4));
        System.out.println(calc.somaDoisNumeros(2.3,2.3));

    }
}
