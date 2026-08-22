/* Exercício 3: Cálculo de Salário com Desconto do INSS
Enunciado: Desenvolva um programa que receba o valor da hora de trabalho de um funcionário 
e a quantidade de horas trabalhadas no mês. O programa deve calcular o salário bruto, descontar 
uma taxa fixa de 10% referente ao INSS e exibir o salário líquido final.
Conceitos: Multiplicação, cálculo percentual e variáveis intermediárias.
Exemplo de Entrada: Valor da hora: 50.00, Horas: 160  Saída esperada: Salário Bruto: R$ 8000.00, 
Salário Líquido: R$ 7200.00
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class DescontoSalario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o valor da hora trabalhada: ");
        double TrabalhoHora = sc.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double HoraTrabalhada = sc.nextDouble();

        double SalarioBruto = TrabalhoHora * HoraTrabalhada;
        double SalarioLiquido = SalarioBruto - ((SalarioBruto * 10) /100);

        System.out.println("O salario Bruto é: " + df.format(SalarioBruto));
        System.out.println("O salario Liquido é: " + df.format(SalarioLiquido));
        sc.close();
    }
    
}
