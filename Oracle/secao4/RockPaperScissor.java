package secao4;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random random = new Random();

        for (int round = 1; round <= 10; round++) {
            int number = random.nextInt(3);
            String result;

            switch (number) {
                case 0:
                    result = "pedra";
                    break;
                case 1:
                    result = "papel";
                    break;
                default:
                    result = "tesoura";
                    break;
            }

            System.out.println("Rodada " + round + ": " + number + " - " + result);
        }

    }
}
