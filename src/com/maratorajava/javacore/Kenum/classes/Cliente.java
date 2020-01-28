package com.maratorajava.javacore.Kenum.classes;

public class Cliente {
    private String nome;
    private TipoCliente tipo;
    private TipoPagamento pagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento pagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.pagamento = pagamento;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public TipoPagamento getPagamento() {
        return this.pagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", pagamento=" + pagamento.getNome() +
                ", pagamentoID=" + pagamento.getTipo() +
                '}';
    }
}
