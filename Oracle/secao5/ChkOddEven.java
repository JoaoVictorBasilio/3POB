package secao5;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = in.nextInt();

        if (num >= 1 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("O número é " + num + ", par");
            } else {
                System.out.println("O número é " + num + ", ímpar");
            }
        } else {
            System.out.println("O número deve estar entre 1 e 10");
        }

        in.close();
    }
}
