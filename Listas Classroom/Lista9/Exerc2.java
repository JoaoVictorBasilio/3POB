/*Exercício 2: Hierarquia de Formas com Classe Abstrata (abstract)

Enunciado: Crie uma classe abstrata Forma que contenha:


Um atributo protegido cor (String) e seu respectivo construtor/getter.
O método abstrato double calcularArea().
O método concreto void exibirCor() que imprime "Cor da forma: " + cor.
Em seguida, crie as subclasses concretas Retangulo (com largura e altura) e Circulo (com raio), ambas implementando obrigatoriamente o método calcularArea().

Conceitos: Classes e métodos abstratos (abstract), construtores em classes abstratas e combinação de métodos concretos e abstratos.
 */
package Lista9;

public class Exerc2 {
    public static void main(String[] args) {
        
        Forma retangulo = new Retangulo("Azul", 5.0, 4.0);
        Forma circulo = new Circulo("Vermelho", 3.0);

        retangulo.exibirCor();
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("-------------------------");

        circulo.exibirCor();
        System.out.println("Área do Círculo: " + circulo.calcularArea());
    }
}

abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public abstract double calcularArea();

    public void exibirCor() {
        System.out.println("Cor da forma: " + this.cor);
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }
}