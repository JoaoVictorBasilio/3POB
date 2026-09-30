/*Exercício 4: Validação de Idade com Exceção Não Verificada (IdadeInvalidaException)
Enunciado: Crie uma exceção personalizada IdadeInvalidaException herdando de RuntimeException (Unchecked Exception). Crie uma classe Eleitor com o método cadastrar(String nome, int idade). Se a idade informada for menor que 0 ou maior que 130, lance a exceção imediatamente com uma mensagem descritiva. Na classe de teste, tente cadastrar eleitores com idades válidas e inválidas, tratando a exceção em tempo de execução.
Conceitos: Criação de Unchecked Exceptions (extends RuntimeException), validação de invariantes de estado e diferença de obrigatoriedade de declaração de throws.
 */
package Lista10;

public class Exerc4 {
    public static void main(String[] args) {
        Eleitor eleitor = new Eleitor();

        try {
            System.out.println("Tentando cadastrar eleitor com idade 25");
            eleitor.cadastrar("João", 25);

            System.out.println("Tentando cadastrar eleitor com idade -5");
            eleitor.cadastrar("Maria", -5);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Tentando cadastrar eleitor com idade 150");
            eleitor.cadastrar("Carlos", 150);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

class Eleitor {
    private String nome;
    private int idade;

    public void cadastrar(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 130) {
            throw new IdadeInvalidaException("Idade " + idade + " é inválida! A idade deve estar entre 0 e 130 anos.");
        }
        this.nome = nome;
        this.idade = idade;
        System.out.println("Eleitor " + nome + " (" + idade + " anos) cadastrado com sucesso!");
    }
}