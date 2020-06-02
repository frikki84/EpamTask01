package by.training.jwd.may2020.dziadkouskaya.task01.unit06.model;

public class ArithmeticProgressionOperations {

	public static int findArithmeticProgressionSumOutOfInt(int a, int d) {
		double limitMax = Integer.MAX_VALUE;
		double limitMin = Integer.MIN_VALUE;

		int counter = 1;
		double an = a;
		double arifmeticProgressSum = 0;

		while (arifmeticProgressSum < limitMax && arifmeticProgressSum > limitMin) {
			an += d;
			counter += 1;
			arifmeticProgressSum = (a + an) * (counter/2);
		}

		return counter;
	}

	public static long findArithmeticProgressionSumOutOfLong(int a, int d) {
		double limitMax = Long.MAX_VALUE;
		double limitMin = Long.MIN_VALUE;

		long counter = 1;
		double an = a;
		double arifmeticProgressSum = 0;

		while (arifmeticProgressSum < limitMax && arifmeticProgressSum > limitMin) {
			an += d;
			counter += 1;
			arifmeticProgressSum = (a + an) * (counter/2);

		}

		return counter;
	}

	public static double findArithmeticProgressionSumOutOfLongAlternative(int a, int d) {
		double counter = 1;
		long an = a;
		long arifmeticProgressSum = a;
		try {
			while (true) {
				an += d;
				counter += 1;
				double middleSumm = Math.addExact(arifmeticProgressSum, an);
				arifmeticProgressSum += an;
			}
		} catch (ArithmeticException e) {
			return counter;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}