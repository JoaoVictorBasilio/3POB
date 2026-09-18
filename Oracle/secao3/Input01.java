package secao3;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        System.out.println(input);
        //Parse the input as an int.
        //Print its value +1
        int number = Integer.parseInt(input);
        System.out.println(number + 1);
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int anotherNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        System.out.println(anotherNumber);
    }
}
