/*Enunciado: Escreva um programa que leia um valor inteiro representando um total de segundos e o decomponha em horas, minutos e segundos restantes.
Conceitos: Divisão inteira (/) e operador de resto da divisão (%).
Exemplo de Entrada: 3665 Saída esperada: 1 hora(s), 1 minuto(s) e 5 segundo(s)
 */

import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int segundos = sc.nextInt();

        int horas = 0;
        int minutos = 0;

        if(segundos >= 60){
            minutos = segundos / 60;
            segundos = segundos % 60;
        }
        if(minutos >= 60){
            horas = minutos / 60;
            minutos = minutos % 60;
        }

        System.out.println("O valor convertido é: " + horas + " horas, " + minutos + " minutos " + segundos + " segundos");
        sc.close();
}
}
