package secao4;

public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double tableTotal = 0;
        
        //Name your friends
        tableTotal += calc.findTotal(10, "Person 1");
        tableTotal += calc.findTotal(12, "Person 2");
        tableTotal += calc.findTotal(9,  "Person 3");
        tableTotal += calc.findTotal(8,  "Person 4");
        tableTotal += calc.findTotal(7,  "Person 5");
        tableTotal += calc.findTotal(15, "Alex");
        tableTotal += calc.findTotal(11, "Person 7");
        tableTotal += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        System.out.printf("Total da mesa: $%.1f%n", tableTotal);
    } 
}
