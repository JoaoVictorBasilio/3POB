2package secao5;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName + " wants to purchase a " + itemDesc;

        double price = 25.0;
        double tax = 0.10;
        int quantity = 2;
        boolean outOfStock = false;

        double totalPrice = (price * quantity) + ((price * quantity) * tax);

        if (quantity > 1) {
            message = custName + " wants to purchase " + quantity + " " + itemDesc;
        }

        if (outOfStock) {
            System.out.println("Sorry, " + itemDesc + " are out of stock.");
        } else {
            System.out.println(message);
            System.out.println("Total cost: $" + totalPrice);
        }

    }
}
