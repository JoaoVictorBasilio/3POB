/*Exercício 5: Separação em Vetores de Pares e Ímpares
Enunciado: Crie um programa que leia 10 números inteiros e os armazene em um vetor original. Em seguida, distribua os valores em dois novos vetores: um contendo apenas os números pares e outro contendo apenas os ímpares. Ao final, exiba os elementos de cada um dos novos vetores.
Conceitos: Controle de índices independentes para múltiplos vetores, operador módulo (%) e dimensionamento dinâmico ou estático de arrays auxiliares.
 */

import java.util.Scanner;

public class SeparacaoVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            original[i] = sc.nextInt();

            if (original[i] % 2 == 0) {
                pares[qtdPares] = original[i];
                qtdPares++;
            } else {
                impares[qtdImpares] = original[i];
                qtdImpares++;
            }
        }

        System.out.println("Vetor de pares:");
        for (int i = 0; i < qtdPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor de ímpares:");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
