/*Exercício 1: Classe Produto com Sobrecarga de Construtores
Enunciado: Crie uma classe Produto encapsulada com os atributos privados: nome (String), preco (double) e quantidadeEstoque (int). Implemente:
Um construtor completo que inicialize os 3 atributos.
Um construtor sobrecarregado que receba apenas nome e preco, inicializando quantidadeEstoque com 0.
Métodos getters e setters para todos os atributos (com validação no setter do preço e do estoque para não aceitarem valores negativos).
Um método calcularValorTotalEmEstoque() que retorne preco * quantidadeEstoque.
Conceitos: Modificadores de acesso private/public, palavra-chave this, sobrecarga de construtores (constructor overloading) e proteção de estado via setters.
Exemplo de Execução: Instanciar Produto A com 3 parâmetros e Produto B com 2 parâmetros; tentar atribuir um preço negativo via setPreco(-10.0) e validar que o valor não se altera.
 */
package Lista7;

public class Exerc1 {
    public static void main(String[] args) {
        Produto produtoA = new Produto("Mouse", 10, 100);
        Produto produtoB = new Produto("Teclado", 15);

        System.out.println("Produto A: " + produtoA.getNome() + " preço: " + produtoA.getPreco() + " quantidade: " + produtoA.getQuant());
        System.out.println("Produto B: " + produtoB.getNome() + " preço: " + produtoB.getPreco() + " quantidade: " + produtoB.getQuant());

        produtoA.setPreco(-20);
        System.out.println("O preço do produto A agora é: " + produtoA.getPreco());

        System.out.println("Valor total em estoque de A: " + produtoA.calcularValorTotalEmEstoque());
        System.out.println("Valor total em estoque de B: " + produtoB.calcularValorTotalEmEstoque());


    }
}

class Produto{
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double novoPreco){
        if(novoPreco >=0){
            this.preco = novoPreco;
        } else {
            System.out.println("O preço não pode ser negativo!");
        }
    }

    public int getQuant(){
        return this.quantidadeEstoque;
    }

    public void setQuant(int novoQuant){
        if(novoQuant >= 0){
            this.quantidadeEstoque = novoQuant;
        } else {
            System.out.println("A quantidade não pode ser negativa!");
        }
    }

    public double calcularValorTotalEmEstoque(){
        return this.preco * this.quantidadeEstoque;
    }
}