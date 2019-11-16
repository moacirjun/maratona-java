package com.maratorajava.javacore.modificadorestatico.classes;

public class Cliente {
    //1 - Bloco de inicialização estático é executado quando a JVM carrega a classe
    //2 - Aloca um espaço na memória para o objeto que será criado
    //3 - Cada atributo de classe é inicializado com seus valores padrões
    //4 - Bloco de inicialização não estático é inicializado
    //5 - O construtor é executado

    private static int[] parcelas;
    static {
        System.out.println("Dentro do Bloco de inicialzação Estático");
        parcelas = new int[100];

        for (int i = 1; i <= 100; i++) {
            parcelas[i-1] = i;
        }
    }

    {
        System.out.println("Bloco de Inicialiazação");
    }

    public Cliente(){
        System.out.println("Dentro do Construtor");
    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
