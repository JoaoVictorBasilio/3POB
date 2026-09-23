/*Exercício 4: Formas Geométricas com Cálculo de Área
Enunciado: Desenvolva uma classe FiguraGeometrica com o método calcularArea(), retornando 0.0. Crie três subclasses:
Quadrado: possui atributo lado (double).
Retangulo: possui atributos largura e altura (double).
Circulo: possui atributo raio (double).
Todas as subclasses devem sobrescrever calcularArea() com as fórmulas matemáticas corretas. Crie uma lista ou array de figuras geométricas e imprima a área individual de cada uma a partir de um único laço de repetição.
Conceitos: Sobrescrita matemática, polimorfismo em estruturas de dados e garantia de contrato comportamental.
 */
package Lista8;

public class Exerc4 {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Quadrado(4);
        figuras[1] = new Retangulo(5, 10);
        figuras[2] = new Circulo(3);

        System.out.println("Áreas das figuras geométricas:");
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i + 1) + ": Área = " + figuras[i].calcularArea());
        }
    }
    
}

class FiguraGeometrica {
    public double calcularArea() {
        return 0.0;
    }
}

class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}