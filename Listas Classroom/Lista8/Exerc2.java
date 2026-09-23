/*Exercício 2: Folha de Pagamento Polimórfica
Enunciado: Crie uma classe base Funcionario com nome (String) e salarioBase (double), contendo o método calcularSalario(), que retorna apenas o salarioBase. Crie duas subclasses:
Gerente: adiciona um bonusFixo (double) e sobrescreve calcularSalario() somando o bônus ao salário base.
Vendedor: adiciona totalVendas (double) e comissaoPercentual (double), sobrescrevendo calcularSalario() para somar a comissão ao salário base.
Na classe Main, armazene diferentes funcionários em um vetor do tipo Funcionario[] e percorra o vetor calculando a folha total de forma polimórfica.
Conceitos: Polimorfismo de inclusão, array de referências do tipo da superclasse e ligação dinâmica (dynamic binding).
 */
package Lista8;

public class Exerc2 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("Alice", 5000, 1000);
        funcionarios[1] = new Vendedor("Bob", 3000, 20000, 5);
        funcionarios[2] = new Funcionario("Charlie", 2500);

        System.out.println("Salários individuais:");
        for(int j = 0; j < funcionarios.length; j++) {
            System.out.println(funcionarios[j].getNome() + " " + (j+1) + ": " + funcionarios[j].calcularSalario());
        }

        double folhaTotal = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            folhaTotal += funcionarios[i].calcularSalario();
        }

        System.out.println("Folha de pagamento total: " + folhaTotal);
    }
}

class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonusFixo;
    }
}

class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissaoPercentual) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (totalVendas * comissaoPercentual / 100);
    }
}
