package secao3;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";

        //Parse shirtPrice and taxRate, and print the total tax
        int price = Integer.parseInt(shirtPrice);
        double rate = Double.parseDouble(taxRate);
        double totalTax = price * rate;
        System.out.println("Total tax: " + totalTax);

        //Try to parse taxRate as an int
        try {
            Integer.parseInt(taxRate);
        } catch (NumberFormatException exception) {
            System.out.println("Cannot parse taxRate as int: " + exception.getMessage());
        }

        //Try to parse gibberish as an int
        try {
            Integer.parseInt(gibberish);
        } catch (NumberFormatException exception) {
            System.out.println("Cannot parse gibberish as int: " + exception.getMessage());
        }
        
    }
    
}
