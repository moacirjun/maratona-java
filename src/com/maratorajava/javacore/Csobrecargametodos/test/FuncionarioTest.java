package com.maratorajava.javacore.Csobrecargametodos.test;

import com.maratorajava.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario moacir = new Funcionario("moacir", "022.434.322-00", 6200, "2520490-4");
        Funcionario vitor  = new Funcionario();
//        vitor.init("moacir", "022.434.322-00", 6200, "2520490-4");

//        vitor.setNome("Vitor o feio");
//        vitor.setCpf("012.321.456-99");
//        vitor.setSalario(1200);

        moacir.MostraDados();
        vitor.MostraDados();
    }
}
