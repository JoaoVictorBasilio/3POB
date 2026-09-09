/*Exercício 4: Busca Linear de Elemento
Enunciado: Faça um programa que leia um vetor de 6 números inteiros. Em seguida, solicite ao usuário um número de busca ($X$). O programa deve informar se $X$ está presente no vetor e, caso esteja, exibir a primeira posição (índice) onde ele foi encontrado. Se não estiver presente, exibir uma mensagem indicando ausência.
Conceitos: Algoritmo de busca sequencial, uso de flag booleana (boolean encontrado) e interrupção de repetição com break.
 */

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor a ser buscado: ");
        int busca = sc.nextInt();

        boolean encontrado = false;
        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                encontrado = true;
                indice = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor " + busca + " foi encontrado na posição " + indice + ".");
        } else {
            System.out.println("O valor " + busca + " não está presente no vetor.");
        }

        sc.close();
    }
}
