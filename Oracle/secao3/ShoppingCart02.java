package secao3;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName + " wants to purchase a " + itemDesc;

        double price = 25.0;
        double tax = 0.10;
        int quantity = 2;

        double totalPrice = (price * quantity) + ((price * quantity) * tax);

        message = custName + " wants to purchase " + quantity + " " + itemDesc;

        System.out.println(message);
        System.out.println("Total cost: $" + totalPrice);
    }
}
