/*Enunciado: Faça um programa que leia a base e a altura de um retângulo. Em seguida, calcule e mostre:
A área (base * altura)
O perímetro (2  * (base + altura))
Conceitos: Atribuição de múltiplas saídas a partir dos mesmos dados de entrada.
Exemplo de Entrada: Base: 5.0, Altura: 3.0 Saída esperada: Área: 15.0, Perímetro: 16.0
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Retangulo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a base do retângulo: ");
        double Base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double Area = Base * altura;
        double Perimetro = (Base + altura) * 2;

        System.out.println("A área é: " + df.format(Area));
        System.out.println("O perimetro é: " + df.format(Perimetro));
        sc.close();
    }
}