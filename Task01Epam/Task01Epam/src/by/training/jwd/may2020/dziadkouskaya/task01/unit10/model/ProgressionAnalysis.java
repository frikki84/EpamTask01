package by.training.jwd.may2020.dziadkouskaya.task01.unit10.model;

public class ProgressionAnalysis {

	public static boolean checkIncreasingProgression(int number, int nextNumber, boolean increasingProgression) {
		
		if (number > nextNumber) {

			increasingProgression = false;
		}
		return increasingProgression;

	}

	public static boolean checkSameNumbers(int number, int nextNumber, boolean sameNumbers) {
		if (number == nextNumber) {

			sameNumbers = true;
		}

		return sameNumbers;

	}

	public static boolean checkSignChange(int number, int nextNumber, boolean changeSign) {
		
		if (number * nextNumber > 0) {

			changeSign = false;
		}
		return changeSign;

	}
}
