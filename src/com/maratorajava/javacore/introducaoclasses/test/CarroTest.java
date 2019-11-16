package com.maratorajava.javacore.introducaoclasses.test;

import com.maratorajava.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        //Cria uma nova instância do Objeto
        Carro voyage = new Carro();

        //Preenche o objeto
        voyage.placa = "ABC-1234";
        voyage.modelo = "voyage";
        voyage.anoFab = 2008;

        //Imprime as propriedades desse objeto um a um
        System.out.println("Placa: "+voyage.placa);
        System.out.println("Modelo: "+voyage.modelo);
        System.out.println("Ano de Fabricação: "+voyage.anoFab);
    }
}
