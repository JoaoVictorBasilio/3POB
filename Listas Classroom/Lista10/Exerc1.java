/*Exercício 1: Divisão Segura com Múltiplos Blocos catch e finally
Enunciado: Crie um programa que solicite ao usuário dois números inteiros e realize a divisão do primeiro pelo segundo. Trate especificamente as seguintes situações:
Divisão por zero (ArithmeticException).
Entrada de dados não numéricos (InputMismatchException).
Utilize o bloco finally para garantir a exibição da mensagem "Operação finalizada." e o fechamento do recurso Scanner.
Conceitos: Blocos try-catch múltiplos, tratamento de exceções nativas da biblioteca padrão e garantia de liberação de recursos com finally.
 */

package Lista10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite os dois números: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro, digite apenas números");
        } catch (ArithmeticException e){
            System.out.println("Erro, não da para fazer divisão por zero");
        } finally {
            System.out.println("Operação finalizada");
            sc.close();
        }
    }
}