/*Exercício 4: Conta Bancária com Regra de Taxação Abstrata

Enunciado: Crie uma classe abstrata ContaBancaria com atributos privados numero e saldo, métodos concretos depositar(double valor) e consultarSaldo(), e um método abstrato:

abstract void cobrarTaxaMensal()
Crie duas classes filhas:
ContaCorrente: a taxa mensal é um valor fixo de R$ 15.00.
ContaEmpresarial: a taxa mensal é de R$ 30.00 acrescida de 0.5% sobre o saldo atual.
Instancie contas de ambos os tipos em uma lista polimórfica List<ContaBancaria> e execute a rotina de virada de mês chamando cobrarTaxaMensal() para todas.

Conceitos: Template de comportamento com classes abstratas e garantia de execução obrigatória em subclasses especializadas.
 */
package Lista9;

import java.util.ArrayList;
import java.util.List;

public class Exerc4 {
    public static void main(String[] args) {
        
        List contas = new ArrayList<>();
        
        contas.add(new ContaCorrente("1001-X", 1000.0));
        contas.add(new ContaEmpresarial("2002-Y", 5000.0));

        System.out.println("--- Saldo antes da virada do mês ---");
        for (int i = 0; i < contas.size(); i++) {
            ContaBancaria conta = (ContaBancaria) contas.get(i);
            System.out.printf("Conta: %s | Saldo: R$ %.2f\n", conta.getNumero(), conta.consultarSaldo());
        }

        System.out.println("\n--- Executando virada de mês (cobrando taxas) ---");
        for (int j = 0; j < contas.size(); j++) {
            ContaBancaria conta = (ContaBancaria) contas.get(j);
            conta.cobrarTaxaMensal();
            System.out.printf("Conta: %s | Novo Saldo: R$ %.2f\n", conta.getNumero(), conta.consultarSaldo());
        }
    }
}

abstract class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    protected void debitar(double valor) {
        this.saldo -= valor;
    }

    abstract void cobrarTaxaMensal();
}

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    void cobrarTaxaMensal() {
        debitar(15.00);
    }
}

class ContaEmpresarial extends ContaBancaria {
    public ContaEmpresarial(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    void cobrarTaxaMensal() {
        double taxa = 30.00 + (consultarSaldo() * 0.005);
        debitar(taxa);
    }
}