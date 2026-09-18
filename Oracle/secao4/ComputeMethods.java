package secao4;

import java.util.Random;

public class ComputeMethods {
	private final Random random = new Random();

	public double fToC(double degreesF) {
		return (degreesF - 32) * 5 / 9;
	}

	public double hypotenuse(int a, int b) {
		return Math.sqrt((a * a) + (b * b));
	}

	public int roll() {
		return random.nextInt(6) + 1;
	}
}

