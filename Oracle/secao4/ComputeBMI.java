package secao4;

import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args)
	{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o peso em libras: ");
    double weight = scanner.nextDouble();
    System.out.print("Informe a altura em polegadas: ");
    double height = scanner.nextDouble();

    double bmi = (703 * weight) / (height * height);
    long roundedBmi = Math.round(bmi);
    System.out.println("Seu IMC é " + roundedBmi);

    scanner.close();
        }
}
