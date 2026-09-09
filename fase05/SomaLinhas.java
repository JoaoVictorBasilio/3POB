/*Exercício 4: Soma por Linhas

Enunciado: Faça um programa que leia uma matriz 4 x 3 de números inteiros. Em seguida, calcule a soma dos elementos de cada linha individualmente e armazene os resultados em um vetor unidimensional de tamanho 4. Ao final, exiba a soma correspondente a cada linha.

Conceitos: Integração entre arrays bidimensionais e unidimensionais, reinicialização de acumuladores dentro do laço externo.
 */

import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        int[] somaLinhas = new int[4];

        System.out.println("Digite os 12 valores da matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                somaLinhas[i] += matriz[i][j];
            }
        }

        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }

        sc.close();
    }
}
