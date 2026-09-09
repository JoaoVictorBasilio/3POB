/*Exercício 2: Validador de Maioridade
Enunciado: Crie um programa que leia o ano de nascimento de uma pessoa e o ano atual. Calcule a idade e exiba se ela já é maior de idade (18 anos ou mais) ou menor de idade.
Conceitos: Operadores relacionais (>=) e subtração básica combinada com decisão.
 */

import java.util.Scanner;

public class ValidadorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int Ano = sc.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int AnoNasc = sc.nextInt();

        int idade = Ano - AnoNasc;

        if(idade >= 18){
            System.out.println("Maior de Idade.");
        } else {
            System.out.println("Menor de Idade");
        }
        sc.close();
    }
}