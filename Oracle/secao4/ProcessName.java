package secao4;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = console.nextLine().trim();
        int firstSpace = name.indexOf(' ');
        int lastSpace = name.lastIndexOf(' ');
        String firstName = name.substring(0, firstSpace);
        String lastName = name.substring(lastSpace + 1);

        System.out.println("Your name is: " + lastName + ", " + firstName.charAt(0) + ".");
        console.close();
    }
}