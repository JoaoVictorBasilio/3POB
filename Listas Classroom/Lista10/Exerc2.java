/*Exercício 2: Conversão de Vetor com NumberFormatException e ArrayIndexOutOfBoundsException
Enunciado: Desenvolva um programa que contenha um vetor estático de Strings com 4 posições (ex: {"10", "25", "abc", "50"}). Solicite ao usuário um índice para acessar e converter o valor correspondente para um número inteiro (Integer.parseInt). Trate as exceções caso o usuário informe um índice inexistente ou se a string da posição escolhida não for um número válido.
Conceitos: Captura de exceções de índice fora do limite (ArrayIndexOutOfBoundsException) e falha de conversão numérica (NumberFormatException).
 */
package Lista10;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String args[]) {
        String[] vetor = {"10", "25", "abc","50"};
        Scanner sc = new Scanner(System.in);

       try{ System.out.print("Digite um indice de 1 a 4: ");
        int indice = sc.nextInt();
        indice--;
        int numero = Integer.parseInt(vetor[indice]);
        System.out.println("Número convertido: " + numero);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Índice fora do limite.");
    } catch (NumberFormatException e) {
        System.out.println("String não é um número válido.");
    } finally {
        sc.close();
    }

    }
}
