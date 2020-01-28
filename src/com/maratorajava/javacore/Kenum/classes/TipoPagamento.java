package com.maratorajava.javacore.Kenum.classes;

public enum TipoPagamento {
    CARTAO_CREDITO(1, "Cartão de Crédito"),
    CARTAO_DEBITO(2, "Cartão de Débito"),

    //Haverá casos em que você vai usar uma constante padrão para mais de uma dessas Enums
    //Nesses casos utilize 'Constant specif class body'
    BOLETAO(1, "Boletão 15% de desconto") {
        public int getId() {
            return 123123;
        }
    };

    private int tipo;
    private String nome;

    TipoPagamento(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    //Todas as Enums terão esse ID como padrão, exceto aquelas que sobrescreverem esse método
    public int getId() {
        return 123;
    }
}
