import model.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static List<Pessoa> mulheres;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que você deseja informar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        List<Pessoa> pessoas = new ArrayList();


        System.out.println("\nInforme as pessoas no seguinte modelo:\nNome - Sexo");

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Informe a pessoa " + (i+1) + ": ");

            String pessoa = sc.nextLine();

            String nome = pessoa.split("-")[0].trim();
            String sexo = pessoa.split("-")[1].trim();

            System.out.println("Adiconando pessoa à lista de pessoa...");
            pessoas.add(new Pessoa(nome, sexo));

        }

        sc.close();

        mulheres = filtraMulheres(pessoas);

        System.out.println("********");
        System.out.println("Mulheres");
        mulheres.forEach(System.out::println);

    }

    public static List<Pessoa> filtraMulheres(List<Pessoa> pessoas) {

        return pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Mulher"))
                .collect(Collectors.toList());
    }
}
