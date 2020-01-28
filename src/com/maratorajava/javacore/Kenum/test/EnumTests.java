package com.maratorajava.javacore.Kenum.test;

import com.maratorajava.javacore.Kenum.classes.Cliente;
import com.maratorajava.javacore.Kenum.classes.TipoCliente;
import com.maratorajava.javacore.Kenum.classes.TipoPagamento;

public class EnumTests {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Moacir", TipoCliente.PESSOA_JURIDICA, TipoPagamento.BOLETAO);
        System.out.println(TipoPagamento.CARTAO_CREDITO.getId());
        System.out.println(TipoPagamento.BOLETAO.getId());
        System.out.println(cliente);
    }
}
