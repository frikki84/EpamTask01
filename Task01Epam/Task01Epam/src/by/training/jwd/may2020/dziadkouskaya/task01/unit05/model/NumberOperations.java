package by.training.jwd.may2020.dziadkouskaya.task01.unit05.model;

public class NumberOperations {

	public static final int MULTIPLER_FOR_THOUSANDS_NUMBER = 1000;

	public static int findSumOfDigitsOfNumber(ThreeDigitNumber number) {

		return number.getHundredsNumber() + number.getTensNumber() + number.getUnitsNumber();
	}

	public static int findMultiplicationOfDigitsOfNumber(ThreeDigitNumber number) {
		return number.getHundredsNumber() * number.getTensNumber() * number.getUnitsNumber();
	}

	public static int findNewNumberByChangingHundredsAndTens(ThreeDigitNumber number) {
		ThreeDigitNumber digitNumber = new ThreeDigitNumber(number.getTensNumber(), number.getHundredsNumber(),
				number.getUnitsNumber());
		return digitNumber.getThreeDigitNumber();
	}

	public static int findFourDigitNumberWithUnitsNumberAsNumberOfThousands(ThreeDigitNumber number) {
		return number.getUnitsNumber() * MULTIPLER_FOR_THOUSANDS_NUMBER
				+ number.getHundredsNumber() * number.MULTIPLER_FOR_HUNDRETS_NUMBER
				+ number.getTensNumber() * number.MULTIPLER_FOR_TENS_NUMBER 
				+ number.getUnitsNumber();
		
	}

}
