/*Exercício 5: Contas Bancárias com Sobrescrita de Regra de Saque (super)
Enunciado: Crie uma classe Conta com atributos encapsulados numero (String) e saldo (double), com métodos depositar(double valor) e sacar(double valor). Em seguida:
Crie a subclasse ContaPoupanca com o atributo taxaRendimento (double) e método aplicarRendimento(). O método sacar() funciona normalmente sem taxas.
Crie a subclasse ContaCorrente com o atributo limiteChequeEspecial (double). Sobrescreva o método sacar(double valor) para cobrar uma taxa fixa de R$ 2.00 por saque e permitir que o saldo fique negativo até o limite do cheque especial.
Conceitos: Reutilização de métodos da superclasse, sobrescrita com alteração de regras de validação/taxação e uso de super.sacar().
 */
package Lista8;

public class Exerc5 {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("12345", 1000.0, 0.05);
        ContaCorrente corrente = new ContaCorrente("67890", 500.0, 200.0);

        System.out.println("Saldo inicial da Conta Poupança: " + poupanca.getSaldo());
        poupanca.aplicarRendimento();
        System.out.println("Saldo após aplicar rendimento: " + poupanca.getSaldo());
        poupanca.sacar(200.0);
        System.out.println("Saldo após saque de R$ 200.00: " + poupanca.getSaldo());

        System.out.println("\nSaldo inicial da Conta Corrente: " + corrente.getSaldo());
        corrente.sacar(600.0); // Saque que excede o saldo, mas dentro do limite do cheque especial
        System.out.println("Saldo após saque de R$ 600.00 (com taxa): " + corrente.getSaldo());
    }
}

class Conta {
    private String numero;
    protected double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
         } else {
         System.out.println("Valor inválido ou saldo insuficiente para saque.");
    }
}

    public double getSaldo() {
        return saldo;
    }
}

class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldoInicial, double taxaRendimento) {
        super(numero, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}

class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldoInicial, double limiteChequeEspecial) {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

   @Override
    public void sacar(double valor) {
        double taxaSaque = 2.00;
        if (valor > 0 && (getSaldo() - valor - taxaSaque) >= -limiteChequeEspecial) {
            // Em vez de super.sacar, você altera o saldo herdado diretamente:
            this.saldo -= (valor + taxaSaque); 
        } else {
            System.out.println("Valor inválido ou limite do cheque especial excedido.");
        }
    }
}