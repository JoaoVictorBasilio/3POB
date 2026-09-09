/*Exercício 2: Classe Circulo e Métodos com Retorno de Valor
Enunciado: Crie uma classe Circulo que possua o atributo raio (double). Defina dois métodos com retorno:
calcularArea(): retorna pi * raio^2 (use Math.PI e Math.pow()).
calcularPerimetro(): retorna 2 * pi * raio.
Na classe Main, leia o valor do raio digitado pelo usuário, instancie o círculo e exiba a área e o perímetro calculados com duas casas decimais.
Conceitos: Métodos com tipo de retorno (double), uso da classe utilitária Math e passagem de estado interno.
 */

import java.util.Scanner;

public class Circulo {
    double raio;

    double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        Circulo circulo = new Circulo();
        circulo.raio = sc.nextDouble();

        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());

        sc.close();
    }
}
