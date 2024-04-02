package com.rafael;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = sc.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = sc.nextInt();

        var mediaResultado = media(nota1, nota2, nota3, nota4);

        if (mediaResultado >= 7){
            System.out.println("Parabéns! Você foi aprovado com média " + mediaResultado);
        } else if (mediaResultado >= 5) {
            System.out.println("Foi quase! Mas você está de recuperação com a média " + mediaResultado);
        }else {
            System.out.println("Que pena! Você está reprovado com a media " +mediaResultado);
        }
    }

    public static double media(double numero1, double numero2, double numero3, double numero4){
        return (numero1 + numero2 + numero3 + numero4) / 4 ;
    }
}