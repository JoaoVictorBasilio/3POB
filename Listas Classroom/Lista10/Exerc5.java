/*Exercício 5: Encadeamento de Exceções (Exception Chaining) no Processamento de Arquivos Simulado
Enunciado: Crie uma exceção customizada ProcessamentoDadosException (extends Exception). Crie uma classe de serviço com um método processarArquivo(String caminho). Dentro do método, simule uma falha de leitura (lançando uma java.io.IOException se o caminho for nulo ou vazio) ou uma falha lógica de parsing. Capture a exceção original e relance-a encapsulada dentro da sua ProcessamentoDadosException utilizando o construtor com causa (super(mensagem, causa)). No main, exiba tanto a mensagem principal quanto o motivo raiz (getCause().getMessage()).
Conceitos: Encadeamento de exceções (Exception Chaining), preservação do stack trace original e abstração de falhas de baixo nível para camadas superiores de negócio.

 */
package Lista10;

public class Exerc5 {
    public static void main(String[] args) {
        Service servico = new Service();

        try {
            servico.processarArquivo("");
        } catch (ProcessamentoDadosException e) {
            System.out.println("Erro: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Causa raiz: " + e.getCause().getMessage());
            }
        }
    }
}

class ProcessamentoDadosException extends Exception {
    public ProcessamentoDadosException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

class Service {
    public void processarArquivo(String caminho) throws ProcessamentoDadosException {
        try {
            if (caminho == null || caminho.isEmpty()) {
                throw new java.io.IOException("Caminho do arquivo inválido.");
            }
            // Simulação de falha de parsing
            throw new NumberFormatException("Falha ao converter dados do arquivo.");
        } catch (Exception e) {
            throw new ProcessamentoDadosException("Erro ao processar o arquivo.", e);
        }
    }
}