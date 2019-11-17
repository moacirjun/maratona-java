package com.maratorajava.javacore.Aintroducaoclasses.test;

import com.maratorajava.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor ricardo = new Professor();

        ricardo.nome = "Ricardo Augusto";
        ricardo.matricula = "ABA-1212";
        ricardo.cpf = "464.321.654-41";
        ricardo.rg = "323123-3";

        System.out.println(" - Professor do Ano - ");
        System.out.println(ricardo.nome);
        System.out.println(ricardo.matricula);
        System.out.println(ricardo.cpf);
        System.out.println(ricardo.rg);
    }
}
