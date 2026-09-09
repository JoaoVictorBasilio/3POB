/*Exercício 3: Validação de Entrada com Senha (do-while ou while)

Enunciado: Desenvolva um programa que simule a autenticação de uma senha numérica (ex: 2026). O programa deve solicitar a senha repetidamente até que o usuário informe o valor correto. Para cada tentativa errada, exiba "Senha Incorreta! Tente novamente.". Quando correta, exiba "Acesso Permitido!".

Conceitos: Validação de entradas de usuário, condição booleana de continuidade e controle de fluxo.
 */

import java.util.Scanner;

public class Valida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENHA_CORRETA = 2026;
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();

            if (senha != SENHA_CORRETA) {
                System.out.println("Senha Incorreta! Tente novamente.");
            }
        } while (senha != SENHA_CORRETA);

        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
