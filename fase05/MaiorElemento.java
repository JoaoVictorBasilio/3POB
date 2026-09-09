/*Exercício 3: Maior Elemento e sua Localização (Linha e Coluna)

Enunciado: Escreva um programa que leia uma matriz 3 x 4 de números inteiros. O programa deve identificar o maior valor presente na matriz e informar exatamente a linha e a coluna onde ele se encontra.

Conceitos: Rastreamento de múltiplos índices de posição (linhaMaior, colunaMaior) e busca linear bidimensional.
 */

import java.util.Scanner;

public class MaiorElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Digite os 12 valores da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Localização: linha " + linhaMaior + ", coluna " + colunaMaior);
        sc.close();
    }
}
