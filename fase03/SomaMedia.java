/*Exercício 2: Somatório e Média até Flag de Parada (while)

Enunciado: Crie um programa que leia continuamente números inteiros positivos fornecidos pelo usuário. A leitura deve ser encerrada imediatamente quando o usuário digitar um número negativo (flag de parada). Ao final, o programa deve exibir a quantidade de números digitados, a soma total e a média aritmética deles (desconsiderando o valor negativo).

Conceitos: Laço com condição de parada indeterminada (while), acumulador de valores e contador de iterações.
 */

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números inteiros positivos. Digite um número negativo para encerrar:");

        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhum número válido foi informado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("Quantidade de números digitados: " + contador);
            System.out.println("Soma total: " + soma);
            System.out.println("Média: " + media);
        }

        sc.close();
    }
}
