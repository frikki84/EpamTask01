package by.training.jwd.may2020.dziadkouskaya.task01.unit04.model;

public class FunctionCalculating {

	public static boolean checkCondition(double x) {
		boolean result = false;

		if (x <= 13) {
			result = true;
		}
		return result;
	}

	public static double calculateFunction(double x) {
		boolean condition = FunctionCalculating.checkCondition(x);

		double result = 0;

		if (condition) {
			result = Math.pow(x, 3) + 9;
		} else {
			result = -1 * (3/(x + 1));
		}

		return result;
	}

}
