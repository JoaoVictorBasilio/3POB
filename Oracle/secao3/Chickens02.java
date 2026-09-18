package secao3;

public class Chickens02 {
    public static void main(String[] args) {
        int monday = 100;
        int tuesday = 121;
        int wednesday = 117;

        double dailyAverage = (monday + tuesday + wednesday) / 3.0;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Monthly Profit:  $" + monthlyProfit);
    }
}

