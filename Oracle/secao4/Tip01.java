package secao4;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double tax = 0.05;
        double tip = 0.15;
        double[] amounts = {10, 12, 9, 8, 7, 15, 11, 30};

        for (int person = 0; person < amounts.length; person++) {
            double total = amounts[person] * (1 + tax + tip);
            System.out.printf("person%d: $%.1f%n", person + 1, total);
        }
    }    
}
