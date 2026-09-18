package secao3;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);

        //Find and print the sum of three integers entered by the user
        System.out.print("Digite o primeiro número inteiro: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int thirdNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum: " + sum);

        //Remember to close the Scanner
        scanner.close();
    }
}
