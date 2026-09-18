package secao4;

import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String fullName;

        System.out.print("Digite seu primeiro nome: ");
        firstName = scanner.nextLine();
        System.out.print("Digite seu nome do meio: ");
        middleName = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        lastName = scanner.nextLine();

        fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("Nome completo: " + fullName);

        scanner.close();
    }
    
}
