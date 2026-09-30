/*Exercício 3: Exceção Customizada Verificada (SaldoInsuficienteException)
Enunciado: Crie uma classe de exceção personalizada chamada SaldoInsuficienteException que herde de Exception (Checked Exception). Em seguida, crie uma classe ContaCorrente com os atributos numero (String) e saldo (double). O método sacar(double valor) deve lançar a exceção (throws SaldoInsuficienteException) caso o valor solicitado seja superior ao saldo disponível. No método main, realize saques dentro de um bloco try-catch capturando e exibindo a mensagem de erro.
Conceitos: Criação de Checked Exceptions (extends Exception), cláusulas throw e throws, e propagação de erros de domínio.
 */
package Lista10;

public class Exerc3 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345", 1000.0);

        try {
            System.out.println("Tentando sacar R$ 500,00");
            conta.sacar(500.0);
            System.out.println("Saque realizado com sucesso!");

            System.out.println("Tentando sacar R$ 600,00");
            conta.sacar(600.0);
            System.out.println("Saque realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}

class ContaCorrente {
    private String numero;
    private double saldo;

    public ContaCorrente (String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > this.saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
        
        this.saldo -= valor;
    }
}