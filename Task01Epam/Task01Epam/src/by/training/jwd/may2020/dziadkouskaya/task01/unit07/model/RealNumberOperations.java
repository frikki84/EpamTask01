package by.training.jwd.may2020.dziadkouskaya.task01.unit07.model;

public class RealNumberOperations {
	public static final int MULTIPLICATOR_FOR_THREE_IN_FRACTIONAL = 1000;

	public static int findIntegerPartOfRealNumber(double number) {

		return (int) number;
	}

	public static int findFractionalPartOfRealNumber(double number) {

		return (int) (number * MULTIPLICATOR_FOR_THREE_IN_FRACTIONAL  - (int) number * MULTIPLICATOR_FOR_THREE_IN_FRACTIONAL );

	}
	
	public static double createNewRealNumber(double number) {
		int digitPart = findIntegerPartOfRealNumber(number);
		int fractionalPart = findFractionalPartOfRealNumber(number);
		
		double result = fractionalPart + (double)digitPart/MULTIPLICATOR_FOR_THREE_IN_FRACTIONAL ;
		
		return result;
	}
}
