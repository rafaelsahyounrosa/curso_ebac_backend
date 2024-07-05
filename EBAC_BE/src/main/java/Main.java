import model.Carro;
import model.CarroCaro;
import model.CarroSimples;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        CarroSimples carroSimples1 = new CarroSimples("Uno");
        CarroSimples carroSimples2 = new CarroSimples("Kwid");

        CarroCaro carroCaro1 = new CarroCaro("X5");
        CarroCaro carroCaro2 = new CarroCaro("X6");


        carros.add(carroSimples1);
        carros.add(carroSimples2);
        carros.add(carroCaro1);
        carros.add(carroCaro2);

        imprimeLista(carros);


    }

    public static void imprimeLista(List<? extends Carro> lista) {

        for (Carro obj : lista) {
            obj.ligar();
        }
    }
}
