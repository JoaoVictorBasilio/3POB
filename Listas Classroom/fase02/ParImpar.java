/*Exercício 1: Par ou Ímpar
Enunciado: Escreva um programa em Java que leia um número inteiro e informe se ele é par ou ímpar.
Conceitos: Operador módulo (%) e estrutura if-else simples.
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        sc.close();
    }
}
