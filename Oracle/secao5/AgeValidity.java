package secao5;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int age = scanner.nextInt();

        boolean drivingUnderAge = false;
        if (age <= 18) {
            drivingUnderAge = true;
        }

        System.out.println("Driving under age: " + drivingUnderAge);
        scanner.close();

    }
}
