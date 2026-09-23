/*Exercício 4: Classe Carro com Atributo de Leitura Derivada
Enunciado: Crie uma classe Carro com os atributos privados: modelo (String), ano (int) e velocidadeAtual (int, iniciando em 0). Implemente:
Construtor que receba modelo e ano.
Métodos getters para todos os atributos, mas setters apenas para modelo.
Métodos operacionais acelerar(int incremento) e frear(int decremento). A velocidade nunca pode ficar abaixo de 0 km/h.
Um método booleano de consulta/leitura isEmMovimento() que retorne true se velocidadeAtual > 0 e false caso contrário.
Conceitos: Métodos getters do tipo booleano (is...), encapsulamento de comportamento de transição de estado e bloqueio de acesso de escrita externo a variáveis dinâmicas.
 */

package Lista7;

public class Exerc4 {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Fusca", 1970);
        Carro carro2 = new Carro("Civic", 2020);

        System.out.println("Carro 1: modelo = " + carro1.getModelo() + ", ano = " + carro1.getAno() + ", velocidade atual = " + carro1.getVelocidadeAtual() + ", em movimento? " + carro1.isEmMovimento());
        System.out.println("Carro 2: modelo = " + carro2.getModelo() + ", ano = " + carro2.getAno() + ", velocidade atual = " + carro2.getVelocidadeAtual() + ", em movimento? " + carro2.isEmMovimento());
        System.out.println("\n");

        carro1.acelerar(50);
        carro2.acelerar(100);

        System.out.println("Carro 1: modelo = " + carro1.getModelo() + ", ano = " + carro1.getAno() + ", velocidade atual = " + carro1.getVelocidadeAtual() + ", em movimento? " + carro1.isEmMovimento());
        System.out.println("Carro 2: modelo = " + carro2.getModelo() + ", ano = " + carro2.getAno() + ", velocidade atual = " + carro2.getVelocidadeAtual() + ", em movimento? " + carro2.isEmMovimento());
        System.out.println("\n");
        
        carro1.frear(30);
        carro2.frear(150);

        System.out.println("Carro 1: modelo = " + carro1.getModelo() + ", ano = " + carro1.getAno() + ", velocidade atual = " + carro1.getVelocidadeAtual() + ", em movimento? " + carro1.isEmMovimento());
        System.out.println("Carro 2: modelo = " + carro2.getModelo() + ", ano = " + carro2.getAno() + ", velocidade atual = " + carro2.getVelocidadeAtual() + ", em movimento? " + carro2.isEmMovimento());
    }
}

class Carro{
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public void acelerar(int incremento){
        if(incremento > 0){
            this.velocidadeAtual += incremento;
        }
    }

    public void frear(int decremento){
        if(decremento > 0){
            this.velocidadeAtual -= decremento;
            if(this.velocidadeAtual < 0){
                this.velocidadeAtual = 0;
            }
        }
    }

    public boolean isEmMovimento(){
        return this.velocidadeAtual > 0;
    }
}