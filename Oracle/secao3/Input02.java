package secao3;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Operação concluída com sucesso.",
                "Mensagem do sistema",
                1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Digite uma frase:",
                "Entrada de texto",
                3,
                null,
                null,
                "Escreva aqui");
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Escolha uma opção:",
                "Seleção de opção",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);

        String parsedInput1 = input1 == null ? "" : input1.trim();
        String parsedInput2 = input2 == null ? "" : input2.trim();

        System.out.println("Entrada de texto: " + parsedInput1.toUpperCase());
        System.out.println("Opção selecionada: " + parsedInput2);
                
    }
}
