package bonus.modulo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoritimoGuloso {

    public static List<Integer> darTroco(int quantia, int[] moedas) {

        Arrays.sort(moedas);
        List<Integer> resultado = new ArrayList<>();

        for (int i = moedas.length - 1; i >= 0; i--) {
            while (quantia >= moedas[i]) {
                quantia -= moedas[i];
                resultado.add(moedas[i]);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

//        int[] moedas = {5, 2, 1};
//        int quantia = 18;
//
//        List<Integer> resultado = darTroco(quantia, moedas);
//        System.out.println("Moedas usadas para dar o troco: " + resultado);

        int[] moedas2 = {5, 2, 1};
        int quantia2 = 999999999;

        List<Integer> resultado2 = darTroco(quantia2, moedas2);
        System.out.println("Moedas usadas para dar o troco: " + resultado2);
    }
}
