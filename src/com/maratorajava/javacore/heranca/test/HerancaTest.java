package com.maratorajava.javacore.heranca.test;

import com.maratorajava.javacore.heranca.classes.Endereco;
import com.maratorajava.javacore.heranca.classes.Funcionario;
import com.maratorajava.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maverick");
        Endereco end = new Endereco();
        Funcionario func1 = new Funcionario("Hillary");

        p1.setCpf("022.233.111-52");
        p1.setEndereco(end);
        p1.setIdade(21);

        end.setBairro("Novo Aleixo");
        end.setRua("Caiapo");

        func1.setCpf("11.222.333-44");
        func1.setEndereco(end);
        func1.setIdade(35);
        func1.setSalario(5000);

        p1.imprime();
        System.out.println("-------------------------");
        func1.imprime();

    }

}
