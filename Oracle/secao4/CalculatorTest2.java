package secao4;

public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        Calculator2 calc = new Calculator2();

        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party
        double[] originalPrices = {10, 12, 9, 8, 7, 15, 11, 30};
        for (int person = 0; person < originalPrices.length; person++) {
            calc.originalPrice = originalPrices[person];
            System.out.print("person" + (person + 1) + ": ");
            calc.findTotal();
        }

        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
    }
}
