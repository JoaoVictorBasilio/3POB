/*Exercício 2: Soma dos Elementos da Diagonal Principal

Enunciado: Desenvolva um programa que leia uma matriz quadrada de ordem 4 (4 x 4) de números reais (double). O programa deve calcular e exibir a soma de todos os elementos que pertencem à diagonal principal (onde o índice da linha é igual ao índice da coluna: i == j).

Conceitos: Matrizes quadradas, identificação geométrica de índices e otimização de iteração (laço único vs laços aninhados).
 */

import java.util.Scanner;

public class SomaDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double soma = 0;

        System.out.println("Digite os 16 valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            soma += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + soma);
        sc.close();
    }
}
