/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Random;

package com.mycompany.matriz;

/**
 *
 * @author Yo
 */
public class Matriz {

    public static void main(String[] args) {
         int[][] matriz = new int[5][5];
        Random random = new Random();
        
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100); // Preenche com valores entre 0 e 99
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // a) Calculando a soma dos números ímpares
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("\nSoma dos números ímpares: " + somaImpares);

        // b) Calculando a soma de cada coluna
        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }

         // c) Calculando a soma de cada linha
        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

    }
}
