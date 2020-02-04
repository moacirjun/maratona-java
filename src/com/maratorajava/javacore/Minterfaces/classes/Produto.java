package com.maratorajava.javacore.Minterfaces.classes;

public class Produto implements Transportavel, Tributavel { //Uma classe pode implementar mais de um interface
    private String sku;
    private double preco;
    private double peso;
    private double frete;
    private double taxas;
    private double custoTotal;

    public Produto(String sku, double preco, double peso) {
        this.sku = sku;
        this.preco = preco;
        this.peso = peso;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFrete() {
        return frete;
    }

    public double getTaxas() {
        return taxas;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    /**
     * Para sobrescrever um método o modificador de acesso deve ser sempre igualmente ou menos restritivo.
     * Dessa forma sempre utilize o modificador de acesso public ao sobrescrever um método de uma interface
     * que não definiu nenhum modificador de acesso em su escrita. Caso contrário haverá um erro de compilação pois
     * o modificador "default" é menos restritivo que public
     */
    @Override
//  void calculaFrete() { erro de compilação
    public void calculaFrete() {
        frete = peso * 0.08;
        this.calculaCustoTotal();
    }

    @Override
    public void calculaTaxas() {
        taxas = preco * TAXAIMPOSTO;
        this.calculaCustoTotal();
    }

    private void calculaCustoTotal() {
        custoTotal = preco + frete + taxas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku='" + sku + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", frete=" + frete +
                ", taxas=" + taxas +
                ", custoTotal=" + custoTotal +
                '}';
    }
}
