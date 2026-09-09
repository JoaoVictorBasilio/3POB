/*Exercício 4: O Maior de Três Números
Enunciado: Faça um programa que receba três números inteiros distintos e determine qual deles é o maior.
Conceitos: Comparações compostas com operadores relacionais e lógicos.
 */

import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int maior = num1;
        if(maior < num2){
            maior = num2;
        }
        if(maior < num3){
            maior = num3;
        }
        
        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
