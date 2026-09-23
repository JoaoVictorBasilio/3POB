/*Exercício 5: Integração Completa (Classe Abstrata + Interface)

Enunciado: Projete um sistema para um parque eletrônico:


Crie a interface Tributavel com o método double calcularTributo().
Crie a classe abstrata Item com atributos codigo (int) e precoBase (double).
Crie a classe Eletronico, que herda de Item (extends Item) e implementa a interface Tributavel (implements Tributavel). A taxa de tributo é de 15% sobre o precoBase.
Crie a classe Alimento, que herda de Item, mas não é tributável (não implementa a interface).
Na classe principal, crie uma função calcularTotalImpostos(List<Tributavel> itensTributaveis) e processe uma lista de itens sujeitos a tributação.

Conceitos: Combinação simultânea de herança simples (extends) com implementação de contratos (implements) e filtragem por tipo de interface.

 */
package Lista9;

import java.util.ArrayList;
import java.util.List;

public class Exerc5 {
    public static void main(String[] args) {
        
        Eletronico notebook = new Eletronico(101, 3500.00);
        Eletronico smartphone = new Eletronico(102, 2000.00);
        Alimento maca = new Alimento(201, 5.50); 
        Alimento arroz = new Alimento(202, 22.90);

        List itensTributaveis = new ArrayList<>();
        itensTributaveis.add(notebook);
        itensTributaveis.add(smartphone);

        System.out.printf("Tributo do Notebook: R$ %.2f\n", notebook.calcularTributo());
        System.out.printf("Tributo do Smartphone: R$ %.2f\n", smartphone.calcularTributo());
        
        double total = calcularTotalImpostos(itensTributaveis);
        System.out.printf("\nTotal de impostos arrecadados: R$ %.2f\n", total);
    }

    public static double calcularTotalImpostos(List itensTributaveis) {
        double total = 0;
        for (int i = 0; i < itensTributaveis.size(); i++) {
            Tributavel item = (Tributavel) itensTributaveis.get(i);
            total += item.calcularTributo();
        }
        return total;
    }
}

interface Tributavel {
    double calcularTributo();
}

abstract class Item {
    private int codigo;
    private double precoBase;

    public Item(int codigo, double precoBase) {
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }
}

class Eletronico extends Item implements Tributavel {
    public Eletronico(int codigo, double precoBase) {
        super(codigo, precoBase);
    }

    @Override
    public double calcularTributo() {
        return getPrecoBase() * 0.15;
    }
}

class Alimento extends Item {
    public Alimento(int codigo, double precoBase) {
        super(codigo, precoBase);
    }
}