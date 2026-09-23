/*Exercício 2: Classe ContaBancaria com Proteção de Saldo (Sem Setter para Saldo)
Enunciado: Crie uma classe ContaBancaria com os atributos privados numeroConta (String), titular (String) e saldo (double). Regras de encapsulamento:
O construtor deve receber obrigatoriamente numeroConta e titular. O saldo inicial deve começar em zero (ou ter um segundo construtor que aceite um depósito inicial).
O atributo numeroConta deve ter apenas método getter (não pode ser alterado após a criação).
O atributo saldo não deve ter método setter direto — sua alteração só pode ocorrer através dos métodos operacionais depositar(double valor) e sacar(double valor).
O titular pode ter getter e setter.
Conceitos: Encapsulamento estrito (ocultação de atributos sem expor setters indiscriminadamente) e imutabilidade de campos identificadores.
 */
package Lista7;


public class Exerc2 {
    public static void main(String[] args) {


        ContaBancaria ClienteA = new ContaBancaria("001", "Carlos");
        ContaBancaria ClienteB = new ContaBancaria("002", "José", 1000);

        System.out.println("Cliente A: " + ClienteA.gettitular() + " conta: " + ClienteA.getnumeroConta() + " saldo: " + ClienteA.getsaldo());
        System.out.println("Cliente B: " + ClienteB.gettitular() + " conta: " + ClienteB.getnumeroConta() + " saldo: " + ClienteB.getsaldo());

        ClienteA.depositar(10000);
        ClienteB.sacar(200);

        System.out.println("Cliente A: " + ClienteA.gettitular() + " conta: " + ClienteA.getnumeroConta() + " saldo: " + ClienteA.getsaldo());
        System.out.println("Cliente B: " + ClienteB.gettitular() + " conta: " + ClienteB.getnumeroConta() + " saldo: " + ClienteB.getsaldo());



    }
    
}

class ContaBancaria{
    private String numeroConta;
    private String titular;
    private double saldo;


    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo =0;
    }

     public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //titular pode ter getter e setter
    //saldo não deve ter setter
    //numeroconta deve apenas ter getter

    public String getnumeroConta(){
        return this.numeroConta;
    }

    public String gettitular(){
        return this.titular;
    }

    public void settitular(String novotitular){
        this.titular = novotitular;
    }

    public double getsaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        if(valor >= 0){
        this.saldo += valor;
        } else {
            System.out.println("Valor negativo!");
        }
    }

    public void sacar(double valor){
        if(valor<= this.saldo && valor >= 0){
        this.saldo -= valor;
    } else {
        System.out.println("Saldo insuficiente ou valor inválido!");
    }
}
}