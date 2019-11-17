package com.maratorajava.javacore.Gassociacaoclasses.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void imprimeDados() {
        System.out.println("------------------------------------------");
        System.out.println("Título: "+this.titulo);

        //Verifica se tem local
        if(this.local == null) {
            System.out.println("Local do seminário não cadastrado");
        } else {
            System.out.println("Local: Bairro - " + this.local.getBairro() + "; Rua - " + this.local.getRua());
        }

        //Verifica se tem professor
        if(this.local == null) {
            System.out.println("Professor do seminário não cadastrado");
        } else {
            System.out.println("Professor: " + this.professor.getNome());
        }

        //Verifica se o Seminario tem algum aluno cadastrado
        if(this.alunos == null) {
            System.out.println("Alunos: 'Sem Alunos Cadastrados'");
        } else {
            //Exibe todos os alunos
            System.out.print("Alunos: ");
            for (Aluno alunos : this.alunos) {
                System.out.print(alunos.getNome() + "  ");
            }
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
