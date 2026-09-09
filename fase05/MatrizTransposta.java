/*Exercício 5: Matriz Transposta

Enunciado: Crie um programa que leia uma matriz A de dimensão 2 x 3 de números inteiros. Em seguida, construa e exiba a sua matriz transposta A^ de dimensão 3 x 2 (onde o elemento da posição [i][j] em A passa a ocupar a posição [j][i] em A^).

Conceitos: Manipulação e inversão de dimensões (linhas viram colunas), instanciação de matrizes complementares.
 */

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        System.out.println("Digite os 6 valores da matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
