/*Exercício 3: Classe Retangulo com Validação nos Métodos Setters
Enunciado: Desenvolva uma classe Retangulo com os atributos privados largura (double) e altura (double).
O construtor deve inicializar ambos os atributos utilizando os próprios métodos setters para garantir que as regras de validação sejam aplicadas desde a instanciação.
Nos setters de largura e altura, garanta que o valor atribuído seja estritamente maior que zero; se for $\le 0$, atribua um valor padrão de 1.0 e emita um aviso no console.
Implemente os métodos calcularArea() e calcularPerimetro().
Conceitos: Reutilização de regras de validação chamando setters dentro do construtor, consistência de objetos válidos.
 */
package Lista7;

public class Exerc3 {
    public static void main(String[] args) {
        
        Retangulo retangulo1 = new Retangulo(5, 10);
        Retangulo retangulo2 = new Retangulo(-3, 4);

        System.out.println("Retângulo 1: largura = " + retangulo1.getLargura() + ", altura = " + retangulo1.getAltura() + ", área = " + retangulo1.calcularArea() + ", perímetro = " + retangulo1.calcularPerimetro());
        System.out.println("Retângulo 2: largura = " + retangulo2.getLargura() + ", altura = " + retangulo2.getAltura() + ", área = " + retangulo2.calcularArea() + ", perímetro = " + retangulo2.calcularPerimetro());
    }
}

class Retangulo{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura(){
        return this.largura;
    }

    public void setLargura(double largura){
        if(largura > 0){
            this.largura = largura;
        } else {
            this.largura = 1.0;
            System.out.println("Valor inválido para largura! Atribuindo valor padrão de 1.0.");
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
        } else {
            this.altura = 1.0;
            System.out.println("Valor inválido para altura! Atribuindo valor padrão de 1.0.");
        }
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return 2 * (this.largura + this.altura);
    }
}
