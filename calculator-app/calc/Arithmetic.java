package calc;

public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

	public static float square(float num1) {
		return num1 * num1;
	}

	public static float cube(float num1) {
		return num1 * num1 * num1;
	}

	public static float power(float num1, float num2) {
		// float num1;
		// float num2;
		int temp = 1;

		while(num2 != 0){
			temp *= num1;
			--num2;
		}
		return temp;
	}

	public static float mod(float num1, float num2) {
		return num1 % num2;
	}
}