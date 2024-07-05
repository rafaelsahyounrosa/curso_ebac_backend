package model;

public class CarroCaro extends Carro {

    public CarroCaro(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Usando a chave com presença de aproximação e ligando o " + this.getModelo());
    }
}
