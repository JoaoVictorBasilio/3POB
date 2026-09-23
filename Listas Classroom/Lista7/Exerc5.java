/*Exercício 5: Classe Funcionario com Regras de Negócio no Setter
Enunciado: Desenvolva uma classe Funcionario com os atributos privados nome (String), matricula (String) e salario (double).
O construtor deve receber todos os 3 atributos.
O setSalario(double novoSalario) só deve permitir alterações se o novoSalario for estritamente maior que o salario atual (uma regra da empresa que impede redução salarial arbitrária por atribuição direta). Se for menor ou igual, exiba uma mensagem de erro e não altere o valor.
Implemente um método exibirDados() que imprima todos os dados formatados.
Conceitos: Aplicação prática de encapsulamento para garantir invariantes de regras de negócio complexas nos métodos modificadores.

 */
package Lista7;

public class Exerc5 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "12345", 3000.0);
        Funcionario funcionario2 = new Funcionario("Maria", "67890", 4000.0);

        System.out.println("Dados do Funcionário 1:");
        funcionario1.exibirDados();
        System.out.println("\nDados do Funcionário 2:");
        funcionario2.exibirDados();

        System.out.println("\nTentando alterar o salário do Funcionário 1 para 2500.0 (menor que o atual):");
        funcionario1.setSalario(2500.0);
        System.out.println("Salário atual do Funcionário 1: " + funcionario1.getSalario());

        System.out.println("\nAlterando o salário do Funcionário 2 para 4500.0 (maior que o atual):");
        funcionario2.setSalario(4500.0);
        System.out.println("Salário atual do Funcionário 2: " + funcionario2.getSalario());
    }
    
}

class Funcionario{
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String novaMatricula){
        this.matricula = novaMatricula;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double novoSalario){
        if(novoSalario > this.salario){
            this.salario = novoSalario;
        } else {
            System.out.println("Erro: O novo salário deve ser maior que o salário atual.");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Salário: " + this.salario);
    }
}
