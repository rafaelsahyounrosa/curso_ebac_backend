package model;

public abstract class Carro {

    public String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public abstract void ligar();


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
