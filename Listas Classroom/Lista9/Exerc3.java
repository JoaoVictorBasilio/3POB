/*Exercício 3: Múltipla Implementação de Interfaces (Autenticavel e Exportavel)

Enunciado: Crie duas interfaces distintas:

Autenticavel: método boolean autenticar(String senha).
ExportavelJSON: método String exportarJSON().
Crie a classe Usuario (com login e senha) que implemente apenas Autenticavel. Crie a classe Administrador (com login, senha e nivelAcesso) que implemente ambas as interfaces (implements Autenticavel, ExportavelJSON).

Conceitos: Múltipla implementação de interfaces em Java e segregação de responsabilidades (Interface Segregation Principle).

 */
package Lista9;

public class Exerc3 {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("joao.silva", "senha123");
        System.out.println("Login do Usuário: joao.silva");
        System.out.println("Autenticação válida? " + usuario.autenticar("senha123"));
        System.out.println("Autenticação inválida? " + usuario.autenticar("123456"));
        
        System.out.println("------------------------------------------");

        Administrador admin = new Administrador("maria.admin", "admin@2024", "Nível 5");
        System.out.println("Login do Admin: maria.admin");
        System.out.println("Autenticação Admin? " + admin.autenticar("admin@2024"));
        System.out.println("Exportando Admin: \n" + admin.exportarJSON());
    }
}

interface Autenticavel {
    boolean autenticar(String senha);
}

interface ExportavelJSON {
    String exportarJSON();
}

class Usuario implements Autenticavel {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

class Administrador implements Autenticavel, ExportavelJSON {
    private String login;
    private String senha;
    private String nivelAcesso;

    public Administrador(String login, String senha, String nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public String exportarJSON() {
        return "{\n" +
               "  \"login\": \"" + this.login + "\",\n" +
               "  \"nivelAcesso\": \"" + this.nivelAcesso + "\"\n" +
               "}";
    }
}