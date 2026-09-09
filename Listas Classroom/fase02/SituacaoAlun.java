/*Exercício 3: Situação do Aluno (Aprovado, Recuperação ou Reprovado)
Enunciado: Desenvolva um programa que leia duas notas de um aluno, calcule a média aritmética e determine a situação acadêmica com base nas seguintes regras:
Média maior ou igual a 7.0: Aprovado
Média entre 5.0 (inclusive) e 6.9: Em Recuperação
Média abaixo de 5.0: Reprovado
Conceitos: Estrutura condicional encadeada (if-else if-else) e operadores lógicos (&&).
 */

import java.util.Scanner;

public class SituacaoAlun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aluno aprovado!");
        } else if(media < 7 && media >= 5){
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        sc.close();
    }
}
