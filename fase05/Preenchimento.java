/*Exercício 1: Preenchimento e Exibição de Matriz 3 x 3

Enunciado: Crie um programa em Java que declare e preencha uma matriz de inteiros 3 x 3 com valores fornecidos pelo usuário. Ao final, exiba a matriz formatada em formato de grade (linhas e colunas).

Conceitos: Declaração e instanciação de arrays bidimensionais (int[][]), laços aninhados (for dentro de for) e formatação de saída (print vs println).
 */

import java.util.Scanner;

public class Preenchimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os 9 valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
