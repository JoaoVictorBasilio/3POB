/*Exercício 1: Modelagem da Classe Livro
Enunciado: Crie uma classe chamada Livro com os atributos titulo (String), autor (String) e numeroPaginas (int). Implemente um método exibirInformacoes() que imprima no console todos os dados formatados. Na classe principal (Main), instancie dois objetos do tipo Livro, atribua valores a seus atributos e chame o método de exibição para ambos.
Conceitos: Definição de classe, atributos, instanciação de objetos com new, atribuição via operador ponto (.) e invocação de métodos.
 */

public class Modelagem {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Java para Iniciantes";
        livro1.autor = "Ana Souza";
        livro1.numeroPaginas = 320;

        Livro livro2 = new Livro();
        livro2.titulo = "Programação Orientada a Objetos";
        livro2.autor = "Carlos Lima";
        livro2.numeroPaginas = 410;

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}

class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println();
    }
}
