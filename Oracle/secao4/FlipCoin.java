package secao4;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        for (int attempt = 1; attempt <= 10; attempt++) {
            double chance = rand.nextDouble();
            String result;

            if (chance < 0.5) {
                result = "superior";
            } else {
                result = "inferior";
            }

            System.out.println("Tentativa " + attempt + ": " + chance + " - " + result);
        }
    }
}

