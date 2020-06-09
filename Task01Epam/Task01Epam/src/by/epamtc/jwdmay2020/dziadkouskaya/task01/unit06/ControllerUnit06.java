package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit06;

/*
����� ������ n ������ �������������� ���������� ����������� �� ������� Sn = ( a1 + an )* n / 2. 
���� a1 � d (��� �������������� ����������). 
������� n, ��� ������� �������� Sn ������� �� �������� ����� int � long (����������������� �����).
*/

public class ControllerUnit06 {

	public static void main(String[] args) {
		int a = 1000000000;
		int d = -1000;

		int nOutOfInt = findArithmeticProgressionSumOutOfInt(a, d);
		double nOutOgLong = findArithmeticProgressionSumOutOfLong(a, d);

		System.out.println("The step at which the amount goes beyond INT is " + nOutOfInt
				+ "\nThe step at which the amount goes beyond LONG is " + nOutOgLong);

	}
	
	public static int findArithmeticProgressionSumOutOfInt(int a, int d) {
		double limitMax = Integer.MAX_VALUE;
		System.out.println("MaxLimit = " + limitMax);
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

	
}
