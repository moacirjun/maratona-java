package com.maratorajava.javacore.Gassociacaoclasses.test;

import com.maratorajava.javacore.Gassociacaoclasses.classes.Aluno;
import com.maratorajava.javacore.Gassociacaoclasses.classes.Local;
import com.maratorajava.javacore.Gassociacaoclasses.classes.Professor;
import com.maratorajava.javacore.Gassociacaoclasses.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        //Criando Alunos
        Aluno moacir = new Aluno("Moacir o bonito!", 21);
        Aluno berte  = new Aluno("Lucas Berté", 20);

        //Criando Locais
        Local local1 = new Local("Edgar Quinet", "Monte Sinai");
        Local local2 = new Local("Edgar Alan Poe", "Monte Sinai");

        //Criando Professores
        Professor prof1 = new Professor("Ricardo", "Eletrônica");
        Professor prof2 = new Professor("Jô", "Biologia");


        //Seminário
        Seminario sem = new Seminario("Como Ler 150 Livros Por Ano");
        sem.setAlunos(new Aluno[]{moacir, berte});
        sem.setLocal(local1);
        sem.setProfessor(prof1);

        moacir.setSeminario(sem);

        berte.imrimeDados();
        moacir.imrimeDados();

        prof1.imprimeDados();
        sem.imprimeDados();
    }
}
