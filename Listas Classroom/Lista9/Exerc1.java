/*Exercício 1: Meios de Pagamento com Interface (implements)

Enunciado: Crie uma interface MetodoPagamento contendo os métodos:

void processarPagamento(double valor)
String obterDetalhes()
Implemente duas classes concretas que assinem o contrato: CartaoCredito (com atributos numeroCartao e limite) e Pix (com atributo chavePix). Na classe Main, crie um método finalizarCompra(MetodoPagamento metodo, double total) que processe compras utilizando qualquer um dos dois métodos.

Conceitos: Contrato de interface (interface, implements), desacoplamento e polimorfismo via interface.
 */
package Lista9;

public class Exerc1 {
    public static void main(String[] args) {
        
        MetodoPagamento meuCartao = new CartaoCredito("1234-5678-9012-3456", 1000.0);
        MetodoPagamento meuPix = new Pix("meuemail@exemplo.com");

        finalizarCompra(meuCartao, 200.0);
        finalizarCompra(meuPix, 150.5);
        finalizarCompra(meuCartao, 900.0);
    }

    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.println("Iniciando o fechamento da compra...");
        System.out.println("Detalhes: " + metodo.obterDetalhes());
        metodo.processarPagamento(total);
        System.out.println("------------------------------------------");
    }
}

interface MetodoPagamento {
    void processarPagamento(double valor);
    String obterDetalhes();
}

class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > 0 && valor <= this.limite) {
            this.limite -= valor;
            System.out.printf("Pagamento de R$ %.2f aprovado no Cartão de Crédito.\n", valor);
        } else {
            System.out.println("Pagamento recusado! Limite insuficiente ou valor inválido.");
        }
    }

    @Override
    public String obterDetalhes() {
        String ultimosDigitos = this.numeroCartao.substring(this.numeroCartao.length() - 4);
        return "Cartão de Crédito com final " + ultimosDigitos;
    }
}

class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > 0) {
            System.out.printf("Transferência Pix de R$ %.2f processada com sucesso!\n", valor);
        } else {
            System.out.println("Valor inválido para transferência Pix.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "Pix vinculado à chave: " + this.chavePix;
    }
}