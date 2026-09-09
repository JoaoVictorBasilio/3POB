/*Exercício 1: Armazenamento e Leitura Inversa
Enunciado: Escreva um programa em Java que declare um array de inteiros de tamanho 5, leia os 
5 valores informados pelo usuário e, em seguida, exiba todos os elementos na ordem inversa à 
que foram digitados.
Conceitos: Declaração e instanciação de vetores, manipulação de índices e iteração decrescente 
(i--).
 */

import java.util.Scanner;

public class ArmazanamentoLeitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        System.out.println("Ordem inversa:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }

        sc.close();
    }
}
