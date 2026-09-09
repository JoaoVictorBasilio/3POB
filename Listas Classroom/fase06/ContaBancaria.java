/*Exercício 3: Classe ContaBancaria com Parâmetros e Validações Simples
Enunciado: Crie uma classe ContaBancaria com os atributos titular (String), numeroConta (String) e saldo (double, iniciando em zero). Implemente os métodos:
depositar(double valor): adiciona o valor ao saldo se valor > 0.
sacar(double valor): subtrai o valor do saldo apenas se houver saldo suficiente (saldo >= valor) e se valor > 0; caso contrário, imprime "Saldo insuficiente ou valor inválido".
consultarSaldo(): imprime o saldo atual.
Instancie uma conta no método principal e teste sequências válidas e inválidas de saques e depósitos.
Conceitos: Métodos com passagem de parâmetros, manipulação e proteção de estado interno com condicionais.
 */

public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João";
        conta.numeroConta = "12345-6";

        conta.consultarSaldo();
        conta.depositar(500);
        conta.consultarSaldo();
        conta.sacar(200);
        conta.consultarSaldo();
        conta.sacar(500);
        conta.depositar(-50);
    }
}
