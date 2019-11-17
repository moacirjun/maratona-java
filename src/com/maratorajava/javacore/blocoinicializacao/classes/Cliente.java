package com.maratorajava.javacore.blocoinicializacao.classes;

public class Cliente {
    /**
     * Ordem de execução da JVM ao instanciar um objeto
     * 1 - Aloca espaço na memória para o objeto
     * 2 - Inicia os valores de cada atributo da classe (default ou explícito)
     * 3 - Executa o bloco de iniciação
     * 4 - Executa o construtor
     */
    private int[] parcelas;

    {
        System.out.println("Dentro do Bloco de inicialzação");
        this.parcelas = new int[100];

        for (int i = 1; i <= 100; i++) {
            this.parcelas[i - 1] = i;
        }
    }

    public Cliente() {
        System.out.println("Dentro do Construtor");

        for (int parcela : this.parcelas) {
            System.out.print(parcela + " ");
        }

        System.out.println("\n-------------------------");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
