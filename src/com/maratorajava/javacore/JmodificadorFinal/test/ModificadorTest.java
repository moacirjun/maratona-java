package com.maratorajava.javacore.JmodificadorFinal.test;

import com.maratorajava.javacore.JmodificadorFinal.classes.Carro;
import com.maratorajava.javacore.JmodificadorFinal.classes.Palio;

public class ModificadorTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Branco", "ABC-1234");
        Palio palio = new Palio("Preto", "ABC-5678");

//        palio.CONCESSIONARIA = new Concessionaria("teste", "teste"); //-> Erro de compilação ao tentar modificar uma propriedade final
//        carro.VELOCIDADE_MAXIMA = 400; //-> Erro de compilação ao tentar modificar uma propriedade final

        System.out.println(carro);
        System.out.println(palio);
    }
}
