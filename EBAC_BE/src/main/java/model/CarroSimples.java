package model;

import annotations.Tabela;


@Tabela(value = "carro_simples")
public class CarroSimples extends Carro {


    public CarroSimples(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {

        System.out.println("Inserindo a chave mecânica e ligando o "+ this.getModelo());
    }
}
