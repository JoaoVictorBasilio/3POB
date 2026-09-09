/* Exercício 1: Tabuada de um Número (for)

Enunciado: Escreva um programa em Java que solicite um número inteiro ao usuário e exiba a sua tabuada de multiplicação de 1 a 10.

Conceitos: Laço de repetição com contador determinado (for), controle de iteração e concatenação de strings na saída.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Tabuade de " + num + ":");
        int i = 0;
        for(i=1;i<=10;i++){
            System.out.println(num*i);
        }
        sc.close();
    }
}
