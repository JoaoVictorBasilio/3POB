/*Exercício 5: Classificação de Triângulos
Enunciado: Crie um programa que leia os três lados de um triângulo (A, B e C). Primeiro, verifique se as medidas formam um triângulo válido (a soma de dois lados quaisquer deve ser sempre maior que o terceiro lado). Se for válido, classifique-o como:
Equilátero: Todos os três lados iguais.
Isósceles: Apenas dois lados iguais.
Escaleno: Todos os três lados diferentes.
Se não formar um triângulo, exiba uma mensagem de erro.
Conceitos: Condicionais aninhadas, validação de dados prévia e operadores de igualdade/desigualdade (==, !=).
 */

import java.util.Scanner;

public class ClassTriangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três lados: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if(lado1 + lado2 > lado3 && lado1+ lado3 > lado2 && lado2 + lado3 > lado1){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Triângulo Equilátero!");
            } else if(lado1 == lado2 && lado1 != lado3){
                System.out.println("Triângulo Isósceles!");
            } else {
                System.out.println("Triângulo Escaleno!");
            }
        } else {
            System.err.println("Não é um triângulo!");
        }
        sc.close();
    }
}