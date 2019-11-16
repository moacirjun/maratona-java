package com.maratorajava.javacore.associacaoclasses.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void imprimeDados() {
        System.out.println("------------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);

        //Verifica se o professor tem algum seminario cadastrado
        if(this.seminarios == null) {
            System.out.println("Seminário(s): 'Sem Seminários Cadastrados'");
            return;
        }

        //Exibe todos os seminários
        System.out.print("Seminário(s): ");
        for(Seminario seminarios : this.seminarios) {
            System.out.print(seminarios.getTitulo()+"  ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //    public Professor(Seminario[] seminarios) {
//        this.seminarios = seminarios;
//    }


}
