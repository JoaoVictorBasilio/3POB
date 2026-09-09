/*Exercício 4: Contagem de Números Pares e Ímpares em um Intervalo (for)

Enunciado: Faça um programa que leia dois valores inteiros que representam os limites de um intervalo fechado [A, B] (onde A <= B). O programa deve iterar por todos os números desse intervalo e exibir:

A quantidade de números pares.
A quantidade de números ímpares.

Conceitos: Estrutura de repetição for combinada com decisão condicional (if/else) e operador módulo (%).
 */

import java.util.Scanner;

public class ContagemParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o limite final do intervalo: ");
        int fim = sc.nextInt();

        if (inicio > fim) {
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }

        int pares = 0;
        int impares = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}