/*Exercício 2: Conversor de Temperatura (Celsius para Fahrenheit)
Enunciado: Crie um programa que solicite uma temperatura em graus Celsius ($C$) e a converta para
 Fahrenheit (F) utilizando a fórmula:
F = (C * 1.8) + 32 
Conceitos: Operações aritméticas com precedência de parênteses e formatação de saída.
Exemplo de Entrada: 25.0  Saída esperada: 77
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorTemp {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a temperatura em Celsius: ");
        double Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + df.format(Fahrenheit));
        sc.close();
    }
}
