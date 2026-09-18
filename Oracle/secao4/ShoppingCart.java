package secao4;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        double divResult = calc.divide(15, 0);
        System.out.println("Division Result: " + divResult);

        String custName = "Mary Smith";
        int spaceIdx = custName.indexOf(" ");
        String firstName = custName.substring(0, spaceIdx);
        System.out.println("First name: " + firstName);
    }
}
