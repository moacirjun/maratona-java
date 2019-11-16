package com.maratorajava.javacore.modificadorestatico.classes;

public class Carro {
    private String nome;
    private int velicidadeMaxima;
    private static int velcidadeLimite = 240;

    public Carro(String nome, int velicidadeMaxima) {
        this.nome = nome;
        this.velicidadeMaxima = velicidadeMaxima;
    }

    public Carro() {
    }

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velicidadeMaxima);
        System.out.println("Velocidade Limite: "+velcidadeLimite);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelicidadeMaxima() {
        return velicidadeMaxima;
    }

    public void setVelicidadeMaxima(int velicidadeMaxima) {
        this.velicidadeMaxima = velicidadeMaxima;
    }

    public static int getVelcidadeLimite() {
        return velcidadeLimite;
    }

    public static void setVelcidadeLimite(int velcidadeLimite) {
        Carro.velcidadeLimite = velcidadeLimite;
    }
}
