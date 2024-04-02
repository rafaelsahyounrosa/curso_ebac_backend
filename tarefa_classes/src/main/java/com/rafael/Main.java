package com.rafael;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a sua idade: ");
        int age = sc.nextInt();

        Integer ageWrapper = (Integer) age;
        System.out.println("Sua idade (" + ageWrapper + ") foi convertida para o tipo wrapper " + ageWrapper.getClass().getName());

    }
}