/*Exercício 5: Cálculo do Fatorial de um Número (for ou while)

Enunciado: Crie um programa que receba um número inteiro não negativo N e calcule o seu fatorial N!

Conceitos: Variável acumuladora de produto (inicializada em 1), controle de laço decrescente/crescente e tipo de dado numérico para evitar overflow (long).
 */

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Erro: o número deve ser maior ou igual a zero.");
            sc.close();
            return;
        }

        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        sc.close();
    }
}