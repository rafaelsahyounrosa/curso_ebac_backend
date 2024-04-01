package com.rafael;

public class Cachorro {

    private String raca;
    private float peso;
    private String cor;
    private String nome;

    public Cachorro(String raca, float peso, String cor, String nome) {
        this.raca = raca;
        this.peso = peso;
        this.cor = cor;
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void latir(){
        System.out.println(getNome() + " está latindo!");
    }
}
