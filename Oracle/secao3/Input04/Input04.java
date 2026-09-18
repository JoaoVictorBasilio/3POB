package secao3.Input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());

        
        
        //Read each line until it contains "BlueBumper"
        while (sc.hasNextLine() && sc.findInLine("BlueBumper") == null) {
            sc.nextLine();
        }
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int xPosition = sc.nextInt();
        int yPosition = sc.nextInt();
        System.out.println("X: " + xPosition + ", Y: " + yPosition);
        sc.close();
    }    
}
