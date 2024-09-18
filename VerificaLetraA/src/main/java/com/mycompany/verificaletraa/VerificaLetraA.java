package com.mycompany.verificaletraa;

import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' nao aparece na string.");
        }

        scanner.close();
    }
}

