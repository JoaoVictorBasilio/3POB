/*Exercício 1: Calculadora de Média Simples
Enunciado: Escreva um programa em Java que leia três notas de um aluno (números decimais),
calcule e exiba a média aritmética simples dessas notas.
Conceitos: Leitura de dados (Scanner), variáveis do tipo double, operadores aritméticos de soma 
e divisão.
Exemplo de Entrada: 7.5, 8.0, 6.5 Saída esperada: Média: 7.33
*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média dessas notas é: " + df.format(media));
        sc.close();
    }
}
