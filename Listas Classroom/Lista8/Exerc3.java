/*Exercício 3: Sistema de Notificações com Dispatches Heterogêneos
Enunciado: Crie uma classe base Notificacao com o atributo destinatario (String) e um método enviar(String mensagem). Crie três subclasses:
EmailNotificacao: sobrescreve enviar exibindo "Enviando E-mail para [destinatario]: [mensagem]".
SmsNotificacao: sobrescreve enviar exibindo "Enviando SMS para o número [destinatario]: [mensagem]".
PushNotificacao: sobrescreve enviar exibindo "Enviando Push Notification para o dispositivo [destinatario]: [mensagem]".
Crie um método estático processarEnvio(Notificacao notificacao, String texto) que receba qualquer notificação e execute o envio sem saber a implementação concreta.
Conceitos: Polimorfismo aplicado a parâmetros de métodos, desacoplamento e extensão comportamental.
 */
package Lista8;

public class Exerc3 {
    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao("alice@example.com");
        Notificacao sms = new SmsNotificacao("123456789");
        Notificacao push = new PushNotificacao("device123");

        processarEnvio(email, "Esta é uma notificação por e-mail.");
        processarEnvio(sms, "Esta é uma notificação por SMS.");
        processarEnvio(push, "Esta é uma notificação por push.");
    }

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }
}

class Notificacao {
    protected String destinatario;

    public Notificacao(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando notificação para " + destinatario + ": " + mensagem);
    }
}

class EmailNotificacao extends Notificacao {
    public EmailNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail para " + super.destinatario + ": " + mensagem);
    }
}

class SmsNotificacao extends Notificacao {
    public SmsNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para o número " + super.destinatario + ": " + mensagem);
    }
}

class PushNotificacao extends Notificacao {
    public PushNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Push Notification para o dispositivo " + super.destinatario + ": " + mensagem);
    }
}