/*Exercício 4: Classe Funcionario com Métodos de Aumento Percentual
Enunciado: Desenvolva uma classe Funcionario com os atributos nome (String), cargo (String) e salarioBruto (double). Adicione os métodos:
aplicarAumento(double porcentagem): ajusta o salarioBruto somando o acréscimo percentual informado.
calcularSalarioLiquido(double descontoImposto): retorna o salário líquido após abater um valor fixo informado por parâmetro.
No método principal, instancie um funcionário, aplique um aumento de 10% e exiba os valores antes e após a alteração.
Conceitos: Mutação de atributos por métodos operacionais e cálculo percentual dentro do domínio do objeto.
 */

public class Funcionario {
    String nome;
    String cargo;
    double salarioBruto;

    void aplicarAumento(double porcentagem) {
        double aumento = salarioBruto * (porcentagem / 100);
        salarioBruto += aumento;
    }

    double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Maria";
        funcionario.cargo = "Analista";
        funcionario.salarioBruto = 3000.0;

        System.out.println("Salário antes do aumento: R$ " + funcionario.salarioBruto);
        funcionario.aplicarAumento(10);
        System.out.println("Salário depois do aumento: R$ " + funcionario.salarioBruto);
        System.out.println("Salário líquido: R$ " + funcionario.calcularSalarioLiquido(250.0));
    }
}
