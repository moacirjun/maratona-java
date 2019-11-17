package com.maratorajava.javacore.Aintroducaoclasses.test;
import com.maratorajava.javacore.Aintroducaoclasses.classes.Estutante;

public class EstudanteTest  {
    public static void main(String[] args){
        Estutante moacir = new Estutante();

        moacir.nome = "moacir Carvalho Jr";
        moacir.matricula = "ABC-2122";
        moacir.idade = 21;

        System.out.println(" - Alunos Matriculados - ");
        System.out.println("Nome: "+moacir.nome);
        System.out.println("Matrícula: "+moacir.matricula);
        System.out.println("Idade: "+moacir.idade);
    }
}
