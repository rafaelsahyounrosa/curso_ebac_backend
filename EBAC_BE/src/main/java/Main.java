import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que você deseja informar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        List<String> homens = new ArrayList();
        List<String> mulheres = new ArrayList();

        System.out.println("\nInforme as pessoas no seguinte modelo:\nNome - Sexo");

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Informe a pessoa " + (i+1) + ": ");

            String pessoa = sc.nextLine();

            String nome = pessoa.split("-")[0].trim();
            String sexo = pessoa.split("-")[1].trim();

//            System.out.println(Arrays.toString(pessoa.split("-")));
//            System.out.println(nome);
//            System.out.println(sexo);

            if (sexo.equalsIgnoreCase("homem")) {
                homens.add(nome);
                System.out.println("Adicionando à lista dos homens");
            }else if (sexo.equalsIgnoreCase("mulher")) {
                mulheres.add(nome);
                System.out.println("Adicionando à lista das mulheres");
            }
        }

        sc.close();
        System.out.println(homens);
        System.out.println(mulheres);

    }
}
