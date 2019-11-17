package com.maratorajava.javacore.Fmodificadorestatico.classes;

public class Cliente {
    /**
     * Ordem de execução da JVM ao instanciar um objeto
     * 1 - Bloco de inicialização estático é executado quando a JVM carrega a classe (só é executado uma vez)
     * 2 - Aloca espaço na memória para o objeto
     * 3 - Inicia os valores de cada atributo da classe (default ou explícito)
     * 4 - Executa o bloco de iniciação (para cada instância de objeto)
     * 5 - Executa o construtor
     */
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
