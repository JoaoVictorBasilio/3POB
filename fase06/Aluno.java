/*Exercício 5: Classe Aluno com Cálculo de Situação Acadêmica
Enunciado: Crie uma classe Aluno contendo os atributos nome (String), matricula (String), nota1 (double) e nota2 (double). Implemente os métodos:
calcularMedia(): retorna a média aritmética simples das duas notas.
verificarAprovacao(): retorna uma String ("Aprovado" se média > 7, caso contrário "Reprovado").
imprimirBoletim(): exibe o nome, a matrícula, a média final e a situação do aluno.
Na classe Main, crie um objeto Aluno, preencha suas notas e acione o método imprimirBoletim().
Conceitos: Chamada de métodos dentro de outros métodos da mesma classe (this.calcularMedia()) e abstração de regras de negócio.

 */

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    String verificarAprovacao() {
        return this.calcularMedia() > 7 ? "Aprovado" : "Reprovado";
    }

    void imprimirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média final: " + this.calcularMedia());
        System.out.println("Situação: " + this.verificarAprovacao());
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Pedro";
        aluno.matricula = "2026-001";
        aluno.nota1 = 8.5;
        aluno.nota2 = 7.0;

        aluno.imprimirBoletim();
    }
}
