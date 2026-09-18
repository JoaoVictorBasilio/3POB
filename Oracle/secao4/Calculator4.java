package secao4;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price, String name){
        double mealTotal = price * (1 + tax + tip);
        double sharedMeals = (15 + 30) * (1 + tax + tip) / 6;
        double total;

        if ("Alex".equals(name) || "Forgetful".equals(name)) {
            total = 0;
        } else {
            total = mealTotal + sharedMeals;
        }

        System.out.println(name +": $" +total);
        return total;
    }
}
