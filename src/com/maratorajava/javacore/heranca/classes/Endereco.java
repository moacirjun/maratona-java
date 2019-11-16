package com.maratorajava.javacore.heranca.classes;

public class Endereco {
    private String rua;
    private String bairro;

    public String getEnderecoCocatenado() {
        return this.rua+"; "+this.bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
